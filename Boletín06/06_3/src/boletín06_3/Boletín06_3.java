/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín06_3;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletín06_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Círculo objcir = new Círculo();
 System.out.print("Ratio:");
    double a=sc.nextDouble();
    objcir.setRatio(a);
    JOptionPane.showMessageDialog(null, "Área: " + objcir.CalcularArea());
    JOptionPane.showMessageDialog(null, "Longitud: "+ objcir.CalcularLongitud())  ;      
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
