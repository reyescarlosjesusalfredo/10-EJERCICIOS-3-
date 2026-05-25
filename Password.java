import javax.swing.*;
public class Password {
    public static void main(String[] args) {
        int clave = Integer.parseInt(
                JOptionPane.showInputDialog("Contraseña"));
        if (clave > 1000 && clave < 9999) {
            JOptionPane.showMessageDialog(null,
                    "Contraseña válida");
        }
        if (!(clave > 1000 && clave < 9999)) {
            JOptionPane.showMessageDialog(null,
                    "Contraseña inválida");
        }
    }
}