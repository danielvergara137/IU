package com.example.iu.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.iu.R;

public class InfoSalaUsuarioActivity extends AppCompatActivity {

    private String sala;
    private TextView nombresala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_usuario);

        sala = (String)getIntent().getSerializableExtra("sala");
        nombresala = (TextView)findViewById(R.id.textView);

        nombresala.setText(sala);
    }
}
