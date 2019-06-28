package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iu.Entities.Usuario;
import com.example.iu.R;

public class DocenteActivity extends AppCompatActivity {

    private ImageView foto;
    private TextView nombre;
    private TextView tipo;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        getSupportActionBar().hide();

        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");

        foto=(ImageView)findViewById(R.id.UsuarioActivity_foto);
        nombre=(TextView)findViewById(R.id.UsuarioActivity_nombre);
        tipo=(TextView)findViewById(R.id.UsuarioActivity_tipo);
        foto.setImageResource(R.drawable.perfil);
        nombre.setText(usuario.getNombre());
        tipo.setText("Docente");

    }

    public void salir(View view){
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }

    public void info(View view){
        Intent InfoActivity = new Intent(this, InfoDocenteActivity.class);
        InfoActivity.putExtra("usuario_entidad", usuario);
        startActivity(InfoActivity);
    }

    public void disp(View view){
        System.out.println("hola");
        Intent DispActivity = new Intent(this, DispDocenteActivity.class);
        DispActivity.putExtra("usuario_entidad", usuario);
        startActivity(DispActivity);
    }
/*
    public void mapa(View view){
        Intent MapaActivity = new Intent(this, MapaUsuarioActivity.class);
        startActivity(MapaActivity);
    }*/
}
