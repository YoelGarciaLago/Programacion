/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín27;

/**
 *
 * @author dam1
 */
public class Libro implements Comparable <Libro> {
    private String  autor;
    private String titulo;
    private float prezo;
    private int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public  void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
 @Override
    public int compareTo(Libro t) {
        return this.titulo.compareTo(t.getTitulo());
    }

    @Override
    public String toString() {
        return "Libro{" + "autor: " + autor + ", titulo: " + titulo + ", prezo: " + prezo + ", unidades: " + unidades + '}';
    }
    
}
