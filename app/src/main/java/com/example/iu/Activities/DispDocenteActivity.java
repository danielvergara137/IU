package com.example.iu.Activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.iu.Entities.Usuario;
import com.example.iu.R;

public class DispDocenteActivity extends AppCompatActivity {

    private Usuario usuario;
    private EditText capacidad;
    private Spinner spinnermotivo;
    private Spinner spinnerramo;
    private Button buscar;
    private String motivo;
    private String cap;
    private String horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_docente);
        getSupportActionBar().hide();
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        capacidad = (EditText)findViewById(R.id.DispDocenteActivity_capacidad);
        buscar = (Button)findViewById(R.id.DispDocenteActivity_buscar);

        spinnerramo = (Spinner) findViewById(R.id.DispDocenteActivity_ramos);
        ArrayAdapter<CharSequence> adapterramo = ArrayAdapter.createFromResource(this,
                R.array.ramos, android.R.layout.simple_spinner_item);
        adapterramo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerramo.setAdapter(adapterramo);

        spinnermotivo = (Spinner) findViewById(R.id.DispDocenteActivity_motivos);
        ArrayAdapter<CharSequence> adaptermotivo = ArrayAdapter.createFromResource(this,
                R.array.motivos, android.R.layout.simple_spinner_item);
        adaptermotivo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnermotivo.setAdapter(adaptermotivo);

    }

    public void marcar(View view){

        view.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
    }


    public void buscar(View view){
        if(view==buscar){
            Intent DispResultadosDocenteActivity = new Intent(this, DispResultadosDocenteActivity.class);
            DispResultadosDocenteActivity.putExtra("usuario", usuario);
            DispResultadosDocenteActivity.putExtra("capacidad", cap);
            DispResultadosDocenteActivity.putExtra("motivo", spinnermotivo.getSelectedItem().toString());
            DispResultadosDocenteActivity.putExtra("horario", spinnerramo.getSelectedItem().toString());
            startActivity(DispResultadosDocenteActivity);
        }
    }
}
