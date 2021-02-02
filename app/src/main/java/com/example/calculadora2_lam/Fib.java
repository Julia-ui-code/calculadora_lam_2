package com.example.calculadora2_lam;

import java.util.*;

public class Fib{

        public int calcular(int num){
            int n = num;
            int num1 = 1;
            int num2 = 0;
            if(n == 1){
                return 0;
            }
            else if(n == 2){
                return 1;
            }
            else{
                for(int k = 3; k <= n; k++){
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                }
                return num1;
            }
        }
}