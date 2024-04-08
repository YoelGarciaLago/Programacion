package calc;

import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author admin
 */
public class metodo extends JFrame implements ActionListener{
     JButton botonSumar, botonRestar;
    JTextField numerandoUno, numerandoDos;
    JTextArea resultado ;
    int op1, op2, res = 0;
    public metodo(){
    setTitle("Calculadora");
        setLayout(new GridLayout(5,10));
       
        numerandoUno = new JTextField(10);
        numerandoDos = new JTextField(10);
        resultado = new JTextArea(1,10);
        add(new Label("Nº1"));
        add(numerandoUno);
       // add(Box.createHorizontalStrut(150));
        add(new Label("Nº2"));
        add(numerandoDos);
        //add(Box.createHorizontalStrut(150));
       
       
        botonSumar = new JButton("Sumar");
        botonSumar.addActionListener(this);
        add(Box.createHorizontalStrut(150));
        botonRestar = new JButton("Restar");
        botonRestar.addActionListener(this);
           
       
        add(botonSumar);
        add(botonRestar);
        add(new Label("Resultado"));
        add(resultado);
        resultado.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,200);
    setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
         try{
            op1 = Integer.parseInt(numerandoUno.getText());
            op2 = Integer.parseInt(numerandoDos.getText());
            if (ae.getSource() == botonSumar){
                res = op1 + op2;
            }
            else{
                res = op1 - op2;
            }
           resultado.setText(String.valueOf(res));

        }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(this,"Error", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}