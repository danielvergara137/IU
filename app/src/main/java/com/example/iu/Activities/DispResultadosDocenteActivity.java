package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
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

    public String UnirHorarios(String h1, String h2){
        String h3 = "";
        for(int i = 0; i < 50; i++){
            if(h1.charAt(i) == '1' || h2.charAt(i) == '1'){
                h3 += '1';
            }
            else{
                h3 += '0';
            }
        }
        return h3;
    }

    public String HorarioPendientes(List<Reserva> ReservasPendientes){
        if(ReservasPendientes.size() != 0){
            String h1 = ReservasPendientes.get(0).getHorario();
            for(int i = 1; i < ReservasPendientes.size(); i++){
                h1 = UnirHorarios(h1, ReservasPendientes.get(i).getHorario());
            }
            return h1;
        }
        else{
            return "00000000000000000000000000000000000000000000000000";
        }
    }

    private void cargarDatos(){
        ArrayList<String> Ingenieria = new ArrayList<>();
        ArrayList<String> Quimica = new ArrayList<>();

        listCategoria.add("Facultad de Ingenieria");
        listCategoria.add("Facultad de Quimica");

        salas = DBQueries.getSalas("Facultad de Ingeniería", this);
        for(int i=0; i< salas.size();i++) {
            List<Reserva> ReservasPendientes = DBQueries.getReservasPendientesSala(salas.get(i).getNombre(), this);
            String Horario = HorarioPendientes(ReservasPendientes);
            Horario = UnirHorarios(Horario, salas.get(i).getHorario());
            if(horariocompatible(Horario) && salas.get(i).getCapacidad() >= capacidad) {
                System.out.println();
                Ingenieria.add(salas.get(i).getNombre() + "    Capacidad: " + salas.get(i).getCapacidad());
            }
        }
        salas = null;
        salas = DBQueries.getSalas("Facultad de Quimica", this);
        for(int i=0; i< salas.size();i++) {
            List<Reserva> ReservasPendientes = DBQueries.getReservasPendientesSala(salas.get(i).getNombre(), this);
            String Horario = HorarioPendientes(ReservasPendientes);
            Horario = UnirHorarios(Horario, salas.get(i).getHorario());
            if(horariocompatible(Horario) && salas.get(i).getCapacidad() >= capacidad) {
                Quimica.add(salas.get(i).getNombre() + "   Capacidad: " + salas.get(i).getCapacidad());
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
