package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio7 extends AppCompatActivity {

    private SeekBar slDeslizador;
    private TextView lblValor;
    private Button btnVolver;

    // Configuración del slider (como en tu código original)
    private static final int VALOR_MINIMO = 100;
    private static final int VALOR_MAXIMO = 500;
    private static final int VALOR_INICIAL = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        // Conectar elementos del layout
        slDeslizador = findViewById(R.id.slDeslizador);
        lblValor = findViewById(R.id.lblValor);
        btnVolver = findViewById(R.id.btnVolver);

        // Configurar el SeekBar con los mismos valores que tu código original
        // En Android, SeekBar va de 0 a max, así que ajustamos los valores
        slDeslizador.setMax(VALOR_MAXIMO - VALOR_MINIMO); // 500 - 100 = 400
        slDeslizador.setProgress(VALOR_INICIAL - VALOR_MINIMO); // 400 - 100 = 300

        // Mostrar valor inicial
        lblValor.setText("El valor es: " + VALOR_INICIAL);

        // Evento cuando se mueve el slider (tu código original adaptado)
        slDeslizador.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Convertir el progreso (0-400) al rango real (100-500)
                int valorReal = progress + VALOR_MINIMO;
                lblValor.setText("El valor es: " + valorReal);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // No necesitamos hacer nada aquí
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // No necesitamos hacer nada aquí
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio7.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
