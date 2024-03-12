/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín27;
import boletín27.Métodos;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Menú {
    
    Métodos mtd = new Métodos();
    
    public static final int ENGADIR = 1;
    public static final int CONSULTAR = 2;
    public static final int AMOSAR = 3;
    public static final int BORRAR = 4;
    public static final int MODIFICAR = 5;
    public static final int FIN = 0;
    
    private static Menú instance = null;
    
   /* private Menú(){
        
    }*/
    
    public void factory (){
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué quieres hacer?\n1.Engadir\n2.Consultar\n3.Amosar\n4.Borrar\n5.Modificar\n(Pulsa 0 para finalizar)"));
    switch (opcion){
        case ENGADIR:
            mtd.engadir();
            break;
        case CONSULTAR:
            mtd.consultar();
            break;
        case AMOSAR:
            mtd.amosar();
            break;
        case BORRAR:
            mtd.borrarSinExistencias();
            break;
        case MODIFICAR:
            mtd.modificar();
            break;
        case FIN:
            System.out.println("Gracias por usar el programa");
            return;
        default:  
            System.out.println("Hubo un error, volviendo a empezar");
            factory();
        }
    }
    
    public static Menú getInstance(){
        if (instance == null){
            instance = new Menú();
        }
        return instance;
    }
}
