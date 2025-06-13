package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio2 extends AppCompatActivity {

    private RadioGroup grupoColores;
    private RadioButton optRojo, optVerde, optAzul;
    private Button btnAceptar, btnVolver;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        // Conectar elementos del layout
        grupoColores = findViewById(R.id.grupoColores);
        optRojo = findViewById(R.id.optRojo);
        optVerde = findViewById(R.id.optVerde);
        optAzul = findViewById(R.id.optAzul);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnVolver = findViewById(R.id.btnVolver);
        lblResultado = findViewById(R.id.lblResultado);

        // Función del botón Aceptar (tu código original adaptado)
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = "El color elegido es ";

                if (optRojo.isChecked()) {
                    mensaje = mensaje + "Rojo";
                } else if (optVerde.isChecked()) {
                    mensaje = mensaje + "Verde";
                } else if (optAzul.isChecked()) {
                    mensaje = mensaje + "Azul";
                }

                lblResultado.setText(mensaje);
                Toast.makeText(Ejercicio2.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio2.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}