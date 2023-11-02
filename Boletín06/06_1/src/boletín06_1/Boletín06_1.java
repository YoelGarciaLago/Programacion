/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín06_1;
/**
 *
 * @author dam1
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Boletín06_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner sc = new Scanner(System.in);    
    coche objcoche= new coche ();

    
    JOptionPane.showMessageDialog(null, "Velocidad = "+ objcoche.aceleracion()
    );
    
    
    
    }
    
}
