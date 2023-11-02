/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package boletín06_1;

/**
 *
 * @author dam1*/
 import java.util.Scanner;
public class coche {
private int vel;

Scanner sc= new Scanner(System.in);

public coche(){
 int vel=0;   
}

public coche (int vel ){
   this.vel=vel; 
}


public int getVelocidad(){
    return vel;
}


        
    

public int aceleracion(){
    System.out.print("Aceleracion: ");
    int valor= sc.nextInt();
    int acelerar= vel+valor;
    return acelerar;

}



public int frenar (){
    System.out.print("Frenado: ");
    int menos= sc.nextInt();
    return vel-menos;



}










    
}
