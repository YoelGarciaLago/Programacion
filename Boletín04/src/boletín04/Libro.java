/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín04;
import java.util.Scanner;
/**
 *
 * @author 4
 */
public class Libro {
 Scanner sc= new Scanner(System.in);
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    
    public Libro(){
        
    }
    public  Libro (String titulo ,String autor ,int ano, short numPaginas, float valoracion){
        this.titulo=titulo;
        this.autor= autor;
        this.ano= ano;
        this.numPaginas= numPaginas;
        this.valoracion= valoracion;
    }
    
    public void setTitulo(){
     System.out.print("Título?: ");
     titulo= sc.next();
     
    }
    
    public void setAutor(){
       System.out.print("Autor?: ");
      autor= sc.next(); 
    }
  public void setAno(){
       System.out.print("Año?: ");
      ano= sc.nextInt(); 
    }
    
   public void setnumPaginas(){
       System.out.print("Nº de páginas?: ");
      numPaginas= sc.nextShort(); 
    }
    public void setValoracion(){
       System.out.print("Valoración?: ");
      valoracion= sc.nextFloat(); 
    }
    public String getLibro(){
    return "Titulo:"+ titulo + "\nAutor:"+ autor + "\nAño:"+ ano +"\nNº de páginas:"+ numPaginas+ "\nValoración:"+ valoracion ;
    
    }
    
    public String getLibroparametrizado(){
        return "Título: "+ titulo + "\nAutor: "+ autor + "\nAño: " + ano + "\nNº de páginas: " + numPaginas + "\nValoración: " + valoracion;
                }
    
}
