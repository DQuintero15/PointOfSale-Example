package es.storehouse.models;

import javax.swing.JOptionPane;

public class StoreException extends Exception {

    public StoreException(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public StoreException(String message, Throwable cause) {
        JOptionPane.showMessageDialog(null, message, cause.toString(), JOptionPane.ERROR_MESSAGE);
    }

    public StoreException(Throwable cause) {
        JOptionPane.showMessageDialog(null, cause.toString());
    }

}
