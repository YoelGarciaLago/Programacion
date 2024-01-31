/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín21_3;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletín21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resp, resp1;
        
        Random rm = new Random ();
        Scanner sc = new Scanner (System.in);
        Métodos mtd = new Métodos () ;
        
        int notas[] = mtd.ponerNotas(rm, 30);
        
       
        mtd.AprobadosYSuspensos(notas);
        
        //Máximo
        int maximo = mtd.máximaNota(notas);
        System.out.println("La nota máxima fué de " + maximo);
        
        //Media
        double media = mtd.media(notas);
        System.out.println("La media de la clase fué de " + String.format("%.2f", media));
        
        //Los Strings son cosas raras porque es un coñazo poner 30 nombres.
        String alumnos[]={" Hugo ","Martín","Lucas","Mateo","Leo","Daniel","Alejandro","Pablo","a","A","d","D","QW","W","q","g","G","v","V","x","z","Sergio","Z","t","T","Gael","2","1","Diego","Adrián"};
        
        //Creación del mapa
        Map <String,Integer> mapa = new HashMap<>();
        mapa = mtd.ponerElementos(alumnos, notas);
        
        //Mostrar las listas juntas
        System.out.println("Lista de alumnos: ");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Alumno: " + entry.getKey() + "\tNota: " + entry.getValue());
            }
        
        //Buscador de alumnos 
        resp = JOptionPane.showConfirmDialog(null, "¿Quieres buscar a un alumno?");
        if(resp == JOptionPane.YES_OPTION){
            do{
                String nombre = JOptionPane.showInputDialog("¿A quien quieres buscar?");
                Integer busqueda = mtd.buscarNota(mapa, nombre);
                if (busqueda == null){
                    JOptionPane.showMessageDialog(null, nombre + " no existe en la lista de los alumnos");
                }
                else 
                    JOptionPane.showMessageDialog(null, nombre + " tiene de nota "+ busqueda);
             resp1 = JOptionPane.showConfirmDialog(null, "¿Quieres buscar a otro?");
        }while(resp1 == JOptionPane.YES_OPTION);
             
    
        }
        else if(resp == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Ok, seguiremos con el programa ;)");
        }
        else if (resp == JOptionPane.CLOSED_OPTION || resp == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Me lo tomaré como un no :v");
        }
        mtd.ordenarYMostrar(mapa);
        }
        
        

        
    }
    
    

