package com.example.iu.Activities;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Sala;
import com.example.iu.R;

public class InfoSalaUsuarioActivity extends AppCompatActivity {

    private Sala sala;
    private String nombre;
    private String horario;
    private TextView vistanombre;
    private TextView vistacapacidad;
    private TextView vistaramo;
    private TextView vistaprofe;
    private TextView vistacorreo;
    private LinearLayout reserva;
    private Button b10;
    private Button b20;
    private Button b30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_usuario);
        getSupportActionBar().hide();

        nombre = (String)getIntent().getSerializableExtra("sala");
        sala = DBQueries.getSala(nombre,this);
        horario = sala.getHorario();
        vistanombre = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_sala);
        vistacapacidad = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_capacidad);
        vistaramo = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_ramo);
        vistaprofe = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_profe);
        vistaramo.setVisibility(View.INVISIBLE);
        vistaprofe.setVisibility(View.INVISIBLE);
        b10 = (Button)findViewById(R.id.b10);
        b20 = (Button)findViewById(R.id.b20);
        b30 = (Button)findViewById(R.id.b30);

        vistanombre.setText("Sala: " + sala.getNombre());
        vistacapacidad.setText("Capacidad: " + String.valueOf(sala.getCapacidad()));

        if(horario.charAt(0)=='1') {
            b10.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(1)=='1') {
            b20.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(2)=='1') {
            b30.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }

    }

    public void mostrarInfo(View view){
        if(view==b10) {
            Reserva reserva = DBQueries.getReservaInfo(nombre, 1, this);
            vistaramo.setText(reserva.getRamo());
            vistaprofe.setText(reserva.getDocente());
            vistaramo.setVisibility(View.VISIBLE);
            vistaprofe.setVisibility(View.VISIBLE);
        }
    }
}
