/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín08_2;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Formas {
  private int tipo;
    
    public Formas(){
        
    }


public void selectTipo(int tipo){
    this.tipo=tipo;
}

public void condicion(){
    switch (tipo){
        case 1: 
            float lado=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto vale el lado?"));
            System.out.println("Área del cuadrado: "+ lado*lado);
            break;
        case 2: 
            float radio= Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto vale el lado?"));
            System.out.println("Área del círculo: "+ Math.PI*(radio*radio));
            break;
        case 3:
            float base= Integer.parseInt(JOptionPane.showInputDialog("¿Base?"));
            float altura= Integer.parseInt(JOptionPane.showInputDialog("¿Altura?"));
            System.out.println("Área del triangulo: "+ (base*altura)/2);
            break;
        default : System.out.println("Pon una opción válida");
    }
    
}
























}

