/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín.pkg20;

/**
 *
 * @author dam1
 */
public class galo implements IPodeCantar{
    @Override
    public void cantar(){
        System.out.println("Ahora canta un gallo");
    }
    @Override
    public void cantarConNotasMusicales(){
        System.out.println("El gallo canta notas musicales");
    }
}
