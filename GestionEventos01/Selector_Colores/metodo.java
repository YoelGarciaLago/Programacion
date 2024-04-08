package selectorcolores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author admin
 */
public class metodo extends JFrame implements ItemListener {
    private JComboBox <String> colores;
    private JPanel coloresPanel ;
   
    public metodo(){
        super("Selector");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
       
          JPanel controles = new JPanel();
        colores = new JComboBox<>(new String[]{" ","Rojo", "Verde", "Azul"});
        colores.addItemListener(this);
        controles.add(new JLabel("Selecciona un color:"));
        controles.add(colores);

       
        coloresPanel = new JPanel();
        coloresPanel.setPreferredSize(new Dimension(200, 100));
        coloresPanel.setBackground(Color.white);
   
        add(controles,BorderLayout.NORTH);
        add(coloresPanel,BorderLayout.CENTER);
   
       
   
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getStateChange() == ItemEvent.SELECTED ){
            String seleccion = (String) colores.getSelectedItem();
            switch(seleccion){
                case "Rojo":
                    coloresPanel.setBackground(Color.RED);
                    break;
                case "Azul":
                    coloresPanel.setBackground(Color.BLUE);
                    break;
                case "Verde":
                    coloresPanel.setBackground(Color.GREEN);
                    break;
                default:
                    coloresPanel.setBackground(Color.WHITE);
                    break;
            }
        }
    }
}