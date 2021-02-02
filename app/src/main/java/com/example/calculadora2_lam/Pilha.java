package com.example.calculadora2_lam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.EmptyStackException;

public class Pilha extends AppCompatActivity {

    public Calc calc = new Calc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilha);

        EditText num = (EditText) findViewById(R.id.num);
        EditText pilha_num = (EditText) findViewById(R.id.pilha_num);
        EditText erro = (EditText) findViewById(R.id.erro);
        Button voltar = (Button) findViewById(R.id.voltar);
    }
    public void empilhar(View v){
        EditText er = findViewById(R.id.erro);
        er.setText("");
        try {
            EditText valor = (EditText) findViewById(R.id.num);
            int num = Integer.parseInt(valor.getText().toString());
            calc.empilhar(num);
            EditText out = findViewById(R.id.pilha_num);
            String saida = calc.getPile().toString();
            out.setText(saida);
            valor.setText("");
        }
        catch(ArithmeticException z){
            er.setText("Operação inviável!!!");
        }
        catch(EmptyStackException e){
            EditText out = findViewById(R.id.pilha_num);
            out.setText("");
            er.setText("A pilha está vazia!!!");
        }
    }

    public void desempilhar(View v){
        EditText er = findViewById(R.id.erro);
        er.setText("");
        try {
            calc.desempilhar();
            EditText out = (EditText) findViewById(R.id.pilha_num);
            String saida = calc.getPile().toString();
            out.setText(saida);
        }
        catch(ArithmeticException z){
            er.setText("Operação inviável!!!");
        }
        catch(EmptyStackException e){
            EditText out = findViewById(R.id.pilha_num);
            out.setText("");
            er.setText("A pilha está vazia!!!");
        }
    }

    public void somar(View v){
        EditText er = findViewById(R.id.erro);
        er.setText("");
        try {
            calc.somar();
            EditText out = (EditText) findViewById(R.id.pilha_num);
            String saida = calc.getPile().toString();
            out.setText(saida);
        }
        catch(ArithmeticException z){
            er.setText("Operação inviável!!!");
        }
        catch(EmptyStackException e){
            EditText out = findViewById(R.id.pilha_num);
            out.setText("");
            er.setText("A pilha está vazia!!!");
        }
    }

    public void sub(View v){
        EditText er = findViewById(R.id.erro);
        er.setText("");
        try {
            calc.sub();
            EditText out = (EditText) findViewById(R.id.pilha_num);
            String saida = calc.getPile().toString();
            out.setText(saida);
        }
        catch(ArithmeticException z){
            er.setText("Operação inviável!!!");
        }
        catch(EmptyStackException e){
            EditText out = findViewById(R.id.pilha_num);
            out.setText("");
            er.setText("A pilha está vazia!!!");
        }
    }

    public void multi(View v){
        EditText er = findViewById(R.id.erro);
        er.setText("");
        try {
            calc.multi();
            EditText out = (EditText) findViewById(R.id.pilha_num);
            String saida = calc.getPile().toString();
            out.setText(saida);
        }
        catch(ArithmeticException z){
            er.setText("Operação inviável!!!");
        }
        catch(EmptyStackException e){
            EditText out = findViewById(R.id.pilha_num);
            out.setText("");
            er.setText("A pilha está vazia ou está ");
        }
    }

    public void div(View v){
        EditText er = findViewById(R.id.erro);
        er.setText("");
        try {
            calc.div();
            EditText out = (EditText) findViewById(R.id.pilha_num);
            String saida = calc.getPile().toString();
            out.setText(saida);
        }
        catch(ArithmeticException z){
            er.setText("Operação inviável!!!");
        }
        catch(EmptyStackException e){
            EditText out = findViewById(R.id.pilha_num);
            out.setText("");
            er.setText("A pilha está vazia!!!");
        }
    }

    public void limpar(View v){
        calc.limpar();
        EditText out = findViewById(R.id.pilha_num);
        out.setText("");
    }
    public void voltar(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}