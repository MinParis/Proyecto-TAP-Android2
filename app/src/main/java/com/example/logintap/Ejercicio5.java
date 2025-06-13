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
import java.util.ArrayList;

public class Ejercicio5 extends AppCompatActivity {

    private Spinner cboNumeros;
    private Button btnPares, btnImpares, btnVaciar, btnVolver;
    private TextView lblResultado;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        // Conectar elementos del layout
        cboNumeros = findViewById(R.id.cboNumeros);
        btnPares = findViewById(R.id.btnPares);
        btnImpares = findViewById(R.id.btnImpares);
        btnVaciar = findViewById(R.id.btnVaciar);
        btnVolver = findViewById(R.id.btnVolver);
        lblResultado = findViewById(R.id.lblResultado);

        // Inicializar lista y adapter
        numeros = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, numeros);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cboNumeros.setAdapter(adapter);

        // Evento cuando se selecciona un número (tu código original adaptado)
        cboNumeros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (cboNumeros.getSelectedItem() != null) {
                    lblResultado.setText(cboNumeros.getSelectedItem().toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No hacer nada
            }
        });

        // Botón Pares (tu código original adaptado)
        btnPares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeros.clear();

                for (int i = 0; i < 10; i += 2) {
                    numeros.add("N° " + i);
                }

                adapter.notifyDataSetChanged();
                lblResultado.setText("Lista llenada con números pares");
            }
        });

        // Botón Impares (tu código original adaptado)
        btnImpares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeros.clear();

                for (int i = 1; i < 10; i += 2) {
                    numeros.add("N° " + i);
                }

                adapter.notifyDataSetChanged();
                lblResultado.setText("Lista llenada con números impares");
            }
        });

        // Botón Vaciar (tu código original adaptado)
        btnVaciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeros.clear();
                adapter.notifyDataSetChanged();
                lblResultado.setText("Lista vaciada");
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio5.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
