package com.example.iu.Activities;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        username = (EditText)findViewById(R.id.MainActivity_username);
        password = (EditText)findViewById(R.id.MainActivity_password);

        if(!DBQueries.isUsuarioRegistrado("danielvergara", this)) {
            Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.escudo);

            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "db", null, 1);
            SQLiteDatabase db = admin.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("username", "danielvergara");
            values.put("nombre", "Daniel Vergara");
            values.put("password", "123456");
            values.put("tipo", "alumno");
            values.put("foto", DbBitmapUtility.getBytes(image));
            db.insert("usuario", null, values);
        }

    }


    public void Login(View view){
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();

        if (!str_username.isEmpty() && !str_password.isEmpty()) {
            if(DBQueries.LoginUsuario(str_username,str_password,this)){

                Usuario usuario = DBQueries.getUsuario(str_username, this);

                if(usuario.getTipo().equals("alumno")){
                    Intent UsuarioActivity = new Intent(this, UsuarioActivity.class);
                    UsuarioActivity.putExtra("usuario_entidad", usuario);
                    startActivity(UsuarioActivity);
                }
                else if(usuario.getTipo().equals("docente")){
                    Intent DocenteActivity = new Intent(this, DocenteActivity.class);
                    DocenteActivity.putExtra("usuario_entidad", usuario);
                    startActivity(DocenteActivity);
                }
                this.finish();
            }
        }
        else Toast.makeText(this, "Ingrese Usuario y/o Contraseña", Toast.LENGTH_SHORT).show();
    }

}

