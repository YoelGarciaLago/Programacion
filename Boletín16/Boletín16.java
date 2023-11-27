/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín16;

/**
 *
 * @author dam1
 */
public class Boletín16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Libro libre=new Libro(true,1,"nome",1900);
        Revista revista=new Revista(2,5,"revista",2004);
        System.out.println(libre.toString());
        System.out.println(revista.toString());
               
    }
    
}
