/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín2_4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletín2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner (System.in);
        System.out.print("Cual es el 1er nº?: ");
        double n1=sc.nextDouble();
        System.out.print("Cual es el 2do nº?:");
        double n2=sc.nextDouble();
        double Suma=n1+n2;
        double Resta=n1-n2;
        double Cociente=n1/n2;        
        double producto=n1*n2;
        System.out.print("Suma = "+Suma+ "\nResta = " +Resta+ "\nProducto = "+producto+"\nCociente = "+Cociente);
        
        
        
    }
    
}
