package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio8 extends AppCompatActivity {

    private SeekBar desValor;
    private TextView lblValor;
    private Button btnVolver;

    // Configuración del scrollbar (como en tu código original)
    private static final int VALOR_MINIMO = 50;
    private static final int VALOR_MAXIMO = 150;
    private static final int VALOR_INICIAL = 70;
    private static final int INCREMENTO_UNIDAD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);

        // Conectar elementos del layout
        desValor = findViewById(R.id.desValor);
        lblValor = findViewById(R.id.lblValor);
        btnVolver = findViewById(R.id.btnVolver);

        // Configurar el SeekBar con los mismos valores que tu código original
        // Tu JScrollBar original: min=50, max=150, valor inicial=70
        desValor.setMax(VALOR_MAXIMO - VALOR_MINIMO); // 150 - 50 = 100
        desValor.setProgress(VALOR_INICIAL - VALOR_MINIMO); // 70 - 50 = 20

        // Mostrar valor inicial (como en tu código original: desValor.setValue(70))
        lblValor.setText("El valor es: " + VALOR_INICIAL);

        // Evento cuando se ajusta la barra (tu código original adaptado)
        desValor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Convertir el progreso (0-100) al rango real (50-150)
                // Aplicar incremento de unidad como en tu código original
                int valorReal = (progress * INCREMENTO_UNIDAD) + VALOR_MINIMO;

                // Asegurar que no exceda el máximo
                if (valorReal > VALOR_MAXIMO) {
                    valorReal = VALOR_MAXIMO;
                }

                // Tu código original: lblValor.setText("El valor es: "+desValor.getValue());
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
                Intent intent = new Intent(Ejercicio8.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}