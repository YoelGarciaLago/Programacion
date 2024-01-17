/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín.pkg20;

/**
 *
 * @author dam1
 */
public class Persoa implements IPodeCantar {
    
  @Override
    public void cantar(){
        System.out.println("Ahora canta una persona");
    }
    @Override
    public void cantarConNotasMusicales(){
        System.out.println("La persona canta notas musicales");
    }
}
