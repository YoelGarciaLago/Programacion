/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín14.partes;

/**
 *
 * @author dam1
 */
public class Monitor {
     
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Monitor(String marca) {
        this.marca = marca;
    }

    public Monitor() {
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + '}';
    }
    
}
