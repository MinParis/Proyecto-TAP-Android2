package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio3 extends AppCompatActivity {

    private ListView lstColores;
    private Button btnAceptar, btnVolver;
    private TextView lblResultado;
    private String[] colores = {"Rojo", "Verde", "Azul"};
    private int selectedPosition = -1;
    private String selectedColor = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        // Conectar elementos del layout
        lstColores = findViewById(R.id.lstColores);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnVolver = findViewById(R.id.btnVolver);
        lblResultado = findViewById(R.id.lblResultado);

        // Configurar el ListView con los colores
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_single_choice, colores);
        lstColores.setAdapter(adapter);

        // Configurar evento de selección en la lista
        lstColores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedPosition = position;
                selectedColor = colores[position];
                lstColores.setItemChecked(position, true);
            }
        });

        // Función del botón Aceptar (tu código original adaptado)
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje;

                if (selectedPosition == -1) {
                    mensaje = "No hay un color seleccionado.";
                } else {
                    mensaje = "El color seleccionado es: " + selectedColor;
                }

                lblResultado.setText(mensaje);
                Toast.makeText(Ejercicio3.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio3.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
