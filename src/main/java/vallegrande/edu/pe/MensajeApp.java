package vallegrande.edu.pe.view;

import vallegrande.edu.pe.controller.MensajeController;
import vallegrande.edu.pe.model.MensajeModel;

import javax.swing.*;

public class MensajeApp {
    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure the GUI is created on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MensajeModel model = new MensajeModel();
            MensajeView view = new MensajeView();
            MensajeController controller = new MensajeController(model, view);


        });
    }
}
