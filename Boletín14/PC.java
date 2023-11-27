/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín14;

import boletín14.partes.*;

/**
 *
 * @author dam1
 */
public class PC {
    private Monitor pantalla;
    private Teclado tecla;
    private CPU cpu;
    private float precio;

    public PC(Monitor pantalla, Teclado tecla, CPU cpu, float precio) {
        this.pantalla=pantalla;
        this.tecla=tecla;
        this.cpu=cpu;
        this.precio = precio;
    }

    public Monitor getPantalla() {
        return pantalla;
        
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Teclado getTecla() {
        return tecla;
    }

    public Teclado setTecla(Teclado tecla) {
        this.tecla = tecla;
        return null;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    

   

    public void verPrecio(){
        System.out.println("Precio: "+precio);
    }
    public void verMarca(){
        System.out.println("Marca: "+tecla.toString());
    }
    public void verVelocidadCPU(){
        System.out.println("Velocidad: "+cpu.getVelocidade());
    }

    @Override
    public String toString() {
        return "PC{" + "pantalla=" + pantalla + ", tecla=" + tecla + ", cpu=" + cpu + ", precio=" + precio + '}';
    }
    
    
    
}
