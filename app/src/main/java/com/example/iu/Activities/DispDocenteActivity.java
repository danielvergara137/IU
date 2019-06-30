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
    private Button b00;
    private Button b01;
    private Button b02;
    private Button b03;
    private Button b04;
    private Button b05;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b20;
    private Button b21;
    private Button b22;
    private Button b23;
    private Button b24;
    private Button b25;
    private Button b30;
    private Button b31;
    private Button b32;
    private Button b33;
    private Button b34;
    private Button b35;
    private Button b40;
    private Button b41;
    private Button b42;
    private Button b43;
    private Button b44;
    private Button b45;
    private Button b50;
    private Button b51;
    private Button b52;
    private Button b53;
    private Button b54;
    private Button b55;
    private Button b60;
    private Button b61;
    private Button b62;
    private Button b63;
    private Button b64;
    private Button b65;
    private Button b70;
    private Button b71;
    private Button b72;
    private Button b73;
    private Button b74;
    private Button b75;
    private Button b80;
    private Button b81;
    private Button b82;
    private Button b83;
    private Button b84;
    private Button b85;
    private Button b90;
    private Button b91;
    private Button b92;
    private Button b93;
    private Button b94;
    private Button b95;
    private Button b100;
    private Button b101;
    private Button b102;
    private Button b103;
    private Button b104;
    private Button b105;
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
        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b03 = findViewById(R.id.b03);
        b04 = findViewById(R.id.b04);
        b05 = findViewById(R.id.b05);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);
        b25 = findViewById(R.id.b25);
        b30 = findViewById(R.id.b30);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        b34 = findViewById(R.id.b34);
        b35 = findViewById(R.id.b35);
        b40 = findViewById(R.id.b40);
        b41 = findViewById(R.id.b41);
        b42 = findViewById(R.id.b42);
        b43 = findViewById(R.id.b43);
        b44 = findViewById(R.id.b44);
        b45 = findViewById(R.id.b45);
        b50 = findViewById(R.id.b50);
        b51 = findViewById(R.id.b51);
        b52 = findViewById(R.id.b52);
        b53 = findViewById(R.id.b53);
        b54 = findViewById(R.id.b54);
        b55 = findViewById(R.id.b55);
        b60 = findViewById(R.id.b60);
        b61 = findViewById(R.id.b61);
        b62 = findViewById(R.id.b62);
        b63 = findViewById(R.id.b63);
        b64 = findViewById(R.id.b64);
        b65 = findViewById(R.id.b65);
        b70 = findViewById(R.id.b70);
        b71 = findViewById(R.id.b71);
        b72 = findViewById(R.id.b72);
        b73 = findViewById(R.id.b73);
        b74 = findViewById(R.id.b74);
        b75 = findViewById(R.id.b75);
        b80 = findViewById(R.id.b80);
        b81 = findViewById(R.id.b81);
        b82 = findViewById(R.id.b82);
        b83 = findViewById(R.id.b83);
        b84 = findViewById(R.id.b84);
        b85 = findViewById(R.id.b85);
        b90 = findViewById(R.id.b90);
        b91 = findViewById(R.id.b91);
        b92 = findViewById(R.id.b92);
        b93 = findViewById(R.id.b93);
        b94 = findViewById(R.id.b94);
        b95 = findViewById(R.id.b95);
        b100 = findViewById(R.id.b100);
        b101 = findViewById(R.id.b101);
        b102 = findViewById(R.id.b102);
        b103 = findViewById(R.id.b103);
        b104 = findViewById(R.id.b104);
        b105 = findViewById(R.id.b105);

        spinnerramo = (Spinner)findViewById(R.id.DispDocenteActivity_ramos);
        ArrayAdapter<CharSequence> adapterramo = ArrayAdapter.createFromResource(this,
                R.array.ramos, android.R.layout.simple_spinner_item);
        adapterramo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerramo.setAdapter(adapterramo);

        spinnermotivo = (Spinner)findViewById(R.id.DispDocenteActivity_motivos);
        ArrayAdapter<CharSequence> adaptermotivo = ArrayAdapter.createFromResource(this,
                R.array.motivos, android.R.layout.simple_spinner_item);
        adaptermotivo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnermotivo.setAdapter(adaptermotivo);

    }

    public void marcar(View view){
        if(view==b11){
            System.out.println(b11.isPressed());
            if(b11.isSelected()==false) {
                System.out.println(b11.isSelected());
                b11.setSelected(true);
                view.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            }
            else if(b11.isSelected()==true){
                b11.setSelected(false);
                view.getBackground().setColorFilter(0x33FFFFFF, PorterDuff.Mode.MULTIPLY);
            }
        }

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
