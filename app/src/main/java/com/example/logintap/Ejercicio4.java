package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio4 extends AppCompatActivity {

    private Spinner cboColores;
    private Button btnVolver;
    private TextView lblResultado;
    private String[] colores = {"Rojo", "Verde", "Azul"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        // Conectar elementos del layout
        cboColores = findViewById(R.id.cboColores);
        btnVolver = findViewById(R.id.btnVolver);
        lblResultado = findViewById(R.id.lblResultado);

        // Configurar el Spinner con los colores
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, colores);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cboColores.setAdapter(adapter);

        // Configurar evento cuando se selecciona un elemento (tu código original adaptado)
        cboColores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String mensaje = "El color elegido es ";
                mensaje = mensaje + cboColores.getSelectedItem().toString();
                lblResultado.setText(mensaje);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No hacer nada si no se selecciona nada
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio4.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
