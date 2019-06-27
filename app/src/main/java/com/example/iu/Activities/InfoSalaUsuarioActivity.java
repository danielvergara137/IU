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
    private TextView vistafacultad;
    private TextView vistacapacidad;
    private TextView vistaramo;
    private TextView vistaprofe;
    private TextView vistacorreo;
    private LinearLayout reserva;
    private Button boton19;
    private Button boton20;
    private Button boton21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_usuario);
        getSupportActionBar().hide();

        nombre = (String)getIntent().getSerializableExtra("sala");
        sala = DBQueries.getSala(nombre,this);
        horario = sala.getHorario();
        vistanombre = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_sala);
        vistafacultad = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_facultad);
        vistacapacidad = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_capacidad);
        vistaramo = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_ramo);
        vistaprofe = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_profe);
        vistaramo.setVisibility(View.INVISIBLE);
        vistaprofe.setVisibility(View.INVISIBLE);
        boton19 = (Button)findViewById(R.id.button19);
        boton20 = (Button)findViewById(R.id.button20);
        boton21 = (Button)findViewById(R.id.button21);

        vistanombre.setText(sala.getNombre());
        vistafacultad.setText(sala.getFacultad());
        vistacapacidad.setText(String.valueOf(sala.getCapacidad()));

        if(horario.charAt(0)=='1') {
            boton19.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(1)=='1') {
            boton20.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(2)=='1') {
            boton21.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }

    }

    public void mostrarInfo(View view){
        if(view==boton19) {
            Reserva reserva = DBQueries.getReservaInfo(nombre, 1, this);
            vistaramo.setText(reserva.getRamo());
            vistaprofe.setText(reserva.getDocente());
            vistaramo.setVisibility(View.VISIBLE);
            vistaprofe.setVisibility(View.VISIBLE);
        }
    }
}
