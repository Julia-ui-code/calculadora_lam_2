package com.example.calculadora2_lam;

import java.util.Stack;

public class Calc {
    private Stack<Integer> pile = new Stack<Integer>();

    public Stack<Integer> getPile() {
        return pile;
    }

    public void empilhar(int a){
        pile.push(a);
    }

    public void desempilhar(){
        pile.pop();
    }

    public void somar(){
        int num1 = pile.pop();
        int num2 = pile.pop();
        int result = num1 + num2;
        pile.push(result);

    }

    public void sub(){
        int num1 = pile.pop();
        int num2 = pile.pop();
        int result = num1 - num2;
        pile.push(result);
    }

    public void multi(){
        int num1 = pile.pop();
        int num2 = pile.pop();
        int result = num1 * num2;
        pile.push(result);
    }

    public void div(){
        int num1 = pile.pop();
        int num2 = pile.pop();
        int result = num1 / num2;
        pile.push(result);
    }

    public void limpar(){
        this.pile.clear();
    }
}