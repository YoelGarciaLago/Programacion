/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín16;

/**
 *
 * @author dam1
 */
public class Revista extends Publicacion{
    private Integer numero;

    public Revista() {
    }

    public Revista(Integer numero) {
        this.numero = numero;
    }

    public Revista(Integer numero, Integer codigo, String titulo, Integer anoPubli) {
        super(codigo, titulo, anoPubli);
        this.numero = numero;
    }

    

    @Override
    public String toString() {
        return super.toString()+"Revista{" + "numero=" + numero + '}';
    }
    public int getAno (){
       return super.getAnoPubli();
    }
    
    @Override
    public int getCodigo(){
        return super.getCodigo();
    }
}
