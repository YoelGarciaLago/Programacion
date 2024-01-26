/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín21_2;
import java.util.Random;
/**
 *
 * @author dam1
 */
public class Métodos {
    Random rm = new Random();
    public int[] ponerNotas (Random rm, int cantidadMax){
        int notas[] = new int [cantidadMax];
        for (int i = 0; i < notas.length ; i++){
            notas[i] = rm.nextInt(11);
        }
        return notas;
    }
    public int máximaNota (int notas[]){
        int maximo = notas [0];
        for (int i = 0 ; i < notas.length ; i++){
            if (maximo < notas [i]){
                maximo = notas [i];
            }
        }
        return maximo;
    }
    public void AprobadosYSuspensos (int notas[]){
        int aprobados = 0 , suspensos = 0;
        for (int i = 0 ; i < notas.length ; i++){
            if (notas[i]< 5){
                suspensos++;
            }
            else{
                aprobados++;
            }
        }
        int conjunto[] = {aprobados,suspensos};
        System.out.println("La cantidad de aprobados fué de " + conjunto[0]);
        System.out.println("La cantidad de suspensos fué de " + conjunto[1]);
        
    }
    public double media (int notas[]){
        int suma = 0;
        for (int nota : notas)
            suma += nota;
        double media = (double) suma / notas.length;
        return media;
    }
    
    
    
    
}
