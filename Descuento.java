import javax.swing.*;
public class Descuento {
    public static void main(String[] args) {
        double compra = Double.parseDouble(
                JOptionPane.showInputDialog("Compra"));
        String cliente = JOptionPane.showInputDialog("Cliente");
        if (compra > 500
                && cliente.equalsIgnoreCase("VIP")) {
            JOptionPane.showMessageDialog(null,
                    "20% descuento");
        }
        if (compra > 500
                && !cliente.equalsIgnoreCase("VIP")) {
            JOptionPane.showMessageDialog(null,
                    "10% descuento");
        }
        if (compra <= 500) {
            JOptionPane.showMessageDialog(null,
                    "Sin descuento");
        }
    }
}