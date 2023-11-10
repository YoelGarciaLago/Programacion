/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín09_5;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Sueldos {
    private int sueldosAltos;
    private int sueldosBajos;
    private int sueldosNormales;
    private float i;
    Scanner sc=new Scanner(System.in);
  
    public void ContadorSueldos(){
      
        do{
            System.out.println("Pon el salario (no puede ser 0 o menos): ");
           i = sc.nextFloat();
        if(i<1000){
            sueldosBajos++;
        }
        else if (i>=1000 && i<=1750){
            sueldosNormales++;
        }
        else{
            sueldosAltos++;
        }
        }while(i>0);   
      }
       public void mostrarSueldos(){
           System.out.println("Sueldos bajos: "+sueldosBajos+ "\nSueldos altos: "+sueldosAltos+ "\nSueldos normales: "+sueldosNormales);
       }
    }

