package com.example.iu.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.iu.R;
import com.example.iu.Utilities.ExpLVAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InfoUsuarioActivity extends AppCompatActivity {

    private ExpandableListView expLV;
    private ExpLVAdapter adapter;
    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<String>> mapChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_usuario);

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

        adapter = new ExpLVAdapter(listCategoria, mapChild, this);
        expLV.setAdapter(adapter);
    }
}
