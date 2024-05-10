package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.pantalla2);

    }
    public void acercade(View view) {

        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, activity_tres.class);
        startActivity(intent);
    }

    public void salirlogin(View view) {
        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}