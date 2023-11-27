/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín16;

/**
 *
 * @author dam1
 */
public class Libro extends Publicacion {
    private boolean prestado=false;

    public Libro(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(boolean prestado, Integer codigo, String titulo, Integer anoPubli) {
        super(codigo, titulo, anoPubli);
        this.prestado = prestado;
    }

    public Libro() {
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "prestado=" + prestado + '}';
    }

    public int getAno (){
       return super.getAnoPubli();
    }
    public int getCodigo(){
        return super.getCodigo();
    }
    
}
