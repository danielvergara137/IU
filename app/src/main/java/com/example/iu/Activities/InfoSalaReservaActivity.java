package com.example.iu.Activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.iu.DB.DBQueries;
import com.example.iu.Entities.Reserva;
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

import java.util.ArrayList;
import java.util.List;

public class InfoSalaReservaActivity extends AppCompatActivity {

    private Usuario usuario;
    private Sala sala;
    private Spinner spinnermotivo;
    private Spinner spinnerramo;
    private Button reservar;
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
    private String ramo;
    private String horario;
    private String horarioreserva;
    private List<Button> Buttongrid;
    private List<Reserva> ReservasPendientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_reserva);
        getSupportActionBar().hide();

        usuario = (Usuario)getIntent().getSerializableExtra("usuario_entidad");
        sala = (Sala)getIntent().getSerializableExtra("sala");
        horario = sala.getHorario();
        ReservasPendientes = DBQueries.getReservasPendientesSala(sala.getNombre(), this);


        reservar = (Button)findViewById(R.id.InfoSalaReserva_reservar);
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

    public String UnirHorarios(String h1, String h2){
        String h3 = "";
        for(int i = 0; i < 50; i++){
            if(h1.charAt(i) == '1' || h2.charAt(i) == '1'){
                h3 += '1';
            }
            else{
                h3 += '0';
            }
        }
        return h3;
    }

    public String HorarioPendientes(){
        String h1 = ReservasPendientes.get(0).getHorario();
        for(int i = 1; i < ReservasPendientes.size(); i++){
            h1 = UnirHorarios(h1, ReservasPendientes.get(i).getHorario());
        }
        return h1;
    }

    public void marcar(View view){
        String Horario = HorarioPendientes();
        Horario = UnirHorarios(Horario, horario);
        int charpos = 0;
        for(int i = 0; i < Buttongrid.size(); i++){
            if(view == Buttongrid.get(i) && Horario.charAt(charpos) == '0'){
                if(!Buttongrid.get(i).isSelected()){
                    Buttongrid.get(i).setSelected(true);
                    Buttongrid.get(i).getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
                }
                else{
                    Buttongrid.get(i).setSelected(false);
                    Buttongrid.get(i).getBackground().clearColorFilter();
                }
            }
            charpos++;
        }
    }

    public String horarioreserva(){
        String horasreserva = "00000000000000000000000000000000000000000000000000";
        if(b11.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(0, '1');
            horasreserva = sb.toString();
        }
        if(b12.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(1, '1');
            horasreserva = sb.toString();
        }
        if(b13.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(2, '1');
            horasreserva = sb.toString();
        }
        if(b14.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(3, '1');
            horasreserva = sb.toString();
        }
        if(b15.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(4, '1');
            horasreserva = sb.toString();
        }
        if(b21.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(5, '1');
            horasreserva = sb.toString();
        }
        if(b22.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(6, '1');
            horasreserva = sb.toString();
        }
        if(b23.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(7, '1');
            horasreserva = sb.toString();
        }
        if(b24.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(8, '1');
            horasreserva = sb.toString();
        }
        if(b25.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(9, '1');
            horasreserva = sb.toString();
        }
        if(b31.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(10, '1');
            horasreserva = sb.toString();
        }
        if(b32.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(11, '1');
            horasreserva = sb.toString();
        }
        if(b33.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(12, '1');
            horasreserva = sb.toString();
        }
        if(b34.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(13, '1');
            horasreserva = sb.toString();
        }
        if(b35.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(14, '1');
            horasreserva = sb.toString();
        }
        if(b41.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(15, '1');
            horasreserva = sb.toString();
        }
        if(b42.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(16, '1');
            horasreserva = sb.toString();
        }
        if(b43.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(17, '1');
            horasreserva = sb.toString();
        }
        if(b44.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(18, '1');
            horasreserva = sb.toString();
        }
        if(b45.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(19, '1');
            horasreserva = sb.toString();
        }
        if(b51.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(20, '1');
            horasreserva = sb.toString();
        }
        if(b52.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(21, '1');
            horasreserva = sb.toString();
        }
        if(b53.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(22, '1');
            horasreserva = sb.toString();
        }
        if(b54.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(23, '1');
            horasreserva = sb.toString();
        }
        if(b55.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(24, '1');
            horasreserva = sb.toString();
        }
        if(b61.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(25, '1');
            horasreserva = sb.toString();
        }
        if(b62.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(26, '1');
            horasreserva = sb.toString();
        }
        if(b63.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(27, '1');
            horasreserva = sb.toString();
        }
        if(b64.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(28, '1');
            horasreserva = sb.toString();
        }
        if(b65.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(29, '1');
            horasreserva = sb.toString();
        }
        if(b71.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(30, '1');
            horasreserva = sb.toString();
        }
        if(b72.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(31, '1');
            horasreserva = sb.toString();
        }
        if(b73.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(32, '1');
            horasreserva = sb.toString();
        }
        if(b74.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(33, '1');
            horasreserva = sb.toString();
        }
        if(b75.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(34, '1');
            horasreserva = sb.toString();
        }
        if(b81.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(35, '1');
            horasreserva = sb.toString();
        }
        if(b82.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(36, '1');
            horasreserva = sb.toString();
        }
        if(b83.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(37, '1');
            horasreserva = sb.toString();
        }
        if(b84.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(38, '1');
            horasreserva = sb.toString();
        }
        if(b85.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(39, '1');
            horasreserva = sb.toString();
        }
        if(b91.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(40, '1');
            horasreserva = sb.toString();
        }
        if(b92.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(41, '1');
            horasreserva = sb.toString();
        }
        if(b93.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(42, '1');
            horasreserva = sb.toString();
        }
        if(b94.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(43, '1');
            horasreserva = sb.toString();
        }
        if(b95.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(44, '1');
            horasreserva = sb.toString();
        }
        if(b101.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(45, '1');
            horasreserva = sb.toString();
        }
        if(b102.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(46, '1');
            horasreserva = sb.toString();
        }
        if(b103.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(47, '1');
            horasreserva = sb.toString();
        }
        if(b104.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(48, '1');
            horasreserva = sb.toString();
        }
        if(b105.isSelected()){
            StringBuilder sb = new StringBuilder(horasreserva);
            sb.setCharAt(49, '1');
            horasreserva = sb.toString();
        }
        return horasreserva;
    }

    public void reservar(View view){
        if(view == reservar){
            horarioreserva = horarioreserva();
            motivo = spinnermotivo.getSelectedItem().toString();
            ramo = spinnerramo.getSelectedItem().toString();
            if(DBQueries.reservar(usuario.getUsername(),sala.getNombre(),ramo,motivo,horarioreserva,this)){
                Toast.makeText(this, "Solicitud de sala " + sala.getNombre() + " realizada con éxito", Toast.LENGTH_SHORT).show();
                Intent DocenteActivity = new Intent(this, DocenteActivity.class);
                DocenteActivity.putExtra("usuario_entidad", usuario);
                startActivity(DocenteActivity);
            }
        }
    }

    public void back(View view){
        super.onBackPressed();
    }

    public void home(View view){
        Intent DocenteActivity = new Intent(this, DocenteActivity.class);
        DocenteActivity.putExtra("usuario_entidad", usuario);
        startActivity(DocenteActivity);
    }
}
