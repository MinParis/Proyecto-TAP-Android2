package com.example.logintap;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio10 extends AppCompatActivity {

    private RadioGroup grupoColores;
    private RadioButton optRojo, optVerde, optAzul;
    private Button btnAceptar, btnVolver;
    private TextView lblResultado;
    private View vistaColorSeleccionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);

        // Conectar elementos del layout
        grupoColores = findViewById(R.id.grupoColores);
        optRojo = findViewById(R.id.optRojo);
        optVerde = findViewById(R.id.optVerde);
        optAzul = findViewById(R.id.optAzul);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnVolver = findViewById(R.id.btnVolver);
        lblResultado = findViewById(R.id.lblResultado);
        vistaColorSeleccionado = findViewById(R.id.vistaColorSeleccionado);

        // Configurar Rojo como seleccionado por defecto (como en tu código original)
        optRojo.setChecked(true);
        lblResultado.setText("Color elegido: Rojo");
        vistaColorSeleccionado.setBackgroundColor(Color.RED);

        // Función del botón Aceptar (tu código original adaptado)
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tu código original adaptado:
                String mensaje = "Color elegido: ";
                int colorSeleccionado = Color.GRAY; // Color por defecto

                if (optRojo.isChecked()) {
                    mensaje = mensaje + "Rojo";
                    colorSeleccionado = Color.RED;
                } else if (optVerde.isChecked()) {
                    mensaje = mensaje + "Verde";
                    colorSeleccionado = Color.GREEN;
                } else if (optAzul.isChecked()) {
                    mensaje = mensaje + "Azul";
                    colorSeleccionado = Color.BLUE;
                }

                // Tu código original: lblResultado.setText(mensaje);
                lblResultado.setText(mensaje);

                // Bonus: Mostrar el color seleccionado visualmente
                vistaColorSeleccionado.setBackgroundColor(colorSeleccionado);
            }
        });

        // Listener adicional para cambio en tiempo real (opcional)
        grupoColores.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String mensaje = "Color elegido: ";
                int colorSeleccionado = Color.GRAY;

                if (checkedId == R.id.optRojo) {
                    mensaje = mensaje + "Rojo";
                    colorSeleccionado = Color.RED;
                } else if (checkedId == R.id.optVerde) {
                    mensaje = mensaje + "Verde";
                    colorSeleccionado = Color.GREEN;
                } else if (checkedId == R.id.optAzul) {
                    mensaje = mensaje + "Azul";
                    colorSeleccionado = Color.BLUE;
                }

                lblResultado.setText(mensaje);
                vistaColorSeleccionado.setBackgroundColor(colorSeleccionado);
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio10.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}