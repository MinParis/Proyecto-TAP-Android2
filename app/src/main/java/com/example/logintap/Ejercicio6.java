package com.example.logintap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio6 extends AppCompatActivity {

    private EditText txtPrecioBase;
    private ToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;
    private TextView lblPrecioInstalacion, lblPrecioFormacion, lblPrecioAlimentacionBD, lblTotal;
    private Button btnCalcular, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        // Conectar elementos del layout
        txtPrecioBase = findViewById(R.id.txtPrecioBase);
        tbtnInstalacion = findViewById(R.id.tbtnInstalacion);
        tbtnFormacion = findViewById(R.id.tbtnFormacion);
        tbtnAlimentacionBD = findViewById(R.id.tbtnAlimentacionBD);
        lblPrecioInstalacion = findViewById(R.id.lblPrecioInstalacion);
        lblPrecioFormacion = findViewById(R.id.lblPrecioFormacion);
        lblPrecioAlimentacionBD = findViewById(R.id.lblPrecioAlimentacionBD);
        lblTotal = findViewById(R.id.lblTotal);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnVolver = findViewById(R.id.btnVolver);

        // Configurar Instalación como seleccionado por defecto (como en tu código original)
        tbtnInstalacion.setChecked(true);

        // Función del botón Calcular (tu código original adaptado)
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double precio_base;
                    double precio_instal; // precio instalación
                    double precio_for; // precio formación
                    double precio_ali; // precio alimentación

                    // Recojo datos desde la ventana:
                    if (txtPrecioBase.getText().toString().isEmpty()) {
                        Toast.makeText(Ejercicio6.this, "Ingresa un precio base", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    precio_base = Double.parseDouble(txtPrecioBase.getText().toString());
                    precio_instal = Double.parseDouble(lblPrecioInstalacion.getText().toString().replace("$", ""));
                    precio_for = Double.parseDouble(lblPrecioFormacion.getText().toString().replace("$", ""));
                    precio_ali = Double.parseDouble(lblPrecioAlimentacionBD.getText().toString().replace("$", ""));

                    // Ahora que tengo los datos, puedo hacer cálculos.
                    // Al precio base se le van añadiendo precio de extras
                    // según estén o no activados los ToggleButtons
                    double precio_total;
                    precio_total = precio_base;

                    if (tbtnInstalacion.isChecked()) { // Si se seleccionó instalación
                        precio_total = precio_total + precio_instal;
                    }
                    if (tbtnFormacion.isChecked()) { // Si se seleccionó formación
                        precio_total = precio_total + precio_for;
                    }
                    if (tbtnAlimentacionBD.isChecked()) { // Si se seleccionó Alimentación BD
                        precio_total = precio_total + precio_ali;
                    }

                    // Finalmente pongo el resultado en la etiqueta
                    lblTotal.setText("Total: $" + precio_total);

                } catch (NumberFormatException e) {
                    Toast.makeText(Ejercicio6.this, "Ingresa un número válido", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Función del botón Volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio6.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}