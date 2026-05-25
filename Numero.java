import javax.swing.*;
public class Numero {
    public static void main(String[] args) {
        int n = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese número"));
        if (n > 0) {
            JOptionPane.showMessageDialog(null,"Positivo");
        }
        if (n < 0) {
            JOptionPane.showMessageDialog(null,"Negativo");
        }
        if (n == 0) {
            JOptionPane.showMessageDialog(null,"Cero");
        }
        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null,"Par");
        }
        if (n % 2 != 0) {
            JOptionPane.showMessageDialog(null,"Impar");
        }
    }
}