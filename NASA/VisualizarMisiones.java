/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nasa2;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class VisualizarMisiones extends JFrame {

    private JPanel centerPanel;
    private JPanel selectAndInfoPanel;
    private JTable missionsTable;
    private DefaultTableModel modelTable;
    private JComboBox<String> missionNameBox;
    private JTextArea missionsReport;
    private JButton confirm;


    public VisualizarMisiones() {
        setTitle("Misiones");
        setVisible(true);
        setBounds(600, 600, 600, 600);
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        add(centerPanel, BorderLayout.CENTER);

        modelTable = new DefaultTableModel(
                new Object[][]{
                        {},

                },
                new Object[]{"Misiones"}
        );
        missionsTable = new JTable(modelTable);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.CYAN); // Establecer el color de fondo deseado

        // Aplicar el renderizador personalizado a todas las celdas de la tabla
        for (int i = 0; i < missionsTable.getColumnCount(); i++) {
            missionsTable.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }


        JScrollPane scrollPane = new JScrollPane(missionsTable);
        scrollPane.setBackground(Color.BLACK);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        selectAndInfoPanel = new JPanel();
        selectAndInfoPanel.setLayout(new BorderLayout());
        centerPanel.add(selectAndInfoPanel, BorderLayout.SOUTH);

        missionNameBox = new JComboBox<>();
        for (String element:ModeloMision.getMissionName()){

            missionNameBox.addItem(element);
        }
        selectAndInfoPanel.add(missionNameBox, BorderLayout.WEST);
        missionsReport = new JTextArea();
        selectAndInfoPanel.add(new JScrollPane(missionsReport), BorderLayout.SOUTH);
        confirm = new JButton("confirmar");
        confirm.setBackground(Color.GREEN);
        confirm.setForeground(Color.WHITE);
        selectAndInfoPanel.add(confirm, BorderLayout.SOUTH);
        confirm.addActionListener(this::insertInformation);
    }

    public void insertInformation(ActionEvent e){

        if(checkEmptyContent()){
            String nameFile = (String) missionNameBox.getSelectedItem();
            confirm.setEnabled(true);
            try (FileReader fileReader = new FileReader(nameFile);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                String space = "";


                while ((line = bufferedReader.readLine()) != null) {

                    Object[] row = {line};
                    modelTable.addRow(row);
                    missionsReport.setText("Mostrando información de la mision: " + nameFile);

                }
                Object[] spacerow = {space};
                modelTable.addRow(spacerow);

            } catch (IOException ex) {
                missionsReport.setText("Lo sentimos, mision no encontrada o no hay misiones disponibles");
            }
        }

    }

    private boolean checkEmptyContent(){
        int selectIndex = missionNameBox.getSelectedIndex();
        return selectIndex != -1;
    }
}