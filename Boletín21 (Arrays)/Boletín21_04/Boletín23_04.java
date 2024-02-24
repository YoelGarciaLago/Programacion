/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín23_04;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Map;

/**
 *
 * @author dam1
 */
public class Boletín23_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String aux = null;
        Métodos mtd = new Métodos();
        String [] letras = {"A","B","C","D","E","F","G","H","I","J","k","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int [] numeros = {3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14 };
        Map<String,Integer> conjunto = new HashMap<>();
        conjunto = mtd.ponerElementos(letras, numeros);
        int NIF = Integer.parseInt(JOptionPane.showInputDialog("Deme el NIF (sin la letra)"));
        int resultado = NIF%23;
        for (Map.Entry<String, Integer> entrada : conjunto.entrySet()){
            if (entrada.getValue() == resultado){
                aux = entrada.getKey();
                break;
            }
            else{
                aux = null;
            }
        }
        if (aux != null){
            JOptionPane.showMessageDialog(null, "Para el NIF " + NIF + " tiene la letra " + aux);
        }
        else {
            JOptionPane.showMessageDialog(null, "Pusiste algo mal pendejo");
        }
    }
    
}
