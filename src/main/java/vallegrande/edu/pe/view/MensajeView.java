package vallegrande.edu.pe.view;

import javax.swing.*;
import java.awt.*;

public class MensajeView extends JFrame {

    private JButton botonSaludo;

    public MensajeView() {
        // Set up the main window (JFrame)
        super("Bienvenid@"); // "Bienvenid@" title
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Center the window on the screen

        // Use a JPanel to change the background color as per the requirement
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(220, 230, 240)); // A nice light blue

        // Create the button
        botonSaludo = new JButton("Mostrar saludo");

        // Add the button to the panel
        panel.add(botonSaludo);

        // Add the panel to the frame
        this.add(panel);

        // Make the window visible
        this.setVisible(true);
    }

    public JButton getBotonSaludo() {
        return botonSaludo;
    }

}

