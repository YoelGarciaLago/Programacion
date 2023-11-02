/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín07_4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class nome_peso {
 Scanner sc= new Scanner (System.in);
 private String nome1;
 private String nome2;
 private double peso1;
 private double peso2;
 
 public void ponerNombres(String nome1, String nome2){
     this.nome1=nome1;
     this.nome2=nome2;
 }
 
 public void ponerPesos(double peso1, double peso2){
     this.peso1=peso1;
     this.peso2=peso2;
 }
 
 public void comparacion(){
     if (peso1>peso2){
         System.out.println(nome1 + " pesa " + (peso1-peso2) + " kg's más");
     }
     else if (peso1<peso2){
         System.out.println(nome2 + " pesa " + (peso2-peso1) + " kg's más");
     
     }
     else {
         System.out.println(nome1 + " pesa lo mismo que " + nome2);
     }
 }
 
 
 
 
 
 
}
