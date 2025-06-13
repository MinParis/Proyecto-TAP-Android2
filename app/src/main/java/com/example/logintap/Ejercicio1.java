package com.example.logintap;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio1 extends AppCompatActivity {

    private CheckBox chkPerro, chkGato, chkRaton;
    private Button btnAceptar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);


        chkPerro = findViewById(R.id.chkPerro);
        chkGato = findViewById(R.id.chkGato);
        chkRaton = findViewById(R.id.chkRaton);
        btnAceptar = findViewById(R.id.btnAceptar);
        lblResultado = findViewById(R.id.lblResultado);

        Button btnVolver = findViewById(R.id.btnVolver);


        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ejercicio1.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = "Animales elegidos: ";

                if (chkPerro.isChecked()) {
                    mensaje += "Perro ";
                }
                if (chkGato.isChecked()) {
                    mensaje += "Gato ";
                }
                if (chkRaton.isChecked()) {
                    mensaje += "Ratón ";
                }

                lblResultado.setText(mensaje);
                Toast.makeText(Ejercicio1.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });
    }
}