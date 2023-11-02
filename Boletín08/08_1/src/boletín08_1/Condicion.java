/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín08_1;

/**
 *
 * @author dam1
 */
public class Condicion {
    private String artigo1;
    private int nVent;
    
    
    
public Condicion(){
    
}
public void poñerNome(String artigo1){
    this.artigo1=artigo1;
}

public void nVentas(int nVentasArt1){
    this.nVent=nVentasArt1;
}

public void condicion(){
    if (nVent<=100){
        System.out.println("Ventas baixas");
    }
    else if (nVent>100 && nVent<=500){
        System.out.println("Ventas medias");
    }
    else if (nVent>500 && nVent<=1000){
        System.out.println("Ventas altas");
    }
    else if (nVent>1000){
        System.out.println("1ra necesidade");
    }
}




}
