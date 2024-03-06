/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín24;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;


/**
 *
 * @author dam1
 */
public class Libros implements Comparable <Libros> {
    private String ISBN;
    private float prezo;
    private String autor, titulo;
    private int unidades;
    
    ArrayList <Libros> libreria = new ArrayList <>();
    ArrayList <Libros> deBaixa = new ArrayList <>();    

    public Libros(String ISBN, float prezo, String autor, String titulo, int unidades) {
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.autor = autor;
        this.titulo = titulo;
        this.unidades = unidades;
    }

    public Libros(){
        
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Libros> getLibreria() {
        return libreria;
    }

    public void setLibreria(ArrayList<Libros> libreria) {
        this.libreria = libreria;
    }
    
    
    
    public void engadir(){
        int resp = JOptionPane.NO_OPTION;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("ISBN");
            this.ISBN = sc.next();
            
            System.out.println("prezo");
            this.prezo = sc.nextFloat();
            
            System.out.println("autor");
            this.autor = sc.next();
            
            System.out.println("titulo");
            this.titulo = sc.next();
            
            System.out.println("unidades");
            this.unidades = sc.nextInt();
            
            libreria.add(new Libros(this.ISBN,this.prezo,this.autor,this.titulo,this.unidades));
            
            resp = JOptionPane.showConfirmDialog(null, "¿Quieres seguir?");
        }while(resp==JOptionPane.YES_OPTION);
        
    }
    
    public void vender(){
        if (Libros.comprobarSiEstaVacio(libreria)){
            System.out.println("No se puede vender porque no hay libros");
            return;
        }
        Libros.comprobarSiEstaVacio(libreria);
        Libros libroABorrar = null;
        String remover = JOptionPane.showInputDialog("¿Qué libro quieres borrar?");
         for(Libros lb : libreria){
             if(lb.getTitulo().equals(remover)){
                 libroABorrar = lb;
                 break;
             }
         }
        if (libroABorrar != null){
            libreria.remove(libroABorrar);
            System.out.println("Libro borrado con exito");
        }
        else
            System.out.println("El libro no pudo ser encontrado");
    }
    
    public void consulta(){
        if(Libros.comprobarSiEstaVacio(libreria)){
            System.out.println("No se puede consultar que la lista está vacía");
            return;
        }
        Libros libroAEncontrar = null;
        String research = JOptionPane.showInputDialog("¿Qué libro quieres encontrar?");
        for(Libros lb : libreria){
            if(lb.getTitulo().equals(research)){
                libroAEncontrar = lb;
                break;
            }   
        }
        System.out.println("Características de tu búsqueda");
        System.out.println(libroAEncontrar);
        
    }
    
    public void deBaixa (){
        if (Libros.comprobarSiEstaVacio(libreria)){
            System.out.println("No se pueden poner los libros de baja porque no hay");
            return;
        }
        for (Libros lb : libreria){
            if (lb.getUnidades() == 0){
               deBaixa.add(lb);
            }
        }
        System.out.println("Hay un total de " + deBaixa.size() + " libro(s) de baixa");
    }
    
    public void amosar(){
        if (Libros.comprobarSiEstaVacio(libreria)){
            System.out.println("No se pueden poner los libros de baja porque no hay");
            return;
        }
        ArrayList <Libros> auxiliar = new ArrayList <>();
        for (Libros lb : libreria){
            auxiliar.add(lb);
         }        
     Collections.sort(auxiliar);
     ArrayList <Libros> libreriaOrdenada = new ArrayList<>(auxiliar);
        System.out.println("Lista de libros ordenada: ");
        for (Libros lb : libreriaOrdenada){
            System.out.println("Titulo: " + lb.getTitulo() + " autor: " + lb.getAutor() + " ISBN: " + lb.getISBN() + " prezo:" + lb.getPrezo() + " Unidades: " + lb.getUnidades() + "\n");
        }
    }
    static boolean comprobarSiEstaVacio(ArrayList <Libros> libreria){
        boolean comprobacion;
        comprobacion = libreria.isEmpty();
        return comprobacion;
    }
    
    @Override
    public int compareTo(Libros t) {
        return this.titulo.compareTo(t.getTitulo());
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", prezo: " + prezo + ", autor: " + autor + ", titulo: " + titulo + ", unidades: " + unidades;
    }
    
    
}
