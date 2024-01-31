/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín21_3;
import java.util.Random;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 *
 * @author dam1
 */
public class Métodos {
    Random rm = new Random();
    Scanner sc = new Scanner (System.in);
    
    
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
    public Map<String,Integer>  ponerElementos (String alumnos[], int notas[]){
        Map<String,Integer> mapa = new HashMap <>();
        for (int i = 0 ; i < alumnos.length && i < notas.length ; i++){
            mapa.put(alumnos[i], notas[i]);
        } 
        return mapa;
    }
    
    public Integer buscarNota (Map<String,Integer> mapa, String nombre){
        return mapa.get(nombre);
    }
    
    public void ordenarYMostrar (Map <String,Integer> mapa){
        int resp = JOptionPane.showConfirmDialog(null, "¿Quieres mostrar las notas ordenadas?");
        if (resp == JOptionPane.YES_OPTION){
            Map <String, Integer> nuevoMapa = mapa.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, 
                            Map.Entry::getValue,
                            (e1,e2) ->e1,
                            LinkedHashMap :: new
                    ));
            System.out.println("Lista ordenada por nota:");
             for (Map.Entry<String,Integer> salida:nuevoMapa.entrySet()){
                System.out.println("Alumno: "+salida.getKey()+ "\tNota: "+salida.getValue());
        }
        }
        if (resp != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Pues no se mostrará");
        }
    }
    
    
}
