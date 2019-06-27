package com.example.iu.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Sala;
import com.example.iu.R;

public class InfoSalaUsuarioActivity extends AppCompatActivity {

    private Sala sala;
    private String nombre;
    private TextView vistanombre;
    private TextView vistafacultad;
    private TextView vistacapacidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_usuario);

        nombre = (String)getIntent().getSerializableExtra("sala");
        sala= DBQueries.getSala(nombre,this);
        vistanombre = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_sala);
        vistafacultad = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_facultad);
        vistacapacidad = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_capacidad);

        vistanombre.setText(sala.getNombre());
        vistafacultad.setText(sala.getFacultad());
        vistacapacidad.setText(String.valueOf(sala.getCapacidad()));
    }
}
