/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín07_5;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Comparar {
Scanner sc=new Scanner (System.in);
private int valor1;
private int valor2;
private int valor3;

public void ponerValores(int n1, int n2, int n3){
   this.valor1=n1;
   this.valor2=n2;
   this.valor3=n3;
   
}

public void comparacion(){
    if (valor1>valor2 && valor1>valor3 ){
        System.out.println(valor1 + " es el valor más grande");
    }
    else if (valor2>valor1 && valor2>valor3){
        System.out.println(valor2 + " é o valor máis grande ");
    }
    else {
        System.out.println(valor3 + " é o valor máis grande");
    }
    
    
    
}





}
