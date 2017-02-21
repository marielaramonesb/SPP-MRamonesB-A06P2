/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a06.p2;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int numero;
        numero = solicitarNumero();
        calcularFactorial(numero);
    }
    
    public static int solicitarNumero(){
        int N;
        System.out.println("Introduce un numero");
        Scanner entradaNumero = new Scanner(System.in);
        N = entradaNumero.nextInt();
        if (N < 1 || N > 10){
            System.out.println("ERROR-EL NUMERO ESTA FUERA DEL RANGO");
            solicitarNumero();
        } else {
            
        }
        return N;
    }
    
   public static void calcularFactorial(int N){
        int fact, cont;
        cont = 1;
        fact = 1;
        do {
            cont++;
            fact = fact*(cont);
        } while (cont < (N));
        System.out.println("El factorial del numero ingresado es: " + fact);
    }
    
}
    