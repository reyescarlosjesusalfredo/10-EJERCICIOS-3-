import javax.swing.*;
public class Notas {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(
                JOptionPane.showInputDialog("Nota 1"));
        double n2 = Double.parseDouble(
                JOptionPane.showInputDialog("Nota 2"));
        double n3 = Double.parseDouble(
                JOptionPane.showInputDialog("Nota 3"));
        double promedio = (n1 + n2 + n3) / 3;
        if (promedio >= 11) {
            JOptionPane.showMessageDialog(null,
                    "Aprobado");
        }
        if (promedio < 11 && promedio > 8) {
            JOptionPane.showMessageDialog(null,
                    "Recuperación");
        }
        if (promedio <= 8) {
            JOptionPane.showMessageDialog(null,
                    "Desaprobado");
        }
    }
}