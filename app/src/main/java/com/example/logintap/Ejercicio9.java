package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio9 extends AppCompatActivity {

    // Variable para contar coches (como en tu código original)
    int coches;

    private Button btnEntro, btnSalio, btnReiniciar, btnVolver;
    private TextView lblCoches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        // Inicializar variable (como en tu código original)
        coches = 0;

        // Conectar elementos del layout
        btnEntro = findViewById(R.id.btnEntro);
        btnSalio = findViewById(R.id.btnSalio);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        btnVolver = findViewById(R.id.btnVolver);
        lblCoches = findViewById(R.id.lblCoches);

        // Función del botón "Entró un coche" (tu código original)
        btnEntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tu código original: coches=coches+1; lblCoches.setText("" + coches);
                coches = coches + 1;
                lblCoches.setText("" + coches);

                // Agregar un toque visual
                Toast.makeText(Ejercicio9.this, "🚗 Coche entró al parking", Toast.LENGTH_SHORT).show();
            }
        });

        // Función del botón "Salió un coche" (tu código original)
        btnSalio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tu código original: if (coches>0) { coches=coches-1; lblCoches.setText("" +coches); }
                if (coches > 0) {
                    coches = coches - 1;
                    lblCoches.setText("" + coches);
                    Toast.makeText(Ejercicio9.this, "🚗 Coche salió del parking", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Ejercicio9.this, "❌ No hay coches para salir", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Función del botón "Reiniciar" (tu código original)
        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tu código original: coches=0; lblCoches.setText("0");
                coches = 0;
                lblCoches.setText("0");
                Toast.makeText(Ejercicio9.this, "🔄 Parking reiniciado", Toast.LENGTH_SHORT).show();
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio9.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}