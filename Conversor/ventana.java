
package conversor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dam33
 */
public class ventana extends JFrame implements ActionListener{
    
    private JButton calcular;
    private JTextField celsius;
    private JTextArea fahrenheit;
    
    public ventana (){
        setTitle("Conversor");
        setLayout(new BorderLayout());
        setSize(800, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        calcular = new JButton("Pasar");
        calcular.addActionListener(this);
        celsius = new JTextField(10);
        fahrenheit = new JTextArea(1,10);
        fahrenheit.setEditable(false);
        panel.add(new Label("Celsius"));
        panel.add(celsius  );
        panel.add(new Label("Farenheit"));
        panel.add(fahrenheit);
        add(panel,BorderLayout.NORTH);
        add(calcular,BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Metodo mtd = new Metodo();
        double tempCelsius = Double.parseDouble(celsius.getText());
       double tempFahrenheit = 0;
        if (ae.getSource() == calcular){
           tempFahrenheit = mtd.conversorTemp(tempCelsius);
        }
        fahrenheit.setText(null);
        fahrenheit.setText(String.valueOf(tempFahrenheit));

    }
}
