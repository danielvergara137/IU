package com.example.iu.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {


    private static final String CREATE_TABLE_USUARIO= "CREATE TABLE usuario(username text PRIMARY KEY, " +
            "nombre text, password text, tipo text)";
    private static final String CREATE_TABLE_SALA= "CREATE TABLE sala(nombre text PRIMARY KEY, " +
            "facultad text, capacidad int, horario text)";
    private static final String CREATE_TABLE_RESERVA= "CREATE TABLE reserva(id int PRIMARY KEY, " +
            "docente text, sala text, ramo text, motivo text, horario int, estado text)";


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
        db.execSQL("insert into usuario values('admin','Juan Riquelme','admin','admin')");
        db.execSQL("insert into sala values('IS 2-1','Facultad de Ingeniería',45,'1000001')");
        db.execSQL("insert into sala values('IS 2-2','Facultad de Ingeniería',40,'0000001')");
        db.execSQL("insert into reserva values(1,'Gonzalo Rojas','IS 2-1','IS1','pq si',1,'aceptada')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
