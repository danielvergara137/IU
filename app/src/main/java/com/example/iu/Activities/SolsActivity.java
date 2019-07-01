package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolsActivity extends AppCompatActivity {

    private ImageButton backButton;
    private ExpandableListView expLV;
    private ArrayList<String> listCategoria;
    private List<Reserva> reservas;
    private ExpLVAdapterSolicitudes adapter;
    private Map<String, ArrayList<Integer>> mapChild;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sols);
        getSupportActionBar().hide();
        expLV = (ExpandableListView) findViewById(R.id.expLV);
        listCategoria = new ArrayList<>();
        mapChild = new HashMap<>();
        backButton = (ImageButton)findViewById(R.id.SolsActivity_button_back);
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        cargarDatos();

    }

    public void back(View view){
        super.onBackPressed();
    }

    public void home(View view){
        Intent AdminActivity = new Intent(this, AdminActivity.class);
        AdminActivity.putExtra("usuario_entidad", usuario);
        startActivity(AdminActivity);
    }

    public void cargarDatos(){
        ArrayList<Integer> Solicitudes = new ArrayList<>();
        listCategoria.add("Solicitudes");
        reservas = DBQueries.getReservasPendientes(this);
        System.out.println(reservas.size());
        for(int i=0; i< reservas.size();i++) {
            Solicitudes.add(reservas.get(i).getId());
        }
        mapChild.put(listCategoria.get(0), Solicitudes);
        adapter = new ExpLVAdapterSolicitudes(listCategoria, mapChild, this, usuario, reservas);
        expLV.setAdapter(adapter);
    }
}
