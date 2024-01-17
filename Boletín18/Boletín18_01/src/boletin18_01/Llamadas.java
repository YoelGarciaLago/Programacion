/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin18_01;

import javax.swing.JOptionPane;

/**
 *
 * @author 4
 */
public class Llamadas {
    
    private int minutos,resp;
    
    private double precio,impuesto;
    

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

  
    
    public void llamadas (){
       Llamadas ob=new Llamadas();
        do{
        minutos=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos minutos vas a usar?"));
       
       if(minutos<=5){
           precio=minutos;
       }
       else if(minutos>5 && minutos<=8){
       precio= 5 + (minutos-5)*0.8;    
       }
       else if( minutos>8 && minutos<=10){
           precio=5 + 3*0.8+(minutos-8)*0.7;
       }
       else{
           precio=5+3*0.8+2*0.7+(minutos-10)*0.5;
       }
       
       int resp01=JOptionPane.showConfirmDialog(null, "Va a realizar la llamada un domingo?");
       
       if(resp01==JOptionPane.YES_OPTION){
           impuesto=0.03;
           JOptionPane.showMessageDialog(null, "Su impuesto será del 3%");
           JOptionPane.showMessageDialog(null, "El coste total será: "+(precio+(precio*impuesto)));
       }
       else if(resp01==JOptionPane.NO_OPTION){
           int resp02=Integer.parseInt(JOptionPane.showInputDialog("Cuando va a ser: \n1-->Turno de mañana \n2-->Turno de tarde"));
           switch(resp02){
               case 1:
                   impuesto=0.15;
                   JOptionPane.showMessageDialog(null, "Su impuesto será del 15%");
                   JOptionPane.showMessageDialog(null, "El coste total será: "+(precio+(precio*impuesto)));
                   break;
               case 2:
                   impuesto=0.1;
                   JOptionPane.showMessageDialog(null, "Su impuesto será del 10%");
                   JOptionPane.showMessageDialog(null, "El coste total será: "+(precio+(precio*impuesto)));
                   
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Error, tendrá que volver a introducir los datos nuevamente");
                   resp=JOptionPane.YES_OPTION;
                   break;   
               }
                   
               }
       resp=JOptionPane.showConfirmDialog(null, "Quiere hacer otra llamada?");
        
        
        
    }while(resp==JOptionPane.YES_OPTION );
    
        if(resp!=JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio :)");
        }
    }
    
}
    

                   
                   
                       
                   
                           
                               
                                 
                   
                       
                   
                       
                      
       
                   
                       
                
       
       
         
       
       
           

