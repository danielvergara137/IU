package com.example.iu.Activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.List;

public class SolicitudActivity extends AppCompatActivity {

    private Sala sala;
    private Usuario usuario;
    private ImageButton backButton;
    private String nombre;
    private String horario;
    private TextView vistanombre;
    private TextView vistacapacidad;
    private TextView vistaramo;
    private TextView vistaprofe;
    private TextView vistacorreo;
    private List<Reserva> reservas;
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
    private Reserva reserva;
    private String horarioReserva;
    private Button botonAceptar;
    private Button botonRechazar;
    private TextView motivo;
    private TextView docente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud);
        getSupportActionBar().hide();
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        reserva =(Reserva)getIntent().getSerializableExtra("reserva");
        backButton = (ImageButton)findViewById(R.id.info_sala_button_back);
        sala = DBQueries.getSala(reserva.getSala(),this);
        horarioReserva = reserva.getHorario();
        horario = sala.getHorario();
        motivo = (TextView)findViewById(R.id.textView7);
        docente = (TextView)findViewById(R.id.textView8);
        motivo.setText("Motivo: " + reserva.getMotivo());
        docente.setText("Docente: " + reserva.getDocente());
        botonAceptar = (Button)findViewById(R.id.aceptarSol);
        botonRechazar = (Button)findViewById(R.id.rechazarSol);
        botonRechazar.setText("Rechazar");
        botonAceptar.setText("Aceptar");
        reservas = DBQueries.getReservas(nombre, this);
        vistanombre = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_sala);
        vistacapacidad = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_capacidad);
        vistaramo = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_ramo);
        vistaprofe = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_profe);
        vistacorreo = (TextView)findViewById(R.id.InfoSalaUsuarioActivity_correo);
        vistaramo.setVisibility(View.INVISIBLE);
        vistaprofe.setVisibility(View.INVISIBLE);
        vistacorreo.setVisibility(View.INVISIBLE);
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

        vistanombre.setText("Sala: " + sala.getNombre());
        vistacapacidad.setText("Capacidad: " + String.valueOf(sala.getCapacidad()));

        if(horarioReserva.charAt(0)=='1') {
            b11.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(1)=='1') {
            b12.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(2)=='1') {
            b13.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(3)=='1') {
            b14.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(4)=='1') {
            b15.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(5)=='1') {
            b21.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(6)=='1') {
            b22.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(7)=='1') {
            b23.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(8)=='1') {
            b24.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(9)=='1') {
            b25.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(10)=='1') {
            b31.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(11)=='1') {
            b32.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(12)=='1') {
            b33.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(13)=='1') {
            b34.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(14)=='1') {
            b35.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(15)=='1') {
            b41.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(16)=='1') {
            b42.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(17)=='1') {
            b43.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(18)=='1') {
            b44.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(19)=='1') {
            b45.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(20)=='1') {
            b51.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(21)=='1') {
            b52.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(22)=='1') {
            b53.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(23)=='1') {
            b54.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(24)=='1') {
            b55.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(25)=='1') {
            b61.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(26)=='1') {
            b62.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(27)=='1') {
            b63.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(28)=='1') {
            b64.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(29)=='1') {
            b65.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(30)=='1') {
            b71.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(31)=='1') {
            b72.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(32)=='1') {
            b73.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(33)=='1') {
            b74.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(34)=='1') {
            b75.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(35)=='1') {
            b81.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(36)=='1') {
            b82.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(37)=='1') {
            b83.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(38)=='1') {
            b84.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(39)=='1') {
            b85.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(40)=='1') {
            b91.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(41)=='1') {
            b92.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(42)=='1') {
            b93.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(43)=='1') {
            b94.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(44)=='1') {
            b95.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(45)=='1') {
            b101.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(46)=='1') {
            b102.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(47)=='1') {
            b103.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(48)=='1') {
            b104.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
        }
        if(horarioReserva.charAt(49)=='1') {
            b105.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(0)=='1') {
            b11.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(1)=='1') {
            b12.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(2)=='1') {
            b13.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(3)=='1') {
            b14.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(4)=='1') {
            b15.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(5)=='1') {
            b21.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(6)=='1') {
            b22.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(7)=='1') {
            b23.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(8)=='1') {
            b24.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(9)=='1') {
            b25.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(10)=='1') {
            b31.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(11)=='1') {
            b32.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(12)=='1') {
            b33.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(13)=='1') {
            b34.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(14)=='1') {
            b35.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(15)=='1') {
            b41.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(16)=='1') {
            b42.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(17)=='1') {
            b43.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(18)=='1') {
            b44.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(19)=='1') {
            b45.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(20)=='1') {
            b51.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(21)=='1') {
            b52.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(22)=='1') {
            b53.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(23)=='1') {
            b54.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(24)=='1') {
            b55.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(25)=='1') {
            b61.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(26)=='1') {
            b62.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(27)=='1') {
            b63.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(28)=='1') {
            b64.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(29)=='1') {
            b65.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(30)=='1') {
            b71.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(31)=='1') {
            b72.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(32)=='1') {
            b73.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(33)=='1') {
            b74.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(34)=='1') {
            b75.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(35)=='1') {
            b81.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(36)=='1') {
            b82.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(37)=='1') {
            b83.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(38)=='1') {
            b84.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(39)=='1') {
            b85.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(40)=='1') {
            b91.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(41)=='1') {
            b92.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(42)=='1') {
            b93.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(43)=='1') {
            b94.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(44)=='1') {
            b95.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(45)=='1') {
            b101.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(46)=='1') {
            b102.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(47)=='1') {
            b103.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(48)=='1') {
            b104.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        if(horario.charAt(49)=='1') {
            b105.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }

    }

    public void mostrarInfo(View view){
        if(view==b11) {
            Reserva reserva = buscar(0);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b12) {
            Reserva reserva = buscar(1);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b13) {
            Reserva reserva = buscar(2);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b14) {
            Reserva reserva = buscar(3);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b15) {
            Reserva reserva = buscar(4);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b21) {
            Reserva reserva = buscar(5);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b22) {
            Reserva reserva = buscar(6);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b23) {
            Reserva reserva = buscar(7);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b24) {
            Reserva reserva = buscar(8);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b25) {
            Reserva reserva = buscar(9);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b31) {
            Reserva reserva = buscar(10);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b32) {
            Reserva reserva = buscar(11);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b33) {
            Reserva reserva = buscar(12);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b34) {
            Reserva reserva = buscar(13);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b35) {
            Reserva reserva = buscar(14);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b41) {
            Reserva reserva = buscar(15);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b42) {
            Reserva reserva = buscar(16);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b43) {
            Reserva reserva = buscar(17);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b44) {
            Reserva reserva = buscar(18);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b45) {
            Reserva reserva = buscar(19);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b51) {
            Reserva reserva = buscar(20);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b52) {
            Reserva reserva = buscar(21);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b53) {
            Reserva reserva = buscar(22);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b54) {
            Reserva reserva = buscar(23);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b55) {
            Reserva reserva = buscar(24);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b61) {
            Reserva reserva = buscar(25);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b62) {
            Reserva reserva = buscar(26);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b63) {
            Reserva reserva = buscar(27);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b64) {
            Reserva reserva = buscar(28);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b65) {
            Reserva reserva = buscar(29);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b71) {
            Reserva reserva = buscar(30);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b72) {
            Reserva reserva = buscar(31);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b73) {
            Reserva reserva = buscar(32);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b74) {
            Reserva reserva = buscar(33);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b75) {
            Reserva reserva = buscar(34);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b81) {
            Reserva reserva = buscar(35);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b82) {
            Reserva reserva = buscar(36);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b83) {
            Reserva reserva = buscar(37);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b84) {
            Reserva reserva = buscar(38);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b85) {
            Reserva reserva = buscar(39);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b91) {
            Reserva reserva = buscar(40);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b92) {
            Reserva reserva = buscar(41);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b93) {
            Reserva reserva = buscar(42);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b94) {
            Reserva reserva = buscar(43);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b95) {
            Reserva reserva = buscar(44);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b101) {
            Reserva reserva = buscar(45);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b102) {
            Reserva reserva = buscar(46);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b103) {
            Reserva reserva = buscar(47);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b104) {
            Reserva reserva = buscar(48);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }
        else if(view==b105) {
            Reserva reserva = buscar(49);
            if(reserva != null) {
                Usuario docente = DBQueries.getUsuario(reserva.getDocente(), this);
                vistaramo.setText(reserva.getRamo());
                vistaprofe.setText(docente.getNombre());
                vistacorreo.setText(docente.getUsername() + "@udec.cl");
                vistaramo.setVisibility(View.VISIBLE);
                vistaprofe.setVisibility(View.VISIBLE);
                vistacorreo.setVisibility(View.VISIBLE);
            }
            else{
                vistaramo.setVisibility(View.INVISIBLE);
                vistaprofe.setVisibility(View.INVISIBLE);
                vistacorreo.setVisibility(View.INVISIBLE);
            }
        }

    }

    public Reserva buscar(int hora){
        System.out.println(reservas.size());
        for(int i=0; i < reservas.size(); i++){
            Reserva reserva = reservas.get(i);
            String horasreserva = reserva.getHorario();
            if(horasreserva.charAt(hora)=='1' && reserva.getEstado().equals("aceptada")){
                return reserva;
            }
        }
        return null;
    }
    public void back(View view){
        super.onBackPressed();
    }

    public void home(View view){
        Intent AdminActivity = new Intent(this, AdminActivity.class);
        AdminActivity.putExtra("usuario_entidad", usuario);
        startActivity(AdminActivity);
    }

    public void Aceptar(View view){
        DBQueries.updateEstadoReserva(reserva.getId(), "aceptada", this);
        DBQueries.updateHorarioSala(horarioReserva, horario, reserva.getSala(), this);
        Intent SolsActivity = new Intent(this, SolsActivity.class);
        SolsActivity.putExtra("usuario_entidad", usuario);
        startActivity(SolsActivity);
        Toast.makeText(this, "Solicitud de sala aceptada con éxito", Toast.LENGTH_SHORT).show();
    }

    public void Rechazar(View view){
        DBQueries.updateEstadoReserva(reserva.getId(), "rechazada", this);
        Intent SolsActivity = new Intent(this, SolsActivity.class);
        SolsActivity.putExtra("usuario_entidad", usuario);
        startActivity(SolsActivity);
        Toast.makeText(this, "Solicitud de sala rechazada con éxito", Toast.LENGTH_SHORT).show();
    }
}
