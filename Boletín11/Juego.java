/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín11_1;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Juego {
      private int numAdivinar;
    private int intentos;
    private int i=0;
    private int adivinanza;
    private int respuesta;
   
    public void juego(){
        Juego juego=new Juego();
        do{
            numAdivinar=Integer.parseInt(JOptionPane.showInputDialog( "Pon un nº valido"));
            
        
        }while(numAdivinar<1 || numAdivinar>50);
        do{
            intentos=Integer.parseInt(JOptionPane.showInputDialog("Nº de intentos"));
            if(intentos<=1){
                JOptionPane.showMessageDialog(null, "Dale más intentos");
            }
        }while(intentos<=1);
        
        JOptionPane.showMessageDialog(null, "Comienza el juego :)");
        
        do{
            adivinanza=Integer.parseInt(JOptionPane.showInputDialog("Adivina el nº"));
            
            if(adivinanza<numAdivinar){
                JOptionPane.showMessageDialog(null, "Prueba algo más grande");
            }
            if(adivinanza>numAdivinar){
                JOptionPane.showMessageDialog(null, "Prueba algo más pequeño");
            }
            i++;
        }while(adivinanza!=numAdivinar && i<intentos);
        
        if(adivinanza==numAdivinar){
            JOptionPane.showMessageDialog(null, "Acertaste");
            respuesta=JOptionPane.showConfirmDialog(null, "Quieres volver a jugar?");
            if(respuesta==JOptionPane.YES_OPTION){
                juego.juego();
            }
            if(respuesta==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Fin de juego :/");
            }
        }
        if(i>=intentos ){
            JOptionPane.showMessageDialog(null , "Te quedaste sin intentos :/");
            respuesta=JOptionPane.showConfirmDialog(null, "Quieres continuar?");
            if(respuesta==JOptionPane.YES_OPTION){
                juego.juego();
            }
            else if(respuesta==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Fin del juego ;(");
            }
          
                
            }
        }
    }
    


    

