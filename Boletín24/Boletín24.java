/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín24;
/**
 *
 * @author dam1
 */
public class Boletín24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros lb = new Libros();
        
        lb.engadir();
        lb.amosar();
        lb.consulta();
        lb.deBaixa();
        lb.vender();
        lb.amosar(); 
        
    }
    
}
