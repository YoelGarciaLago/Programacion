/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericos2;

/**
 *
 * @author dam1
 */
public class Genericos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        wawa wawaint = new wawa ();
       int [] lista = {1,2,3,4,5};
       int [] listaCambiada = wawaint.intercambio(lista, 0, 1);
       for(int i : listaCambiada){
           System.out.println(i);
       }
    }
     
    
}
