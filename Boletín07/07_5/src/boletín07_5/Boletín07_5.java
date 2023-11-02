/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín07_5;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletín07_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comparar ob= new Comparar();
        int num1= Integer.parseInt(JOptionPane.showInputDialog("1er valor"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("2do valor"));
        int num3= Integer.parseInt(JOptionPane.showInputDialog("3er número"));
        
        ob.ponerValores(num1, num2, num3);
  
        ob.comparacion();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
