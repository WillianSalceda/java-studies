/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package williansalceda;

import java.util.Scanner;


/**
 *
 * @author WillianSalceda
 */
public class PrimitiveTypes {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = (String)teclado.nextLine();
        
        System.out.print("Digite sua nota: ");
        float nota = (float) teclado.nextFloat();
    
 
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é de %.2f \n", nome, nota); // 
        System.out.format("A nota de %s é de %.2f \n", nome, nota);
        
        //
        
        Float.toString(nota);
        System.out.println(nota);
    }
}
