package com.example.iu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.iu.R;

public class SolsActivity extends AppCompatActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sols);
        getSupportActionBar().hide();
        backButton = (ImageButton)findViewById(R.id.SolsActivity_button_back);

    }

    public void back(View view){
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }
}
