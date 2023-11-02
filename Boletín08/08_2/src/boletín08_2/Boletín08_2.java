/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín08_2;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletín08_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formas ob=new Formas();
        int tipo=Integer.parseInt(JOptionPane.showInputDialog("¿Qué formula quieres usar?: \n1.Cadrado \n2.Triangulo \n3.Círculo"));
        ob.selectTipo(tipo);
        ob.condicion();
    
    
    }
    
}
