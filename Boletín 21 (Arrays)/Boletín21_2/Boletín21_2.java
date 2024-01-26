/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín21_2;

import java.util.Random;
/**
 *
 * @author dam1
 */
public class Boletín21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rm = new Random ();
        Métodos mtd = new Métodos () ;
        int notas[] = mtd.ponerNotas(rm, 30);
        mtd.AprobadosYSuspensos(notas);
        int maximo = mtd.máximaNota(notas);
        System.out.println("La nota máxima fué de " + maximo);
        double media = mtd.media(notas);
        System.out.println("La media de la clase fué de " + String.format("%.2f", media));
    }
    
    
}
