import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name:");
        JOptionPane.showMessageDialog(null, "Your name: " + name);
    }
}
