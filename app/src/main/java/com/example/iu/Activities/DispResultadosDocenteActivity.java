package com.example.iu.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iu.Entities.Usuario;
import com.example.iu.R;

public class DispResultadosDocenteActivity extends AppCompatActivity {

    private Usuario usuario;
    private int capacidad;
    private String motivo;
    private String horario;
    private String ramo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_resultados_docente);
        usuario =(Usuario)getIntent().getSerializableExtra("usuario");
        capacidad =(int)getIntent().getSerializableExtra("capacidad");
        motivo =(String)getIntent().getSerializableExtra("motivo");
        horario =(String)getIntent().getSerializableExtra("horario");
        ramo =(String)getIntent().getSerializableExtra("ramo");
    }
}
