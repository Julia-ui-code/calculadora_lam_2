package com.example.calculadora2_lam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fibb extends AppCompatActivity {

    public Fib fib = new Fib();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibb);

        EditText termo_num = (EditText) findViewById(R.id.termo_num);
        EditText ele = (EditText) findViewById(R.id.ele);
        Button voltar = (Button) findViewById(R.id.voltar_f);
    }
    public void calcula(View v){
        EditText out = findViewById(R.id.ele);
        out.setText("");
        EditText valor = (EditText) findViewById(R.id.termo_num);
        int numero = Integer.parseInt(valor.getText().toString());
        int resul = fib.calcular(numero);
        String saida = Integer.toString(resul);
        out.setText(saida);
        valor.setText("");
    }
    public void limpar(View v){
        EditText out = findViewById(R.id.ele);
        out.setText("");
    }
    public void voltar_f(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}