import javax.swing.*;
public class Bisiesto {
    public static void main(String[] args) {
        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese año"));
        if ((anio % 4 == 0 && anio % 100 != 0)
                || anio % 400 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Es bisiesto");
        }
        if (!((anio % 4 == 0 && anio % 100 != 0)
                || anio % 400 == 0)) {
            JOptionPane.showMessageDialog(null,
                    "No es bisiesto");
        }
    }
}