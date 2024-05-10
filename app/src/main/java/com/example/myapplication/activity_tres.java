package com.example.myapplication;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class activity_tres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tres);

        Button btnenviarcorreo = findViewById(R.id.btnenviarcorreo);
        btnenviarcorreo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:cocaroluciaguadalupe@gmail.com"));
                startActivity(intent);
            }
        });

        Button btnllamar = findViewById(R.id.btnllamar);
        btnllamar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+54 2954-497786"));
                startActivity(intent);
            }
        });
    }
    public void volversegundaactivity(View view) {
        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }
    public void volverloginterceraactivity(View view) {
        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}