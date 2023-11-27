/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín16;

/**
 *
 * @author dam1
 */
public class Publicacion {
    private Integer codigo;
    private String titulo;
    private Integer anoPubli;

    public Publicacion() {
    }

    public Publicacion(Integer codigo, String titulo, Integer anoPubli) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPubli = anoPubli;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(Integer anoPubli) {
        this.anoPubli = anoPubli;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", anoPubli=" + anoPubli + '}';
    }
    
}
