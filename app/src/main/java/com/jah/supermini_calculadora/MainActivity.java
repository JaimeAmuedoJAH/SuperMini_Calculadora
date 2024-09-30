package com.jah.supermini_calculadora;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nmbNumero1;
    EditText nmbNumero2;
    String numero1;
    String numero2;
    Button btnMas;
    Button btnMenos;
    Button btnMultiplicacion;
    Button btnDivision;
    Button btnBorrar;
    EditText txtResultado;
    int numero01;
    int numero02;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.miniCalculadora), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);
        btnBorrar = findViewById(R.id.btnBorrar);



        btnMas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                nmbNumero1 = findViewById(R.id.nmbNumero1);
                nmbNumero2 = findViewById(R.id.nmbNumero2);
                numero1 = nmbNumero1.getText().toString();
                numero2 = nmbNumero2.getText().toString();
                if (!numero1.isEmpty() && !numero2.isEmpty()) {
                    numero01 = Integer.parseInt(numero1);
                    numero02 = Integer.parseInt(numero2);
                }
                sumar(numero01, numero02);

            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                nmbNumero1 = findViewById(R.id.nmbNumero1);
                nmbNumero2 = findViewById(R.id.nmbNumero2);
                numero1 = nmbNumero1.getText().toString();
                numero2 = nmbNumero2.getText().toString();
                if (!numero1.isEmpty() && !numero2.isEmpty()) {
                    numero01 = Integer.parseInt(numero1);
                    numero02 = Integer.parseInt(numero2);
                }
                restar(numero01, numero02);

            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                nmbNumero1 = findViewById(R.id.nmbNumero1);
                nmbNumero2 = findViewById(R.id.nmbNumero2);
                numero1 = nmbNumero1.getText().toString();
                numero2 = nmbNumero2.getText().toString();
                if (!numero1.isEmpty() && !numero2.isEmpty()) {
                    numero01 = Integer.parseInt(numero1);
                    numero02 = Integer.parseInt(numero2);
                }
                multiplicar(numero01, numero02);

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                nmbNumero1 = findViewById(R.id.nmbNumero1);
                nmbNumero2 = findViewById(R.id.nmbNumero2);
                numero1 = nmbNumero1.getText().toString();
                numero2 = nmbNumero2.getText().toString();
                if (!numero1.isEmpty() && !numero2.isEmpty()) {
                    numero01 = Integer.parseInt(numero1);
                    numero02 = Integer.parseInt(numero2);
                }
                division(numero01, numero02);

            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                borrar();

            }
        });
    }

    private void sumar(int num1, int num2){

        resultado = num1 + num2;
        txtResultado = findViewById(R.id.txtResultado);

        txtResultado.setText(String.valueOf(resultado));
    }
    private void restar(int num1, int num2){

        resultado = num1 - num2;
        txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText(String.valueOf(resultado));
    }
    private void multiplicar(int num1, int num2){

        resultado = num1 * num2;
        txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText(String.valueOf(resultado));
    }
    private void division(int num1, int num2){
    try{
        resultado = num1 / num2;
        txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText(String.valueOf(resultado));
        }
    catch (ArithmeticException e){
        Log.e("error0", "No puedes dividir entre 0");

        }
    }

    private void borrar(){

        txtResultado = findViewById(R.id.txtResultado);
        nmbNumero1 = findViewById(R.id.nmbNumero1);
        nmbNumero2 = findViewById(R.id.nmbNumero2);

        nmbNumero1.setText("");
        nmbNumero2.setText("");
        txtResultado.setText("");

    }
}