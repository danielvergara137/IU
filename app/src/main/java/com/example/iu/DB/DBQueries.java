package com.example.iu.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

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
            } else Toast.makeText(context, "Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
        } else Toast.makeText(context, "No se encuentra registrado", Toast.LENGTH_SHORT).show();
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
            return usuario;
        }
        return null;
    }

    public static Sala getSala(String nombre, Context context){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String query = "SELECT nombre, facultad, capacidad FROM sala WHERE nombre = '" + nombre +"'";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()){
            Sala sala = new Sala(cursor.getString(0), cursor.getString(1), cursor.getInt(2));
            return sala;
        }
        return null;
    }
}
