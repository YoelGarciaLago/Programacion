/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instadam;
import javax.swing.JOptionPane;
import java.util.HashMap;


/**
 *
 * @author dam33
 */
public class Mensajes {
  
    private String nombreUsuario;
    private String mensaje;

    public Mensajes(String nombreUsuario, String mensaje) {
        this.nombreUsuario = nombreUsuario;
        this.mensaje = mensaje;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }
}
    

