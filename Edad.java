import javax.swing.*;
public class Edad {
    public static void main(String[] args) {
        int edad = Integer.parseInt(
                JOptionPane.showInputDialog("Edad"));
        if (edad >= 0 && edad <= 12) {
            JOptionPane.showMessageDialog(null,
                    "Niño");
        }
        if (edad >= 13 && edad <= 17) {
            JOptionPane.showMessageDialog(null,
                    "Adolescente");
        }
        if (edad >= 18 && edad <= 64) {
            JOptionPane.showMessageDialog(null,
                    "Adulto");
        }
        if (edad >= 65) {
            JOptionPane.showMessageDialog(null,
                    "Adulto mayor");
        }
    }
}