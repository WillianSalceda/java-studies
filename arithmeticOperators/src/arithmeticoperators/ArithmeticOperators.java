/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arithmeticoperators;

import java.util.Random;

/**
 *
 * @author WillianSalceda
 */
public class ArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 9;
        
        float m = (n1 + n2) / 2;
        
        System.out.println("A média é igual a " + m);
        
        
        
        // VALOR DE 'NUMBER' PÓS INCREMENTADO;
        int number = 5;
        int value = 5 + number++;
        System.out.println("Valor de 'Number' PÓS-INCREMENTADO: " + value);
        System.out.println(number);
        
        // VALOR DE 'NUMBER' PRÉ INCREMENTADO;
        number = 5;
        value = 5 + ++number;
        
        System.out.println("Valor de 'Number' PRÉ-INCREMENTADO: " + value);
        System.out.println(number);
        
        
        
        // INCREMENTO + ATRIBUIÇÃO;
        int x = 4;
        
        x -= 6;
        
        System.out.println(x);
        
        
        
        // 
        float X = (float) Math.sqrt(20);
        System.out.println(X);
        
        X = (float) Math.sqrt(20);
        X = Math.round(X);
        System.out.println(X);
        
        X = (float) Math.sqrt(20);
        X = (float) Math.ceil(X);
        System.out.println(X);
        
        X = (float) Math.sqrt(20);
        X = (float) Math.floor(X);
        System.out.println(X);
        
        
        double rand = 15 + Math.random() * (20-15);
        System.out.println(rand);
        
        Random Rand = new Random();
        System.out.println(Rand.nextInt(20));
    }
    
}
