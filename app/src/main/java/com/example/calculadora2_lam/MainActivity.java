package com.example.calculadora2_lam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Pilha Pilha;
    private Fibb Fibb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button irpilha = (Button) findViewById(R.id.irpilha);
        Button irfib = (Button) findViewById(R.id.irfib);
    }
    public void irpilha(View view){
        Intent intent = new Intent(getApplicationContext(), Pilha.class);
        startActivity(intent);
    }
    public void irfib(View view){
        Intent intent = new Intent(getApplicationContext(), Fibb.class);
        startActivity(intent);
    }
}