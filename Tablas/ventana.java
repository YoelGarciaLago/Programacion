package tablas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ventana extends JFrame {
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JComboBox<String> cajaCursos;
    private DefaultTableModel modeloTabla;
    private JTable tabla;

    public ventana() {
        setTitle("Interfaz Tabla"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(350, 300); 
        setLocationRelativeTo(null); 

        JPanel panel = new JPanel(); 
        add(panel); 

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        JPanel panelNombre = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        JLabel etiquetaNombre = new JLabel("Nombre:"); 
        campoNombre = new JTextField(10); 
        panelNombre.add(etiquetaNombre); 
        panelNombre.add(campoNombre); 



        String[] cursos = {"dam1", "dam2", "asir", "daw"}; 
        cajaCursos = new JComboBox<>(cursos); 
        cajaCursos.setPreferredSize(new Dimension(120, 20)); 
        panelNombre.add(cajaCursos); 
        panel.add(panelNombre); 

        JPanel panelApellido = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        JLabel etiquetaApellido = new JLabel("Apellido:"); 
        campoApellido = new JTextField(10); 
        panelApellido.add(etiquetaApellido);
        panelApellido.add(campoApellido); 

        JButton botonAgregar = new JButton("Añadir a tabla"); 
        botonAgregar.addActionListener(e -> { 
            String nombre = campoNombre.getText(); 
            String apellido = campoApellido.getText(); 
            String curso = (String) cajaCursos.getSelectedItem(); 
            modeloTabla.addRow(new Object[]{nombre, apellido, curso}); 
        });
        panelApellido.add(botonAgregar); 
        panel.add(panelApellido); 

        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Apellido", "Curso"}, 0); 
        tabla = new JTable(modeloTabla); 
        JScrollPane scrollPane = new JScrollPane(tabla); 
        panel.add(scrollPane); 

        setVisible(true); 
    }
}