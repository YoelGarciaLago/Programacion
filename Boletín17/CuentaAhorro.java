/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín17;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class CuentaAhorro extends Conta {
    private double interesVariable, saldoMinimo;
    private int anos;

    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }
    
    
    public void comprobarMinimos(){
        if (saldoMinimo<1000){
            JOptionPane.showMessageDialog(null,"No tienes suficiente saldo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Cumples los mínimos :)");
        }
    }
    
    public int añosTotales(){
        anos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años van a ser?"));
        if(anos<1){
            
        
            do{
            anos=Integer.parseInt(JOptionPane.showInputDialog("Tienes que poner más años"));
            }while(anos<1);
        }
        return anos;
        
    }
    
    
    
}
