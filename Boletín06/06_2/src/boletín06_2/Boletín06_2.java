/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín06_2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletín06_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc= new Scanner (System.in);
    Satelite objSat= new Satelite();
    objSat.Satelite(2, 3, 4);
    
    
    
    
    JOptionPane.showInputDialog(objSat.verPosicion());
    
    
    
    
    
    
    
    }
    
}
