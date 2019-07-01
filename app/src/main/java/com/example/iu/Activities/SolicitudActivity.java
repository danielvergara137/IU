package com.example.iu.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

public class SolicitudActivity extends AppCompatActivity {
    private Usuario usuario;
    private Reserva reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud);
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        reserva =(Reserva)getIntent().getSerializableExtra("reserva");
        System.out.println();
    }
}
