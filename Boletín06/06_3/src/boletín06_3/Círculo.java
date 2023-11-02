/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín06_3;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author dam1
 */
public class Círculo {
   Scanner sc = new Scanner (System.in);
    private double r;
    private double d = Math.PI;
    
    
    
public Círculo(){
    
}


public Círculo(double ratio){
    r=ratio;
   
    
}

public void setRatio(double ratio){
    r=ratio;
}

public double CalcularLongitud(){
      
    
    return 2*d*r;
}

public double CalcularArea(){
     double a=Math.pow(r, 2);
       return a;
              
    
}



















}
