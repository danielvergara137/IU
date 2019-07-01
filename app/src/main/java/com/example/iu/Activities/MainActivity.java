package com.example.iu.Activities;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.iu.DB.AdminSQLiteOpenHelper;
import com.example.iu.DB.DBQueries;
import com.example.iu.DB.DbBitmapUtility;
import com.example.iu.Entities.Usuario;
import com.example.iu.R;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextInputLayout inputusername;
    private TextInputLayout inputpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        username = (EditText)findViewById(R.id.MainActivity_username);
        password = (EditText)findViewById(R.id.MainActivity_password);
        inputusername = (TextInputLayout)findViewById(R.id.MainActivity_inputusername);
        inputpassword = (TextInputLayout)findViewById(R.id.MainActivity_inputpassword);

    }

    @Override
    public void onBackPressed() {
    }

    public void Login(View view){
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();

        if (!str_username.isEmpty()){
            inputusername.setError(null);
            if(!str_password.isEmpty()) {
                inputpassword.setError(null);
                if (DBQueries.isUsuarioRegistrado(str_username, this)) {
                    inputusername.setError(null);
                    if (DBQueries.LoginUsuario(str_username, str_password, this)) {
                        inputpassword.setError(null);
                        Usuario usuario = DBQueries.getUsuario(str_username, this);

                        if (usuario.getTipo().equals("alumno")) {
                            Intent UsuarioActivity = new Intent(this, UsuarioActivity.class);
                            UsuarioActivity.putExtra("usuario_entidad", usuario);
                            startActivity(UsuarioActivity);
                        } else if (usuario.getTipo().equals("docente")) {
                            Intent DocenteActivity = new Intent(this, DocenteActivity.class);
                            DocenteActivity.putExtra("usuario_entidad", usuario);
                            startActivity(DocenteActivity);
                        } else if (usuario.getTipo().equals("admin")) {
                            Intent AdminActivity = new Intent(this, AdminActivity.class);
                            AdminActivity.putExtra("usuario_entidad", usuario);
                            startActivity(AdminActivity);
                        }
                        this.finish();
                    } else inputpassword.setError("Contraseña incorrecta");
                } else inputusername.setError("Usuario no registrado");
            } else inputpassword.setError("Ingrese contraseña");
        } else inputusername.setError("Ingrese un usuario");
    }

}

