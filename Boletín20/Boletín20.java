/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín.pkg20;

/**
 *
 * @author dam1
 */
public class Boletín20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        galo obG= new galo();
        Persoa obP= new Persoa();
        Canario obC= new Canario();
        Tenor obT= new Tenor();
        obG.cantar();
        obP.cantarConNotasMusicales();
        obC.cantar();
        obT.cantar();
    }
    
}
