/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín07.pkg2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletín072 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner (System.in);
    Suma_e_resta obj= new Suma_e_resta();
        System.out.print("Num1: ");
        short a = sc.nextShort();
        System.out.print("NUM2: ");
        short b= sc.nextShort();
    obj.sumaResta(a, b);
            
            
            
            
            
            
            
            }
    
}
