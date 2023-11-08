/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín09_1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Números {
    private int positivos;
    private int negativos;
    private int ceros;
    private int i;
    public void Contar(){
        while (i<10){
            int a=Integer.parseInt(JOptionPane.showInputDialog("Teclea un nº"));
            if(a>0){
                positivos++;
                
            }
            else if(a<0){
                negativos++;
                
            }
            else{
                ceros++;
            }
            i++;
        }
        System.out.println("Nº positivos --> "+ positivos);
        System.out.println("Nº negativos --> "+ negativos );
        System.out.println("Nº ceros --> "+ ceros);
    }
    
    
}
