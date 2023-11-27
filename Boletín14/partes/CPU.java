/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín14.partes;

/**
 *
 * @author dam1
 */
public class CPU {
   
    
    private float velocidade;

    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public CPU(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidade=" + velocidade + '}';
    }
    
    
}
