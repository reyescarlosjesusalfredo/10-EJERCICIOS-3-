import javax.swing.*;
public class FizzBuzz {
    public static void main(String[] args) {
        int n = Integer.parseInt(
                JOptionPane.showInputDialog("Número"));
        if (n % 3 == 0 && n % 5 == 0) {
            JOptionPane.showMessageDialog(null,
                    "FizzBuzz");
        }
        if (n % 3 == 0 && n % 5 != 0) {
            JOptionPane.showMessageDialog(null,
                    "Fizz");
        }
        if (n % 5 == 0 && n % 3 != 0) {
            JOptionPane.showMessageDialog(null,
                    "Buzz");
        }
    }
}