import javax.swing.*;
public class Acceso {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Usuario");
        String clave = JOptionPane.showInputDialog("Contraseña");
        if (usuario.equals("admin") && clave.equals("1234")) {
            JOptionPane.showMessageDialog(null,
                    "Acceso correcto");
        }
        if (!usuario.equals("admin")
                || !clave.equals("1234")) {
            JOptionPane.showMessageDialog(null,
                    "Acceso denegado");
        }
    }
}