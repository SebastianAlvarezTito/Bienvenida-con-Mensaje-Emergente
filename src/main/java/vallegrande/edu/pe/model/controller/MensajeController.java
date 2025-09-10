package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.MensajeModel;
import vallegrande.edu.pe.view.MensajeView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MensajeController {

    private MensajeModel modelo;
    private MensajeView vista;

    public MensajeController(MensajeModel modelo, MensajeView vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Add the action listener to the button
        this.vista.getBotonSaludo().addActionListener(new SaludoListener());
    }

    class SaludoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Ask the user for their name
            String nombre = JOptionPane.showInputDialog(vista, "Por favor, ingresa tu nombre:");

            // Validate the input
            if (nombre != null && !nombre.trim().isEmpty()) {
                modelo.setNombreUsuario(nombre.trim());
                String mensaje = "¡Hola, " + modelo.getNombreUsuario() + "! ¡Buen trabajo!";
                JOptionPane.showMessageDialog(vista, mensaje);
            } else {
                // If the user cancelled or entered a blank name
                JOptionPane.showMessageDialog(vista, "El nombre no puede estar vacío o cancelado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
