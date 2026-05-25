import javax.swing.*;
public class Bono {
    public static void main(String[] args) {
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Salario"));
        int anios = Integer.parseInt(
                JOptionPane.showInputDialog("Años"));
        if (anios > 5 && salario < 2000) {
            JOptionPane.showMessageDialog(null,
                    "Bono grande");
        }
        if ((anios > 5 || salario < 2000)
                && !(anios > 5 && salario < 2000)) {
            JOptionPane.showMessageDialog(null,
                    "Bono menor");
        }
        if (!(anios > 5 || salario < 2000)) {
            JOptionPane.showMessageDialog(null,
                    "Sin bono");
        }
    }
}