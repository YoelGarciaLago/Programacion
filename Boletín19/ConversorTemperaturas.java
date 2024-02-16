/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletín19;

/**
 *
 * @author dam1
 */
public class ConversorTemperaturas {
    private final float graosC=80;

    public ConversorTemperaturas() {
    }

    public float getGraosC() {
        return graosC;
    }
    
    public float centigradosAFharenheit(float graosC){
        float graosF=(float) (9/5*graosC+32.4);
        return graosF;
    }
    public float centigradosAReamur(float graosC){
        float graosR=(float) (0.8*graosC);
        return graosR;
    } 
    
}
