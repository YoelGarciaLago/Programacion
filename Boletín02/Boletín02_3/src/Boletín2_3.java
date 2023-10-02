/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package boletín2_3;

import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletín2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.print("Teclea la cantidad de €: ");
    float euro= sc.nextFloat();
    System.out.print("Teclea el cambio: ");
    float cambio= sc.nextFloat();
    float dolar= euro*cambio;
    System.out.print(euro+"€ son" + dolar + "$");
    
    //también 
    
    System.out.print(euro+"euros=" + (euro*cambio)+"$");
    
    
    
    
    }
    
    
}
