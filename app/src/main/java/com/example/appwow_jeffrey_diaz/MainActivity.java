package com.example.appwow_jeffrey_diaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1, etNum2;
    private TextView tvRes_Suma, tvRes_Resta;
    private Button btnResultado, btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        tvRes_Suma = (TextView) findViewById(R.id.tvRes_Suma);
        tvRes_Resta = (TextView) findViewById(R.id.tvRes_Resta);
        btnResultado = (Button) findViewById(R.id.btnResultado);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {
                    tvRes_Suma.setText("¡¡ Digitar números !!");
                    tvRes_Resta.setText("¡¡ Digitar números !!");
                } else {

                    int num1, num2, suma, resta;

                    num1 = Integer.parseInt(etNum1.getText().toString());
                    num2 = Integer.parseInt(etNum2.getText().toString());

                    suma = num1 + num2;
                    resta = num1 - num2;

                    tvRes_Suma.setText(String.valueOf(suma));
                    tvRes_Resta.setText(String.valueOf(resta));
                }
            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                intent.putExtra("primer_numero", etNum1.getText().toString());
                intent.putExtra("Segundo_numero", etNum2.getText().toString());
                intent.putExtra("suma", tvRes_Suma.getText().toString());
                intent.putExtra("resta", tvRes_Resta.getText().toString());
                startActivity(intent);
            }
        });
    }
}

