package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;

    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.n1 = findViewById(R.id.txtNumero1);
        this.n2 = findViewById(R.id.txtNumero2);
        this.resultado = findViewById(R.id.txtResultado);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnSumar) {
            resultado.setText("El resultado es: " + Sumar());
        }else if(view.getId()==R.id.btnRestar){
            resultado.setText("El resultado es: " + Restar());
        }else if(view.getId()==R.id.btnMultiplicar){
            resultado.setText("El resultado es: " + Multiplicar());
        }else if(view.getId()==R.id.btnDividir){
            resultado.setText("El resultado es: " + Dividir());
        }
    }

    public double Sumar() {
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) + Double.parseDouble(this.n2.getText().toString().trim());

        return resultado;
    }

    public double Restar() {
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) - Double.parseDouble(this.n2.getText().toString().trim());

        return resultado;
    }

    public double Multiplicar() {
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) * Double.parseDouble(this.n2.getText().toString().trim());

        return resultado;
    }

    public double Dividir() {
        double resultado = 0;
        double numero1 = 0;
        double numero2 = 0;

        numero1 = Double.parseDouble(this.n1.getText().toString().trim());
        numero2 = Double.parseDouble(this.n2.getText().toString().trim());

        if (numero2 == 0) {
            Toast.makeText(this, "No es posible dividir un numero entre 0", Toast.LENGTH_LONG).show();
        } else {
            resultado = numero1 / numero2;
        }
        return resultado;
    }
}