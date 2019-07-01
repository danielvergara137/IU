package com.example.iu.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {


    private static final String CREATE_TABLE_USUARIO= "CREATE TABLE usuario(username text PRIMARY KEY, " +
            "nombre text, password text, tipo text)";
    private static final String CREATE_TABLE_SALA= "CREATE TABLE sala(nombre text PRIMARY KEY, " +
            "facultad text, capacidad int, horario text)";
    private static final String CREATE_TABLE_RESERVA= "CREATE TABLE reserva(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            "docente text, sala text, ramo text, motivo text, horario text, estado text)";


    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USUARIO);
        db.execSQL(CREATE_TABLE_SALA);
        db.execSQL(CREATE_TABLE_RESERVA);
        db.execSQL("insert into usuario values('patsoto','Patricio Soto','alumno','alumno')");
        db.execSQL("insert into usuario values('gonzalorojas','Gonzalo Rojas','profe','docente')");
        db.execSQL("insert into usuario values('jorlopez','Jorge Lopez','profe','docente')");
        db.execSQL("insert into usuario values('dseco','Diego Seco','profe','docente')");
        db.execSQL("insert into usuario values('admin','Juan Riquelme','admin','admin')");
        db.execSQL("insert into sala values('IS 2-1','Facultad de Ingeniería',45,'10000100000000000000000000000000000000000000000011')");
        db.execSQL("insert into sala values('IS 2-2','Facultad de Ingeniería',40,'00000000000000000000000000000000000000000000000000')");
        db.execSQL("insert into sala values('IS 2-3','Facultad de Ingeniería',40,'00000000000000000000000000000000000000000000000000')");
        db.execSQL("insert into sala values('IS 3-1','Facultad de Ingeniería',20,'00000000000000000000000000000000000000000000000000')");
        db.execSQL("insert into sala values('Lab 1','Facultad de Quimica',15,'00000000000000000000000000000000000000000000000000')");
        db.execSQL("insert into sala values('Lab 2','Facultad de Quimica',10,'00000000000000000000000000000000000000000000000000')");
        db.execSQL("insert into sala values('Lab 3','Facultad de Quimica',20,'00000000000000000000000000000000000000000000000000')");
        db.execSQL("insert into reserva values(1,'gonzalorojas','IS 2-1','Ing. Software 1','pq si','10000100000000000000000000000000000000000000000000','aceptada')");
        db.execSQL("insert into reserva values(2,'dseco','IS 2-1','Estructuras de Datos','pq si','00000000000000000000000000000000000000000000000011','aceptada')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
