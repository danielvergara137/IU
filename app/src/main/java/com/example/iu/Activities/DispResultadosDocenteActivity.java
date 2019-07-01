package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DispResultadosDocenteActivity extends AppCompatActivity {

    private Usuario usuario;
    private int capacidad;
    private String motivo;
    private String horario;
    private String ramo;
    private ExpandableListView expLV;
    private List<Sala> salas;
    private ExpLVAdapterReserva adapter;
    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<String>> mapChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_resultados_docente);
        usuario =(Usuario)getIntent().getSerializableExtra("usuario");
        capacidad =(int)getIntent().getSerializableExtra("capacidad");
        motivo =(String)getIntent().getSerializableExtra("motivo");
        horario =(String)getIntent().getSerializableExtra("horario");
        ramo =(String)getIntent().getSerializableExtra("ramo");
        expLV = (ExpandableListView)findViewById(R.id.expLV);
        listCategoria = new ArrayList<>();
        mapChild = new HashMap<>();
        cargarDatos();
    }

    private boolean horariocompatible(String horariosala){
        for(int i=0; i<50; i++){
            if(horario.charAt(i)==horariosala.charAt(i) && horario.charAt(i)=='1') return false;
        }
        return true;
    }

    private void cargarDatos(){
        ArrayList<String> Ingenieria = new ArrayList<>();
        ArrayList<String> Quimica = new ArrayList<>();

        listCategoria.add("Facultad de Ingenieria");
        listCategoria.add("Facultad de Quimica");

        salas = DBQueries.getSalas("Facultad de Ingeniería", this);
        for(int i=0; i< salas.size();i++) {
            if(horariocompatible(salas.get(i).getHorario()) && salas.get(i).getCapacidad() >= capacidad) {
                Ingenieria.add(salas.get(i).getNombre());
            }
        }
        salas = null;
        salas = DBQueries.getSalas("Facultad de Quimica", this);
        for(int i=0; i< salas.size();i++) {
            if(horariocompatible(salas.get(i).getHorario()) && salas.get(i).getCapacidad() >= capacidad) {
                Quimica.add(salas.get(i).getNombre());
            }
        }

        mapChild.put(listCategoria.get(0), Ingenieria);
        mapChild.put(listCategoria.get(1), Quimica);
        adapter = new ExpLVAdapterReserva(listCategoria, mapChild, this, usuario, ramo, motivo, horario);
        expLV.setAdapter(adapter);
    }

    public void back(View view){
        super.onBackPressed();
    }

    public void home(View view){
        Intent DocenteActivity = new Intent(this, DocenteActivity.class);
        DocenteActivity.putExtra("usuario_entidad", usuario);
        startActivity(DocenteActivity);
    }
}
