/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín12;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Garaje {
        private Coche coche;
    private static final int NPlazas=5;
    private int i=0;
    private double cartosPagados=0, cartosAPagar=0, cambio;
    private int aparcados;
    private float tempo;

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche Coche) {
        this.coche = Coche;
    }

   
    
    public void plazas(){
        Garaje ob=new Garaje();
         do{
            String matricula=JOptionPane.showInputDialog("Matricula:");
            String marca=JOptionPane.showInputDialog("Marca:"); 
            Coche co=new Coche(matricula,marca);
            Garaje obj=new Garaje();
            ob.setCoche(co);
            JOptionPane.showMessageDialog(null, "Hay plazas :D");
            tempo=Float.parseFloat(JOptionPane.showInputDialog("Canto tempo vas botar?"));
            if(tempo<=3){
            cartosAPagar=tempo*1.5;    
            }
            else if(tempo>3){
             cartosAPagar=(3*1.5)+((tempo-3)*0.2);   
            }
            
            JOptionPane.showMessageDialog(null, "Tienes que pagar "+cartosAPagar+ " €");
            cartosPagados=Double.parseDouble(JOptionPane.showInputDialog("Cuanto vas a meter?:"));
            if(cartosAPagar>cartosPagados){   
            double diferencia;
            do {
                diferencia = Double.parseDouble(JOptionPane.showInputDialog("Te faltan " + (cartosAPagar - cartosPagados)));
                if (diferencia > 0 ) {
                    cartosPagados += diferencia;
                } else {
                    JOptionPane.showMessageDialog(null, "Hay que meter dinero ._.");
                }
            } while (cartosPagados < cartosAPagar);
        
                
                
            }
           cambio=cartosPagados-cartosAPagar;
            JOptionPane.showMessageDialog(null, "FACTURA \nMatrícula: "+co.getMatricula()+"\nTempo: "+tempo+"\nPrecio: "+cartosAPagar+"\nCartos recibidos: "+cartosPagados+"\nCartos devoltos: "+cambio+"\nGRAZAS POR USAR O NOSO APARCADOIRO :)");
            aparcados++;
            int respuesta=JOptionPane.showConfirmDialog(null, "Hay más gente que quiera aparcar?");
            if(respuesta==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Se acabó por ahora");
                break;
            }
            if(respuesta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Pues a buscar sitio!");
            }
        }while(NPlazas>aparcados);
       if(NPlazas==aparcados ){
            JOptionPane.showMessageDialog(null, "Completo :/");
            int respuesta=JOptionPane.showConfirmDialog(null, "Ves a alguien saliendo?");
            if(respuesta==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Lo sineto, tendrá que buscaar otro lugar para aparcar ;(");
            }
            else if(respuesta==JOptionPane.YES_OPTION){
                aparcados--;
                ob.plazas();
            }
        } 
    } 
    
}
