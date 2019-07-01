package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iu.Entities.Usuario;
import com.example.iu.R;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class DocenteActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private ImageView foto;
    private TextView nombre;
    private TextView tipo;
    private Usuario usuario;
    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente);
        getSupportActionBar().hide();

        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");

        foto=(ImageView)findViewById(R.id.DocenteActivity_foto);
        nombre=(TextView)findViewById(R.id.DocenteActivity_nombre);
        tipo=(TextView)findViewById(R.id.DocenteActivity_tipo);
        foto.setImageResource(R.drawable.profe);
        nombre.setText(usuario.getNombre());
        tipo.setText("Docente");

    }

    @Override
    public void onBackPressed() {
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

    public void btnScan(View view){
        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void handleResult(Result rawResult) {
        Log.v("HandleResult", rawResult.getText());
        Intent intent = new Intent(this, InfoSalaDocenteActivity.class);
        intent.putExtra("sala", rawResult.getText());
        intent.putExtra("usuario_entidad", usuario);
        startActivity(intent);

        mScannerView.resumeCameraPreview(this);

    }

}
