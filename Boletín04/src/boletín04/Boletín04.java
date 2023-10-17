/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín04;

import java.util.Scanner;

/**
 *
 * @author 4
 */
public class Boletín04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro objLibro= new Libro ();
       Libro Libro= new Libro("100 años de soledad","Gabriel García Márquez",1989,(short)657,10);
       objLibro.setTitulo();
       objLibro.setAutor();
       objLibro.setAno();
       objLibro.setnumPaginas();
       objLibro.setValoracion();
      System.out.println(objLibro.getLibro());
      System.out.println(Libro.getLibroparametrizado());
        
        
        
        
        
        
        
        
    }
    
}
