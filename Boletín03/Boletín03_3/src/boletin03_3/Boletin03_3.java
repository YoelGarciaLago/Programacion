/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin03_3;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin03_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int billete100, billete20, billete5, moneda, suma;
        Scanner sc= new Scanner(System.in);
        System.out.println("dame el numero de billetes de 100");
        billete100= sc.nextInt();
        System.out.println("dame el numero de billetes de 20");
        billete20=sc.nextInt();
        System.out.println("dame el numero de billetes de 5");
        billete5=sc.nextInt();
        System.out.println("dame el numero de monedas de 1 euro");
        moneda=sc.nextInt();
        suma=billete100*100+billete20*20+billete5*5+moneda*1;
        System.out.println("suma= " + suma+" euros");
    }
    
}
