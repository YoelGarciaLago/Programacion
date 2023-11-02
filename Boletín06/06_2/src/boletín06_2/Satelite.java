/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín06_2;

/**
 *
 * @author dam1
 */
public class Satelite {
  private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;
   

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}

public void Satelite ( double m,  double p, double d){
       
meridiano = m;
paralelo = p;
distanciaTerra = d ;

}
public String verPosicion ( ) {

      
      return ( "O satelite atopase no paralelo " + paralelo + " meridiano "  +  meridiano  + " a unha distancia da terra " + distanciaTerra);



    
}
}
