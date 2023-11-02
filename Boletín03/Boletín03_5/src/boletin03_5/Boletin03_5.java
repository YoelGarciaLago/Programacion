/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin03_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin03_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               float sueldofijo, sueldobruto, comision, itv, quilometraje, km, dietas,ddpmt, sueldoliquido, IRPF, rss=36 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el sueldo fijo");
        sueldofijo=sc.nextFloat();
        System.out.println("dime la comision del importe total de ventas");
        itv=sc.nextFloat();
        comision=5%itv;
        System.out.println("dime el kilometraje");
        km=sc.nextFloat();
        quilometraje=2*km;
        System.out.println("dime los dias de desplazamiento");
        ddpmt=sc.nextFloat();
        dietas=30*ddpmt;
        IRPF=18%sueldofijo;
        sueldobruto=sueldofijo+comision+quilometraje+dietas;
        sueldoliquido=sueldobruto-IRPF-rss;
        System.out.println("tu sueldo bruto es ="+ sueldobruto+" $");
        System.out.println("tu sueldo liquido es ="+ sueldoliquido+" $");
    }
    
}
