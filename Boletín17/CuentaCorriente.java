/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín17;

/**
 *
 * @author dam1
 */
public class CuentaCorriente extends Conta {
    private double Interes=1.5;

    public CuentaCorriente() {
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }

    
    @Override
    public String toString() {
        return super.toString()+ "CuentaCorriente{" + "Interes=" + Interes + '}';
    }
    
    
}
