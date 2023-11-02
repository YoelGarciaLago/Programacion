/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín07_4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletín07_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner sc = new Scanner (System.in);
 nome_peso ob = new nome_peso();
        System.out.print("Nome da 1ra persoa: ");
    String nom1= sc.nextLine();
        System.out.print("Nome da 2da persoa: ");
    String nom2= sc.nextLine();
    ob.ponerNombres(nom1, nom2);
        System.out.print("Peso da 1ra persoa: ");
        double peso1= sc.nextDouble();
        System.out.print("Peso da 2da persoa: ");
        double peso2= sc.nextDouble();
        ob.ponerPesos(peso1, peso2);
        ob.comparacion();
        
        
        
        
        
        
        
    }
    
}
