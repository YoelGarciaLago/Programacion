/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin03_1;

import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin03_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

        float precinicial, precfinal, porcentaje;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el precio inicial");
        precinicial=sc.nextFloat();
        System.out.println("dime el precio final");
        precfinal=sc.nextFloat();
        porcentaje=(100-(precfinal/precinicial)*100);
        System.out.println("el porcentaje es= " + porcentaje +" %");
    }

    }
    

