/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author WillianSalceda
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, resultado;
        n1 = 6;
        n2 = 8;
        
        // SE n1 MAIOR QUE n2, resultado = X SE NÃO, resultado = Y;
        resultado = (n1 > n2) ? n1+n2 : n2-n1;
        
        System.out.println(resultado);
        
        String nome1, nome2, nome3, res;
        
        nome1 = "Willian";
        nome2 = "Willian";
        nome3 = new String("Willian");
        
        res = (nome1 == nome2) ? "igual" : "diferente";
        System.out.println(res);
        
        res = (nome1 == nome3) ? "igual" : "diferente";
        System.out.println(res);
        
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
    
}
