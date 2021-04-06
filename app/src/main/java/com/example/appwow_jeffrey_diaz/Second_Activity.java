package com.example.appwow_jeffrey_diaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    private TextView tvSuma, tvResta, tvvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        Intent intent = getIntent();
        String primer_numero = intent.getStringExtra("primer_numero");
        String Segundo_numero = intent.getStringExtra("Segundo_numero");
        String suma = intent.getStringExtra("suma");
        String resta = intent.getStringExtra("resta");

        tvSuma = (TextView) findViewById(R.id.tvSuma);
        tvResta = (TextView) findViewById(R.id.tvResta);
        tvvv = (TextView) findViewById(R.id.tvvv);

        tvSuma.setText("La suma de  " + primer_numero + " + " + Segundo_numero + " =  " + suma);
        tvResta.setText("La resta de  " + primer_numero + " - " + Segundo_numero + " =  " + resta);

        tvvv.setText("Por: Jeffrey Alexander Díaz Pérez  ");
    }
}