/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín09_3;
import javax.swing.JOptionPane;
/*
 *
 * @author dam1
 */
public class DatosPositivos {
    private float base;
    private float altura;
    private float area;

    
    public void ponerBase(){
      do{
          base=Float.parseFloat(JOptionPane.showInputDialog("Base:"));
         if(base<=0){
                       System.out.println("Pon bien la base >:(");

         }
      }while(base<=0);
    }
    
    public void ponerAltura(){
        do{
            altura=Float.parseFloat(JOptionPane.showInputDialog("Altura:"));
            if(altura<=0){
                System.out.println("Pon bien la altura >:(");
            }
        }while(altura<=0);
    }
    
    public void darArea(){
        area=base*altura;
        JOptionPane.showMessageDialog(null, "Área: "+ area);
    }
    
    
}
