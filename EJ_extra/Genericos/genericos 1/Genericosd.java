/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericosd;

/**
 *
 * @author dam1
 */
public class Genericosd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja cajan = new Caja();
        cajan.meter(1);
        cajan.meter(1);
        cajan.meter(1);
        cajan.meter(1);
        cajan.mirar();
        Caja cajaL = new Caja();
        cajaL.meter("wawa");
        cajaL.meter("wawa");
        cajaL.meter("wawa");
        cajaL.meter("wawa");
        cajaL.mirar();
    }
    
}
