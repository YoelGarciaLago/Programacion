/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín23_04;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author dam1
 */
public class Métodos {
    public Map<String,Integer> ponerElementos (String letras[],int numeros[]){
        Map<String,Integer> mapa = new HashMap<>();
        for (int i = 0; i < letras.length && i < numeros.length; i++){
            mapa.put(letras[i], numeros[i]);
        }
        return mapa;
    }
    
    
}
