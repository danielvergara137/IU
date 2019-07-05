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

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.List;

public class InfoSalaDocenteActivity extends AppCompatActivity {

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
    private Button reservar;
    private List<Reserva> ReservasPendientes;
    private List<Button> Buttongrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_docente);
        getSupportActionBar().hide();
        usuario =(Usuario)getIntent().getSerializableExtra("usuario_entidad");
        backButton = (ImageButton)findViewById(R.id.info_sala_button_back);
        nombre = (String)getIntent().getSerializableExtra("sala");
        sala = DBQueries.getSala(nombre,this);
        horario = sala.getHorario();
        reservas = DBQueries.getReservas(nombre, this);
        ReservasPendientes = DBQueries.getReservasPendientesSala(sala.getNombre(), this);
        vistanombre = (TextView)findViewById(R.id.InfoSalaDocenteActivity_sala);
        vistacapacidad = (TextView)findViewById(R.id.InfoSalaDocenteActivity_capacidad);
        vistaramo = (TextView)findViewById(R.id.InfoSalaDocenteActivity_ramo);
        vistaprofe = (TextView)findViewById(R.id.InfoSalaDocenteActivity_profe);
        vistacorreo = (TextView)findViewById(R.id.InfoSalaDocenteActivity_correo);
        reservar = (Button)findViewById(R.id.InfoSalaDocenteActivity_botonreservar);
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

        Buttongrid = new ArrayList<Button>();
        Buttongrid.add(b11);
        Buttongrid.add(b12);
        Buttongrid.add(b13);
        Buttongrid.add(b14);
        Buttongrid.add(b15);
        Buttongrid.add(b21);
        Buttongrid.add(b22);
        Buttongrid.add(b23);
        Buttongrid.add(b24);
        Buttongrid.add(b25);
        Buttongrid.add(b31);
        Buttongrid.add(b32);
        Buttongrid.add(b33);
        Buttongrid.add(b34);
        Buttongrid.add(b35);
        Buttongrid.add(b41);
        Buttongrid.add(b42);
        Buttongrid.add(b43);
        Buttongrid.add(b44);
        Buttongrid.add(b45);
        Buttongrid.add(b51);
        Buttongrid.add(b52);
        Buttongrid.add(b53);
        Buttongrid.add(b54);
        Buttongrid.add(b55);
        Buttongrid.add(b61);
        Buttongrid.add(b62);
        Buttongrid.add(b63);
        Buttongrid.add(b64);
        Buttongrid.add(b65);
        Buttongrid.add(b71);
        Buttongrid.add(b72);
        Buttongrid.add(b73);
        Buttongrid.add(b74);
        Buttongrid.add(b75);
        Buttongrid.add(b81);
        Buttongrid.add(b82);
        Buttongrid.add(b83);
        Buttongrid.add(b84);
        Buttongrid.add(b85);
        Buttongrid.add(b91);
        Buttongrid.add(b92);
        Buttongrid.add(b93);
        Buttongrid.add(b94);
        Buttongrid.add(b95);
        Buttongrid.add(b101);
        Buttongrid.add(b102);
        Buttongrid.add(b103);
        Buttongrid.add(b104);
        Buttongrid.add(b105);

        MostrarReservas(horario, "Aceptadas");
        MostrarReservasPendientes(ReservasPendientes);

    }

    public void MostrarReservas(String horario, String modo){
        int color;
        if(modo.equals("Aceptadas")){
            color = 0xFF00FF00;
        }
        else{
            color = 0xFFA60512;
        }
        int charpos = 0;
        for(int i = 0; i < Buttongrid.size(); i++){
            if(horario.charAt(charpos) == '1'){
                Buttongrid.get(i).getBackground().setColorFilter(color, PorterDuff.Mode.MULTIPLY);
            }
            charpos++;
        }
    }

    public void MostrarReservasPendientes(List<Reserva> l){
        for(int i = 0; i < l.size(); i++){
            MostrarReservas(l.get(i).getHorario(), "Pendientes");
        }
    }

    public void mostrarInfo(View view){
        int charpos = 0;
        for(int i = 0; i < Buttongrid.size(); i++){
            if(view == Buttongrid.get(i)){
                Reserva reserva = buscar(charpos);
                if(reserva != null){
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
            charpos++;
        }
    }

    public Reserva buscar(int hora){
        for(int i=0; i < reservas.size(); i++){
            Reserva reserva = reservas.get(i);
            String horasreserva = reserva.getHorario();
            if(horasreserva.charAt(hora)=='1' && (reserva.getEstado().equals("aceptada") || reserva.getEstado().equals("pendiente"))){
                return reserva;
            }
        }
        return null;
    }

    public void back(View view){
        super.onBackPressed();
    }

    public void home(View view){
        Intent DocenteActivity = new Intent(this, DocenteActivity.class);
        DocenteActivity.putExtra("usuario_entidad", usuario);
        startActivity(DocenteActivity);
    }

    public void reservar(View view){
        Intent ReservarActivity = new Intent(this, InfoSalaReservaActivity.class);
        ReservarActivity.putExtra("usuario_entidad", usuario);
        ReservarActivity.putExtra("sala", sala);
        startActivity(ReservarActivity);
    }
}

