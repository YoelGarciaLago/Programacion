/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericosd;
import java.util.ArrayList;
/**
 *
 * @author dam1
 */
public class Caja <T>{
    private T contenido;
    ArrayList <T> lista = new ArrayList<>();
    public void meter(T elemento){
        lista.add(elemento);
    }
    public void mirar(){
        for (T i : lista){
            System.out.println(i);
        }
    }
}
