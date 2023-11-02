/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin03_4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin03_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int euros, billete100, billete20, billete5, moneda;
        Scanner sc = new Scanner(System.in);
        System.out.println("dame el total de euros");
        euros=sc.nextInt();
        billete100=euros/100;
        euros%= 100;
        System.out.println("billete de 100="+ billete100);
        billete20=euros/20;
        euros%= 20;
        System.out.println("billete de 20="+ billete20);
        billete5=euros/5;
        euros%= 5;
        System.out.println("billete de 5="+ billete5);
        moneda=euros/1;
        System.out.println("moneda="+ moneda);
    }
    
}
