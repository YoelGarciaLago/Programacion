/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín21_1;
import java.util.Random;
/**
 *
 * @author dam1
 */
public class Boletín21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rm = new Random ();
        int numeros[] = new int [6];
        for(int i = 0;i<numeros.length;i++ ){
            numeros[i] = rm.nextInt(51);
        }
        System.out.println("Array del derecho:");
        for (int numero: numeros){
            System.out.print(numero + " ");
        }
        System.out.println();
        
        System.out.println("Array del revés:");
        for (int i = numeros.length -1; i >=0; i--){
            System.out.print(numeros[i]+" ");
    }
    
}
    
}
