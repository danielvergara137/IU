package com.example.iu.Activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InfoUsuarioActivity extends AppCompatActivity {

    private ExpandableListView expLV;
    private Usuario usuario;
    private ExpLVAdapter adapter;
    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<String>> mapChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_usuario);
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        System.out.println("nombre:   " + usuario.getNombre());
        expLV = (ExpandableListView) findViewById(R.id.expLV);
        listCategoria = new ArrayList<>();
        mapChild = new HashMap<>();

        cargarDatos();
    }

    private void cargarDatos(){
        ArrayList<String> Ingenieria = new ArrayList<>();
        ArrayList<String> Quimica = new ArrayList<>();

        listCategoria.add("Facultad de Ingenieria");
        listCategoria.add("Facultad de Quimica");

        Ingenieria.add("IS 2-1");
        Ingenieria.add("IS 2-2");
        Ingenieria.add("IS 2-3");
        Ingenieria.add("IS 3-1");

        Quimica.add("Lab 1");
        Quimica.add("Lab 2");
        Quimica.add("Lab 3");

        mapChild.put(listCategoria.get(0), Ingenieria);
        mapChild.put(listCategoria.get(1), Quimica);
        System.out.println("wena");
        adapter = new ExpLVAdapter(listCategoria, mapChild, this, usuario);
        System.out.println("wena");
        expLV.setAdapter(adapter);
    }

}
