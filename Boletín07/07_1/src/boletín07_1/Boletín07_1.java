
package boletín07_1;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín07_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner (System.in);
            Positivo_Negativo obj= new Positivo_Negativo();
        System.out.print("Num1: ");
        obj.positivoNegativo(sc.nextShort());
    
    }
    
}
