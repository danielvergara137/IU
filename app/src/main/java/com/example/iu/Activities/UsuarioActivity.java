package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iu.Entities.Usuario;
import com.example.iu.R;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class UsuarioActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    private ImageView foto;
    private TextView nombre;
    private TextView tipo;
    private Usuario usuario;
    private ZXingScannerView mScannerView;

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

    }

    public void salir(View view){
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }

    public void info(View view){
        Intent InfoActivity = new Intent(this, InfoUsuarioActivity.class);
        InfoActivity.putExtra("usuario_entidad", usuario);
        startActivity(InfoActivity);
    }
/*
    public void disp(View view){
        Intent DispActivity = new Intent(this, DispUsuarioActivity.class);
        startActivity(DispActivity);
    }

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
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Resultado del Scan");
        builder.setMessage(rawResult.getText());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        Intent intent = new Intent(this, InfoSalaUsuarioActivity.class);
        intent.putExtra("sala", rawResult.getText());
        intent.putExtra("usuario_entidad", usuario);
        startActivity(intent);

        mScannerView.resumeCameraPreview(this);

    }

}
