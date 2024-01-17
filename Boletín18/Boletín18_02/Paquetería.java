/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín18_02;

import javax.swing.JOptionPane;

/**
 *
 * @author 4
 */
public class Paquetería {
    private int zona,resp;
    private double precio,peso;

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void servicios(){
        JOptionPane.showMessageDialog(null , "Bienvenido, a continuación podrá enviar sus paquetes a destinatarios de todo el mundo");
         peso=Double.parseDouble(JOptionPane.showInputDialog("Cuantos kilos van a ser? \nNo puede llegar a los 5kg's"));
        if (peso>=5){
            do{
                peso=Double.parseDouble(JOptionPane.showInputDialog("El peso es mayor al permitido >:["));
            }while(peso>=5);
        }
        JOptionPane.showMessageDialog(null, "Estos son nuestros servicios: \n1. América del Norte ----> 24€/kg \n2. América Central ------> 20€/kg \n3. América del Sur ------> 21€/kg \n4. Europa --------> 10€/kg \n5. Asia ------------> 18€/kg  ");
        int resp01=Integer.parseInt(JOptionPane.showInputDialog("Cual va a ser su destino? \n1. América del Norte \n2. América Central \n3. América del Sur \n4. Europa \n5. Asia"));
        switch (resp01){
            case 1:
                    JOptionPane.showMessageDialog(null, "Pues nos vamos a Norteamérica");
                    precio=24;
                    break;
            case 2:
                JOptionPane.showMessageDialog(null, "Pues nos vamos a América Central");
                precio=20;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pues nos vamos a América del Sur");
                precio=21;
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Pues nos vamos a Europa");
                precio=10;
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Pues nos vamos a Asia");
                precio=18;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, el programa se reiniciará");
                break;
             }
        JOptionPane.showMessageDialog(null, "El precio será de : "+(precio*peso));
        resp=JOptionPane.showConfirmDialog(null, "Quiere continuar?");
        if(resp==JOptionPane.YES_OPTION){
            Paquetería ob= new Paquetería ();
            ob.servicios();
        }
        else{
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio :]");
        }
               
                    
                    

    }
}
