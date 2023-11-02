/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín5;

/**
 *
 * @author dam1
 */
public class Consumo {
    
    private float kilometros;
    private float litros;
    private float velocidadMedia;
    private float precioGasolina;             

//constr defecto
public Consumo () {    
}
//constr parametrizado
public Consumo (float km, float l, float vM, float pGas){
    kilometros=km;
    litros=l;
    velocidadMedia=vM;
    precioGasolina=pGas;
}

public void setKilometros (float km){
    kilometros=km;
}

public void setVelocidadMedia(float vM){
    velocidadMedia=vM;
}

public float getTiempo(){
 
    return velocidadMedia*kilometros;

}

public float ConsumoMedio(){
    return (int) litros/kilometros*100;
}        

public float Euros (){
   
        return  (litros/kilometros*100*precioGasolina);
}

public void setLitros(float l){
 litros=l;
}

public void setPrecioGasolina(float pGas){
    precioGasolina=pGas;
}

public float getKMS(){
    return kilometros;
}

public float getVelocidadMedia(){
    return velocidadMedia;
}
public float getPrecioGasolina(){
    return precioGasolina;
}
public float getLitros(){
    return litros;
    
}


}




