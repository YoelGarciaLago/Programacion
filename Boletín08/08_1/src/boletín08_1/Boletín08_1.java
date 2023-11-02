/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín08_1;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletín08_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Condicion ob= new Condicion();
        String nome1=JOptionPane.showInputDialog("¿Nome?");
        ob.poñerNome(nome1);
        int ventas1=Integer.parseInt(JOptionPane.showInputDialog("¿Ventas?"));
        ob.nVentas(ventas1);
        ob.condicion();
        
        
        
        
        
        
    }
    
}
