package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Conectar todos los botones
        Button btnEjercicio1 = findViewById(R.id.btnEjercicio1);
        Button btnEjercicio2 = findViewById(R.id.btnEjercicio2);
        Button btnEjercicio3 = findViewById(R.id.btnEjercicio3);
        Button btnEjercicio4 = findViewById(R.id.btnEjercicio4);
        Button btnEjercicio5 = findViewById(R.id.btnEjercicio5);
        Button btnEjercicio6 = findViewById(R.id.btnEjercicio6);
        Button btnEjercicio7 = findViewById(R.id.btnEjercicio7);
        Button btnEjercicio8 = findViewById(R.id.btnEjercicio8);
        Button btnEjercicio9 = findViewById(R.id.btnEjercicio9);
        Button btnEjercicio10 = findViewById(R.id.btnEjercicio10);
        Button btnVolver = findViewById(R.id.btnVolver);

        // Configurar eventos de clic para cada botón
        btnEjercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio1.class);
                startActivity(intent);
            }
        });

        btnEjercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio2.class);
                startActivity(intent);
            }
        });

        btnEjercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio3.class);
                startActivity(intent);
            }
        });

        btnEjercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio4.class);
                startActivity(intent);
            }
        });

        btnEjercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio5.class);
                startActivity(intent);
            }
        });

        btnEjercicio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio6.class);
                startActivity(intent);
            }
        });

        btnEjercicio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio7.class);
                startActivity(intent);
            }
        });

        btnEjercicio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio8.class);
                startActivity(intent);
            }
        });

        btnEjercicio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio9.class);
                startActivity(intent);
            }
        });

        btnEjercicio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Ejercicio10.class);
                startActivity(intent);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}