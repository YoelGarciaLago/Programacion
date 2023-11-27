/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín14;

import boletín14.partes.*;
/**
 *
 * @author dam1
 */
public class Boletín14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m1= new Monitor("dfgds");
        Teclado t1= new Teclado("dfgfd");
        CPU c1= new CPU (444);
        PC pc = new PC(m1,t1,c1,33);
        pc.verMarca();
        pc.verPrecio();
        pc.verVelocidadCPU();
        System.out.println(pc.toString());
    }
    
}
