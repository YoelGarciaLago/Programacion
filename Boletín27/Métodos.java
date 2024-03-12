/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín27;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Métodos{
    
    Menú menu = new Menú();
    ArrayList <Libro> libreria = new ArrayList<>();
    
    public void llamada(){
        menu.factory();
    }
    public void engadir (){
        int resp = JOptionPane.NO_OPTION;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Titulo");
            String titulo = sc.next();
            
            System.out.println("Autor");
            String autor = sc.next();
            
            System.out.println("Precio");
            float precio = sc.nextFloat();
            
            System.out.println("Unidades");
            int unidades = sc.nextInt();
            
            libreria.add(new Libro(titulo,autor,precio,unidades));
            
            resp=JOptionPane.showConfirmDialog(null, "Quieres añadir otro?");
            
        }while(resp == JOptionPane.YES_OPTION);   
        //me.factory();
        llamada();
    }

  public void consultar(){
      if(isEmpty()){
          System.out.println("Ta vacio xddddd");
          return;
      }
      float prezoDaBusqueda = 0.0f;
      String consulta = JOptionPane.showInputDialog("Que libro quieres buscar");
      for (Libro lb : libreria){
          if(lb.getTitulo().equals(consulta)){
              prezoDaBusqueda = lb.getPrezo();
              System.out.println("O libro vale: " + prezoDaBusqueda);
              break;
          }
          else
              System.out.println("No se pudo encontrar ;(");
      }
      //mn.factory();
      llamada();
  }  
    
  public void amosar(){
      System.out.println("Mostrando a librería completa: ");
      for (Libro lb : libreria){
          System.out.println(lb);
      }
      //mn.factory();
      llamada();
  }

    public void borrarSinExistencias(){
        for (Libro lb : libreria){
            if(lb.getUnidades() <= 0){
                libreria.remove(lb);
            }
        }
        System.out.println("Mostrando los libros con existencias: ");
        for (Libro lb : libreria){
            System.out.println(lb);
        }
       // mn.factory();
       llamada();
    }
    
    public void modificar(){
        String tituloDaBusqueda = null;
        float prezoDaBusqueda = 0.0f;
        String consulta = JOptionPane.showInputDialog("Que libro quieres modificar");
        for (Libro lb : libreria){
            if(lb.getTitulo().equals(consulta)){
                tituloDaBusqueda = consulta;
            }
            else {
                System.out.println("No existe tal libro");
                return;
            }    
        }
        for (Libro lb : libreria){
            if(lb.getTitulo() == tituloDaBusqueda){
                prezoDaBusqueda = lb.getPrezo();
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "El libro tiene un precio de: " + prezoDaBusqueda);
        float novoPrezo = Float.parseFloat(JOptionPane.showInputDialog("Cal va a ser o novo prezo"));
        for (Libro lb : libreria){
            if(lb.getTitulo() == tituloDaBusqueda){
                libreria.add(new Libro(lb.getTitulo(),lb.getAutor(),novoPrezo,lb.getUnidades()));
                libreria.remove(lb);
            }
        }
        System.out.println("Prezo cambiado correctamente");
        //mn.factory();
        llamada();
    }
    public boolean isEmpty(){
        return libreria.isEmpty();
    }
}

