/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín2_5;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletín2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.print("Cuantas millas marinas hay en total?:");
        double millas_mar= sc.nextFloat();
        final int VALOR=1852;
        double metros = millas_mar*VALOR;
        System.out.print(millas_mar+" millas marinas son "+metros+" metros ");
        
        
        
        
        
        
        
        
        
        
    }
    
}
