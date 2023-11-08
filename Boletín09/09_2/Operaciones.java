
package boletín09_2;

/**
 *
 * @author dam1
 */
public class Operaciones {
    private int i= 10;
    private int suma=0;
    private int producto=1;
    public void Sumar (){
        while ( i<=90){
            suma+=i;
            i++;
            
        }
        System.out.println("Total --> "+ suma);
    }
    public void Producto(){
        while (i<=90){
            producto *= i;
            i++;
            
        }
        System.out.println("Total --> "+ producto);
    }
}
