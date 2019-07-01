package com.example.iu.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.List;

public class DBQueries {

    public static boolean LoginUsuario(String username, String password, Context context){ //comingback es para iniciar automaticamente sesión
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT password FROM usuario WHERE username = '" + username +"'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            if (cursor.getString(0).compareTo(password)==0) {
                db.close();
                return true;
            }
        }
        db.close();
        return false;
    }

    public static boolean isUsuarioRegistrado(String username, Context context){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT * FROM usuario WHERE username = '" + username +"'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()) return true;
        else return false;
    }

    public static Usuario getUsuario(String username, Context context){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT username, nombre, password, tipo FROM usuario WHERE username = '" + username +"'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()){
            Usuario usuario = new Usuario(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
            db.close();
            return usuario;
        }
        db.close();
        return null;
    }

    public static Sala getSala(String nombre, Context context){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT nombre, facultad, capacidad, horario FROM sala WHERE nombre = '" + nombre +"'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()){
            Sala sala = new Sala(cursor.getString(0), cursor.getString(1), cursor.getInt(2), cursor.getString(3));
            db.close();
            return sala;
        }
        db.close();
        return null;
    }

    public static List<Reserva> getReservas(String sala, Context context ){
        List<Reserva> reservas = new ArrayList<>();
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT id, docente, sala, ramo, motivo, horario, estado FROM reserva WHERE sala = '" + sala + "'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                reservas.add(new Reserva(cursor.getInt(0), //id
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6)));
            } while (cursor.moveToNext());
        }
        db.close();
        return reservas;
    }

    public static List<Reserva> getReservasPendientes(Context context){
        List<Reserva> reservas = new ArrayList<>();
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT id, docente, sala, ramo, motivo, horario, estado FROM reserva WHERE estado = 'pendiente'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                reservas.add(new Reserva(cursor.getInt(0), //id
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6)));
            } while (cursor.moveToNext());
        }
        db.close();
        return reservas;
    }

    public static List<Sala> getSalas(String facultad, Context context ){
        List<Sala> salas = new ArrayList<>();
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT * FROM sala WHERE facultad = '" + facultad + "'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                salas.add(new Sala(cursor.getString(0), //id
                        cursor.getString(1),
                        cursor.getInt(2),
                        cursor.getString(3)));
            } while (cursor.moveToNext());
        }
        db.close();
        return salas;
    }

    public static void updateHorarioSala(String horarioreserva, String horariosala, String sala, Context context){
        String horario = "00000000000000000000000000000000000000000000000000";
        for(int i=0; i<50; i++){
            if(horarioreserva.charAt(i)=='1' || horariosala.charAt(i)=='1'){
                StringBuilder sb = new StringBuilder(horario);
                sb.setCharAt(i, '1');
                horario = sb.toString();
            }
        }
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "UPDATE sala SET horario = '" + horario + "' WHERE nombre = '" + sala + "'";
        db.execSQL(query);
        db.close();
    }

    public static boolean reservar(String docente, String sala, String ramo, String motivo, String horario, Context context){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "INSERT INTO reserva (docente, sala, ramo, motivo, horario, estado) VALUES ('" + docente + "', '" + sala + "', '" + ramo + "', '" + motivo + "', '" + horario + "', 'aceptada')";
        db.execSQL(query);
        db.close();
        return true;
    }

}
