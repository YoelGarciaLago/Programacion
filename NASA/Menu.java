/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nasa2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu extends JFrame{
    private JPanel centerPanel;
    private JPanel buttonsPanel;
    private JButton createMisionButton;
    private JButton assignShipsAndCrewButton;
    private JButton viewMissionStatus;
    private JButton reportButton;


    public Menu(){
        setTitle("NASA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
setBounds(600, 600, 600, 600);

centerPanel = new JPanel();
centerPanel.setLayout(new GridLayout(2, 2));
add(centerPanel);

createMisionButton = new JButton("Crear Mision");
assignShipsAndCrewButton = new JButton("Asignar naves y tripulaciones");
viewMissionStatus = new JButton("Visualizar  mision");
reportButton = new JButton("Reportes y Trayectorias de las naves");

centerPanel.add(createMisionButton);
centerPanel.add(assignShipsAndCrewButton);
centerPanel.add(viewMissionStatus);
centerPanel.add(reportButton);

        createMisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ModeloMision();
            }
        });
        assignShipsAndCrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ModeloNaveTripulacion();
            }
        });
        viewMissionStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VisualizarMisiones();
            }
        });
        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerReporte();
            }
        });
    }




}