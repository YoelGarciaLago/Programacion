/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros02;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author dam1
 */
public class Ficheros02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        String ruta ="/home/dam/NetBeansProjects/Ficheros02/src/ficheros02/tareas.txt";
        
        try{
            FileReader fr = new FileReader(ruta);
            BufferedReader bf = new BufferedReader(fr);
            
            String linea;
            
            while((linea = bf.readLine()) != null){
                System.out.println(++i + ". " + linea);
            }    
                }catch(IOException e ){
                System.out.println("Error " + e.getMessage()); 
        }
    }
    
}
