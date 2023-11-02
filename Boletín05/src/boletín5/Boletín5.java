

package boletín5;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletín5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
       
        
        
    Scanner sc= new Scanner (System.in);
   System.out.print("Mete los litros: ");
   float li=sc.nextFloat();
   System.out.print("Mete los km: ");
   float km= sc.nextFloat();
   System.out.print("Mete la vel.Media: ");
   float vM=sc.nextFloat();
   System.out.print("Precio Gasolina: ");
   float pGas=sc.nextFloat();
           
    Consumo consume= new Consumo ();
    consume.setLitros(li);
   consume.setKilometros(km);
   consume.setPrecioGasolina(pGas);
   consume.setVelocidadMedia(vM);
   System.out.println("Consumo medio =" + consume.ConsumoMedio()+ "litros/kms");
   System.out.println("Velocidad media = " + consume.getVelocidadMedia()+ "km/h");
   System.out.println("Tiempo viaje= " + consume.getTiempo()+ "horas");
   
   
   
   Consumo consumo = new Consumo(100,50,111, (float) 1.57);
   System.out.println("Consumo medio= "+ consumo.ConsumoMedio()+ "litros/km");
   System.out.println("Velocidad media= "+ consumo.getVelocidadMedia()+ "km/h");
   System.out.println("Tiempo viaje= "+ consumo.getTiempo()+ "horas");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
