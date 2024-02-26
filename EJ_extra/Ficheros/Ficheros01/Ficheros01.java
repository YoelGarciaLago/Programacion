/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros01;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author dam1
 */
public class Ficheros01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "/home/dam/NetBeansProjects/Ficheros01/src/ficheros01/wawa.txt";
        try{
            FileReader fr = new FileReader (ruta);
            BufferedReader bf = new BufferedReader(fr);
            
            String linea;
            
            while((linea = bf.readLine()) != null){
                System.out.println(linea);
            }
            bf.close();
        } catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        
            
        }
    }