import javax.swing.*;
public class Triangulo {
    public static void main(String[] args) {
        int a = Integer.parseInt(
                JOptionPane.showInputDialog("Lado 1"));
        int b = Integer.parseInt(
                JOptionPane.showInputDialog("Lado 2"));
        int c = Integer.parseInt(
                JOptionPane.showInputDialog("Lado 3"));
        if (a + b > c && a + c > b && b + c > a) {
            JOptionPane.showMessageDialog(null,
                    "Forma triángulo");
        }
        if (a == b && b == c) {
            JOptionPane.showMessageDialog(null,
                    "Equilátero");
        }
        if ((a == b || a == c || b == c)
                && !(a == b && b == c)) {
            JOptionPane.showMessageDialog(null,
                    "Isósceles");
        }
        if (a != b && a != c && b != c) {
            JOptionPane.showMessageDialog(null,
                    "Escaleno");
        }
        if (!(a + b > c && a + c > b && b + c > a)) {
            JOptionPane.showMessageDialog(null,
                    "No forma triángulo");
        }
    }
}