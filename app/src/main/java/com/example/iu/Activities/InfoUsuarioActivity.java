package com.example.iu.Activities;


import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;
import com.google.zxing.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class InfoUsuarioActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private ExpandableListView expLV;
    private Usuario usuario;
    private List<Sala> salas;
    private ExpLVAdapter adapter;
    private ArrayList<String> listCategoria;
    private Map<String, ArrayList<String>> mapChild;
    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_usuario);
        getSupportActionBar().hide();
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        System.out.println("nombre:   " + usuario.getNombre());
        expLV = (ExpandableListView) findViewById(R.id.expLV);
        listCategoria = new ArrayList<>();
        mapChild = new HashMap<>();
        cargarDatos();
    }

    private void cargarDatos(){
        ArrayList<String> Ingenieria = new ArrayList<>();
        ArrayList<String> Quimica = new ArrayList<>();

        listCategoria.add("Facultad de Ingenieria");
        listCategoria.add("Facultad de Quimica");

        salas = DBQueries.getSalas("Facultad de Ingeniería", this);
        for(int i=0; i< salas.size();i++) {
            Ingenieria.add(salas.get(i).getNombre());
        }
        salas = null;
        salas = DBQueries.getSalas("Facultad de Quimica", this);
        for(int i=0; i< salas.size();i++) {
            Quimica.add(salas.get(i).getNombre());
        }

        mapChild.put(listCategoria.get(0), Ingenieria);
        mapChild.put(listCategoria.get(1), Quimica);
        adapter = new ExpLVAdapter(listCategoria, mapChild, this, usuario);
        expLV.setAdapter(adapter);
    }

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

        mScannerView.resumeCameraPreview(this);

    }
}
