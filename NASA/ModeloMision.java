/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nasa2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ModeloMision extends JFrame {

    private JPanel centerPanel;
    private JPanel informationPanel;
    private JLabel missionNameIndicator;
    private JTextField misiionNameText;
    private JLabel releaseDateIndicator;
    private JTextField releaseDateText;
    private JLabel targetIndicator;
    private JTextField targetText;
    private JLabel misionStatementIndicator;
    private JTextField missionStatementText;
    private JLabel spacecraftAndCrewMembersIndicatorUsed;
    private JComboBox<String> spacecraftUsedList;
    private JTextArea confirmAreaText;
    private JButton confirm;
    private static ArrayList <String> missionName = new ArrayList<>();



    public ModeloMision() {

        // Configuración de la ventana principal
setTitle("Crear Misiones");
setSize(600, 600);
setLocationRelativeTo(null); // Centra la ventana en la pantalla
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

// Panel principal con diseño BorderLayout
centerPanel = new JPanel(new BorderLayout());
add(centerPanel);

// Panel de información con fondo negro y borde cyan
informationPanel = new JPanel();
informationPanel.setBackground(Color.BLACK);
Border border = BorderFactory.createLineBorder(Color.CYAN, 10);
informationPanel.setBorder(border);
informationPanel.setLayout(new GridBagLayout());
centerPanel.add(informationPanel, BorderLayout.CENTER);

// Configuración de los elementos de información con GridBagConstraints
GridBagConstraints gbc = new GridBagConstraints();
gbc.insets = new Insets(10, 10, 10, 10);

// Nombre de la misión
gbc.gridx = 0;
gbc.gridy = 0;
missionNameIndicator = new JLabel("Nombre de la misión");
missionNameIndicator.setForeground(Color.WHITE);
informationPanel.add(missionNameIndicator, gbc);

gbc.gridy = 1;
        JTextField missionNameText = new JTextField(15);
informationPanel.add(missionNameText, gbc);

// Fecha de lanzamiento
gbc.gridx = 1;
gbc.gridy = 0;
releaseDateIndicator = new JLabel("Fecha de lanzamiento");
releaseDateIndicator.setForeground(Color.WHITE);
informationPanel.add(releaseDateIndicator, gbc);

gbc.gridy = 1;
releaseDateText = new JTextField(15);
informationPanel.add(releaseDateText, gbc);

// Objetivo de la misión
gbc.gridx = 2;
gbc.gridy = 0;
targetIndicator = new JLabel("Objetivo de la misión");
targetIndicator.setForeground(Color.WHITE);
informationPanel.add(targetIndicator, gbc);

gbc.gridy = 1;
targetText = new JTextField(15);
informationPanel.add(targetText, gbc);

// Estado de la misión
gbc.gridx = 3;
gbc.gridy = 0;
        JLabel missionStatementIndicator = new JLabel("Estado de la misión");
missionStatementIndicator.setForeground(Color.WHITE);
informationPanel.add(missionStatementIndicator, gbc);

gbc.gridy = 1;
missionStatementText = new JTextField(15);
informationPanel.add(missionStatementText, gbc);

// Naves utilizadas
gbc.gridx = 4;
gbc.gridy = 0;
spacecraftAndCrewMembersIndicatorUsed = new JLabel("Naves utilizadas");
spacecraftAndCrewMembersIndicatorUsed.setForeground(Color.WHITE);
informationPanel.add(spacecraftAndCrewMembersIndicatorUsed, gbc);

gbc.gridy = 1;
DefaultComboBoxModel<String> nameShipList = new DefaultComboBoxModel<>();
spacecraftUsedList = new JComboBox<>(nameShipList);
spacecraftUsedList.setForeground(Color.WHITE);
spacecraftUsedList.setPreferredSize(new Dimension(100, 30));
informationPanel.add(spacecraftUsedList, gbc);

        for (Map.Entry<String, String> entry : ModeloNaveTripulacion.getNave_tripulacion().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            nameShipList.addElement(key + ": " + value);

        }

        informationPanel.add(spacecraftUsedList, gbc);


        gbc.gridx = 2;
        gbc.gridy = 3;
        confirmAreaText = new JTextArea();
        confirmAreaText.setEditable(false);
        informationPanel.add(new JScrollPane(confirmAreaText), gbc);
        gbc.gridx = 5;
        gbc.gridy = 1;
        confirm = new JButton("Confirmar");
        confirm.setBackground(Color.GREEN);
        confirm.setForeground(Color.WHITE);
        informationPanel.add(confirm, gbc);
        confirm.addActionListener(this::addMissionFile);

    }


    public void addMissionFile(ActionEvent e) {

        if (checkEmptyContent()) {

            try {
                String auxMisiionNameText = misiionNameText.getText();
                String auxReleaseDateText = releaseDateText.getText();
                String auxTargetText = targetText.getText();
                String auxMissionStatementText = missionStatementText.getText();
                String auxspacecraftUsedList = (String) spacecraftUsedList.getSelectedItem();
                String txt = ".txt";
                String rutaArchivo = auxMisiionNameText + txt;
                FileWriter fileWriter = new FileWriter(rutaArchivo);
                BufferedWriter writer = new BufferedWriter(fileWriter);

                // Escribir en el archivo
                writer.write("Nombre de la mision: " + auxMisiionNameText + "\n");
                writer.write("Nombre de la fecha de la mision: " + auxReleaseDateText + "\n");
                writer.write("Objetivo de la mision: " + auxTargetText + "\n");
                writer.write("Estado de la mision: " + auxMissionStatementText + "\n");
                writer.write("Nave de la mision: " + auxspacecraftUsedList + "\n");


                writer.close();
                confirmAreaText.setText("Mision creada correctamente");
                missionName.add(rutaArchivo);

            } catch (IOException ex) {

                confirmAreaText.setText("La mision no ha posido crearse");
            }

        }
        else{
            confirmAreaText.setText("rellene todos los campos");
        }


    }

    private boolean checkEmptyContent() {
        int selectedIndex = spacecraftUsedList.getSelectedIndex();
        return !misiionNameText.getText().isEmpty() && !releaseDateText.getText().isEmpty() && !targetText.getText().isEmpty() && !missionStatementText.getText().isEmpty() && selectedIndex != -1;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }

    public JPanel getInformationPanel() {
        return informationPanel;
    }

    public void setInformationPanel(JPanel informationPanel) {
        this.informationPanel = informationPanel;
    }

    public JLabel getMissionNameIndicator() {
        return missionNameIndicator;
    }

    public void setMissionNameIndicator(JLabel missionNameIndicator) {
        this.missionNameIndicator = missionNameIndicator;
    }

    public JTextField getMisiionNameText() {
        return misiionNameText;
    }

    public void setMisiionNameText(JTextField misiionNameText) {
        this.misiionNameText = misiionNameText;
    }

    public JLabel getReleaseDateIndicator() {
        return releaseDateIndicator;
    }

    public void setReleaseDateIndicator(JLabel releaseDateIndicator) {
        this.releaseDateIndicator = releaseDateIndicator;
    }

    public JTextField getReleaseDateText() {
        return releaseDateText;
    }

    public void setReleaseDateText(JTextField releaseDateText) {
        this.releaseDateText = releaseDateText;
    }

    public JLabel getTargetIndicator() {
        return targetIndicator;
    }

    public void setTargetIndicator(JLabel targetIndicator) {
        this.targetIndicator = targetIndicator;
    }

    public JTextField getTargetText() {
        return targetText;
    }

    public void setTargetText(JTextField targetText) {
        this.targetText = targetText;
    }

    public JLabel getMisionStatementIndicator() {
        return misionStatementIndicator;
    }

    public void setMisionStatementIndicator(JLabel misionStatementIndicator) {
        this.misionStatementIndicator = misionStatementIndicator;
    }

    public JTextField getMissionStatementText() {
        return missionStatementText;
    }

    public void setMissionStatementText(JTextField missionStatementText) {
        this.missionStatementText = missionStatementText;
    }

    public JLabel getSpacecraftAndCrewMembersIndicatorUsed() {
        return spacecraftAndCrewMembersIndicatorUsed;
    }

    public void setSpacecraftAndCrewMembersIndicatorUsed(JLabel spacecraftAndCrewMembersIndicatorUsed) {
        this.spacecraftAndCrewMembersIndicatorUsed = spacecraftAndCrewMembersIndicatorUsed;
    }

    public JComboBox<String> getSpacecraftUsedList() {
        return spacecraftUsedList;
    }

    public void setSpacecraftUsedList(JComboBox<String> spacecraftUsedList) {
        this.spacecraftUsedList = spacecraftUsedList;
    }

    public JTextArea getConfirmAreaText() {
        return confirmAreaText;
    }

    public void setConfirmAreaText(JTextArea confirmAreaText) {
        this.confirmAreaText = confirmAreaText;
    }

    public JButton getConfirm() {
        return confirm;
    }

    public void setConfirm(JButton confirm) {
        this.confirm = confirm;
    }

    public static ArrayList<String> getMissionName() {
        return missionName;
    }

    public static void setMissionName(ArrayList<String> missionName) {
        ModeloMision.missionName = missionName;
    }
}