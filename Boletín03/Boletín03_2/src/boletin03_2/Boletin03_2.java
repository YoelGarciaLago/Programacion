/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin03_2;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin03_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float gc, fa, ke;
        Scanner sc= new Scanner(System.in);
        System.out.println("dime los grados centigrados");
        gc=sc.nextFloat();
        fa=(gc*9/5)+32;
        ke=(float)(gc+273.15);
        System.out.println("De grados centigrados a Fahrenheit= "+ fa+"\nDe grados centigrados a Kelvin= "+ ke);
    }
    
}
