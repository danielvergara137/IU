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
import com.example.iu.Entities.Sala;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sala_reserva);
        getSupportActionBar().hide();

        usuario = (Usuario)getIntent().getSerializableExtra("usuario_entidad");
        sala = (Sala)getIntent().getSerializableExtra("sala");
        horario = sala.getHorario();

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

    public void marcar(View view){
        if(view==b11 && horario.charAt(0)=='0'){
            if(b11.isSelected()==false) {
                b11.setSelected(true);
                b11.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b11.isSelected()==true){
                b11.setSelected(false);
                b11.getBackground().clearColorFilter();
            }
        }
        else if(view==b12 && horario.charAt(1)=='0'){
            if(b12.isSelected()==false) {
                b12.setSelected(true);
                b12.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b12.isSelected()==true){
                b12.setSelected(false);
                b12.getBackground().clearColorFilter();
            }
        }
        else if(view==b13 && horario.charAt(2)=='0'){
            if(b13.isSelected()==false) {
                b13.setSelected(true);
                b13.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b13.isSelected()==true){
                b13.setSelected(false);
                b13.getBackground().clearColorFilter();
            }
        }
        else if(view==b14 && horario.charAt(3)=='0'){
            if(b14.isSelected()==false) {
                b14.setSelected(true);
                b14.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b14.isSelected()==true){
                b14.setSelected(false);
                b14.getBackground().clearColorFilter();
            }
        }
        else if(view==b15 && horario.charAt(4)=='0'){
            if(b15.isSelected()==false) {
                b15.setSelected(true);
                b15.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b15.isSelected()==true){
                b15.setSelected(false);
                b15.getBackground().clearColorFilter();
            }
        }
        else if(view==b21 && horario.charAt(5)=='0'){
            if(b21.isSelected()==false) {
                b21.setSelected(true);
                b21.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b21.isSelected()==true){
                b21.setSelected(false);
                b21.getBackground().clearColorFilter();
            }
        }
        else if(view==b22 && horario.charAt(6)=='0'){
            if(b22.isSelected()==false) {
                b22.setSelected(true);
                b22.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b22.isSelected()==true){
                b22.setSelected(false);
                b22.getBackground().clearColorFilter();
            }
        }
        else if(view==b23 && horario.charAt(7)=='0'){
            if(b23.isSelected()==false) {
                b23.setSelected(true);
                b23.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b23.isSelected()==true){
                b23.setSelected(false);
                b23.getBackground().clearColorFilter();
            }
        }
        else if(view==b24 && horario.charAt(8)=='0'){
            if(b24.isSelected()==false) {
                b24.setSelected(true);
                b24.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b24.isSelected()==true){
                b24.setSelected(false);
                b24.getBackground().clearColorFilter();
            }
        }
        else if(view==b25 && horario.charAt(9)=='0'){
            if(b25.isSelected()==false) {
                b25.setSelected(true);
                b25.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b25.isSelected()==true){
                b25.setSelected(false);
                b25.getBackground().clearColorFilter();
            }
        }
        else if(view==b31 && horario.charAt(10)=='0'){
            if(b31.isSelected()==false) {
                b31.setSelected(true);
                b31.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b31.isSelected()==true){
                b31.setSelected(false);
                b31.getBackground().clearColorFilter();
            }
        }
        else if(view==b32 && horario.charAt(11)=='0'){
            if(b32.isSelected()==false) {
                b32.setSelected(true);
                b32.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b32.isSelected()==true){
                b32.setSelected(false);
                b32.getBackground().clearColorFilter();
            }
        }
        else if(view==b33 && horario.charAt(12)=='0'){
            if(b33.isSelected()==false) {
                b33.setSelected(true);
                b33.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b33.isSelected()==true){
                b33.setSelected(false);
                b33.getBackground().clearColorFilter();
            }
        }
        else if(view==b34 && horario.charAt(13)=='0'){
            if(b34.isSelected()==false) {
                b34.setSelected(true);
                b34.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b34.isSelected()==true){
                b34.setSelected(false);
                b34.getBackground().clearColorFilter();
            }
        }
        else if(view==b35 && horario.charAt(14)=='0'){
            if(b35.isSelected()==false) {
                b35.setSelected(true);
                b35.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b35.isSelected()==true){
                b35.setSelected(false);
                b35.getBackground().clearColorFilter();
            }
        }
        else if(view==b41 && horario.charAt(15)=='0'){
            if(b41.isSelected()==false) {
                b41.setSelected(true);
                b41.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b41.isSelected()==true){
                b41.setSelected(false);
                b41.getBackground().clearColorFilter();
            }
        }
        else if(view==b42 && horario.charAt(16)=='0'){
            if(b42.isSelected()==false) {
                b42.setSelected(true);
                b42.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b42.isSelected()==true){
                b42.setSelected(false);
                b42.getBackground().clearColorFilter();
            }
        }
        else if(view==b43 && horario.charAt(17)=='0'){
            if(b43.isSelected()==false) {
                b43.setSelected(true);
                b43.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b43.isSelected()==true){
                b43.setSelected(false);
                b43.getBackground().clearColorFilter();
            }
        }
        else if(view==b44 && horario.charAt(18)=='0'){
            if(b44.isSelected()==false) {
                b44.setSelected(true);
                b44.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b44.isSelected()==true){
                b44.setSelected(false);
                b44.getBackground().clearColorFilter();
            }
        }
        else if(view==b45 && horario.charAt(19)=='0'){
            if(b45.isSelected()==false) {
                b45.setSelected(true);
                b45.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b45.isSelected()==true){
                b45.setSelected(false);
                b45.getBackground().clearColorFilter();
            }
        }
        else if(view==b51 && horario.charAt(20)=='0'){
            if(b51.isSelected()==false) {
                b51.setSelected(true);
                b51.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b51.isSelected()==true){
                b51.setSelected(false);
                b51.getBackground().clearColorFilter();
            }
        }
        else if(view==b52 && horario.charAt(21)=='0'){
            if(b52.isSelected()==false) {
                b52.setSelected(true);
                b52.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b52.isSelected()==true){
                b52.setSelected(false);
                b52.getBackground().clearColorFilter();
            }
        }
        else if(view==b53 && horario.charAt(22)=='0'){
            if(b53.isSelected()==false) {
                b53.setSelected(true);
                b53.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b53.isSelected()==true){
                b53.setSelected(false);
                b53.getBackground().clearColorFilter();
            }
        }
        else if(view==b54 && horario.charAt(23)=='0'){
            if(b54.isSelected()==false) {
                b54.setSelected(true);
                b54.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b54.isSelected()==true){
                b54.setSelected(false);
                b54.getBackground().clearColorFilter();
            }
        }
        else if(view==b55 && horario.charAt(24)=='0'){
            if(b55.isSelected()==false) {
                b55.setSelected(true);
                b55.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b55.isSelected()==true){
                b55.setSelected(false);
                b55.getBackground().clearColorFilter();
            }
        }
        else if(view==b61 && horario.charAt(25)=='0'){
            if(b61.isSelected()==false) {
                b61.setSelected(true);
                b61.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b61.isSelected()==true){
                b61.setSelected(false);
                b61.getBackground().clearColorFilter();
            }
        }
        else if(view==b62 && horario.charAt(26)=='0'){
            if(b62.isSelected()==false) {
                b62.setSelected(true);
                b62.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b62.isSelected()==true){
                b62.setSelected(false);
                b62.getBackground().clearColorFilter();
            }
        }
        else if(view==b63 && horario.charAt(27)=='0'){
            if(b63.isSelected()==false) {
                b63.setSelected(true);
                b63.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b63.isSelected()==true){
                b63.setSelected(false);
                b63.getBackground().clearColorFilter();
            }
        }
        else if(view==b64 && horario.charAt(28)=='0'){
            if(b64.isSelected()==false) {
                b64.setSelected(true);
                b64.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b64.isSelected()==true){
                b64.setSelected(false);
                b64.getBackground().clearColorFilter();
            }
        }
        else if(view==b65 && horario.charAt(29)=='0'){
            if(b65.isSelected()==false) {
                b65.setSelected(true);
                b65.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b65.isSelected()==true){
                b65.setSelected(false);
                b65.getBackground().clearColorFilter();
            }
        }
        else if(view==b71 && horario.charAt(30)=='0'){
            if(b71.isSelected()==false) {
                b71.setSelected(true);
                b71.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b71.isSelected()==true){
                b71.setSelected(false);
                b71.getBackground().clearColorFilter();
            }
        }
        else if(view==b72 && horario.charAt(31)=='0'){
            if(b72.isSelected()==false) {
                b72.setSelected(true);
                b72.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b72.isSelected()==true){
                b72.setSelected(false);
                b72.getBackground().clearColorFilter();
            }
        }
        else if(view==b73 && horario.charAt(32)=='0'){
            if(b73.isSelected()==false) {
                b73.setSelected(true);
                b73.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b73.isSelected()==true){
                b73.setSelected(false);
                b73.getBackground().clearColorFilter();
            }
        }
        else if(view==b74 && horario.charAt(33)=='0'){
            if(b74.isSelected()==false) {
                b74.setSelected(true);
                b74.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b74.isSelected()==true){
                b74.setSelected(false);
                b74.getBackground().clearColorFilter();
            }
        }
        else if(view==b75 && horario.charAt(34)=='0'){
            if(b75.isSelected()==false) {
                b75.setSelected(true);
                b75.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b75.isSelected()==true){
                b75.setSelected(false);
                b75.getBackground().clearColorFilter();
            }
        }
        else if(view==b81 && horario.charAt(35)=='0'){
            if(b81.isSelected()==false) {
                b81.setSelected(true);
                b81.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b81.isSelected()==true){
                b81.setSelected(false);
                b81.getBackground().clearColorFilter();
            }
        }
        else if(view==b82 && horario.charAt(36)=='0'){
            if(b82.isSelected()==false) {
                b82.setSelected(true);
                b82.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b82.isSelected()==true){
                b82.setSelected(false);
                b82.getBackground().clearColorFilter();
            }
        }
        else if(view==b83 && horario.charAt(37)=='0'){
            if(b83.isSelected()==false) {
                b83.setSelected(true);
                b83.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b83.isSelected()==true){
                b83.setSelected(false);
                b83.getBackground().clearColorFilter();
            }
        }
        else if(view==b84 && horario.charAt(38)=='0'){
            if(b84.isSelected()==false) {
                b84.setSelected(true);
                b84.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b84.isSelected()==true){
                b84.setSelected(false);
                b84.getBackground().clearColorFilter();
            }
        }
        else if(view==b85 && horario.charAt(39)=='0'){
            if(b85.isSelected()==false) {
                b85.setSelected(true);
                b85.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b85.isSelected()==true){
                b85.setSelected(false);
                b85.getBackground().clearColorFilter();
            }
        }
        else if(view==b91 && horario.charAt(40)=='0'){
            if(b91.isSelected()==false) {
                b91.setSelected(true);
                b91.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b91.isSelected()==true){
                b91.setSelected(false);
                b91.getBackground().clearColorFilter();
            }
        }
        else if(view==b92 && horario.charAt(41)=='0'){
            if(b92.isSelected()==false) {
                b92.setSelected(true);
                b92.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b92.isSelected()==true){
                b92.setSelected(false);
                b92.getBackground().clearColorFilter();
            }
        }
        else if(view==b93 && horario.charAt(42)=='0'){
            if(b93.isSelected()==false) {
                b93.setSelected(true);
                b93.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b93.isSelected()==true){
                b93.setSelected(false);
                b93.getBackground().clearColorFilter();
            }
        }
        else if(view==b94 && horario.charAt(43)=='0'){
            if(b94.isSelected()==false) {
                b94.setSelected(true);
                b94.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b94.isSelected()==true){
                b94.setSelected(false);
                b94.getBackground().clearColorFilter();
            }
        }
        else if(view==b95 && horario.charAt(44)=='0'){
            if(b95.isSelected()==false) {
                b95.setSelected(true);
                b95.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b95.isSelected()==true){
                b95.setSelected(false);
                b95.getBackground().clearColorFilter();
            }
        }
        else if(view==b101 && horario.charAt(45)=='0'){
            if(b101.isSelected()==false) {
                b101.setSelected(true);
                b101.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b101.isSelected()==true){
                b101.setSelected(false);
                b101.getBackground().clearColorFilter();
            }
        }
        else if(view==b102 && horario.charAt(46)=='0'){
            if(b102.isSelected()==false) {
                b102.setSelected(true);
                b102.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b102.isSelected()==true){
                b102.setSelected(false);
                b102.getBackground().clearColorFilter();
            }
        }
        else if(view==b103 && horario.charAt(47)=='0'){
            if(b103.isSelected()==false) {
                b103.setSelected(true);
                b103.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b103.isSelected()==true){
                b103.setSelected(false);
                b103.getBackground().clearColorFilter();
            }
        }
        else if(view==b104 && horario.charAt(48)=='0'){
            if(b104.isSelected()==false) {
                b104.setSelected(true);
                b104.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b104.isSelected()==true){
                b104.setSelected(false);
                b104.getBackground().clearColorFilter();
            }
        }
        else if(view==b105 && horario.charAt(49)=='0'){
            if(b105.isSelected()==false) {
                b105.setSelected(true);
                b105.getBackground().setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
            }
            else if(b105.isSelected()==true){
                b105.setSelected(false);
                b105.getBackground().clearColorFilter();
            }
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
                DBQueries.updateHorarioSala(horarioreserva, sala.getHorario(), sala.getNombre(), this);
                Toast.makeText(this, "Reserva de sala " + sala.getNombre() + "realizada con éxito", Toast.LENGTH_SHORT).show();
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
