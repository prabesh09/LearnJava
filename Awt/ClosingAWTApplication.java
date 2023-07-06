import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClosingAWTApplication extends Frame {
    ClosingAWTApplication() {
        setSize(300, 300);
        setTitle("AWT in Java");
        setLayout(null);
        setVisible(true);

        Label txt = new Label("Close this...");
        txt.setBounds(10, 20, 100, 30);
        add(txt);

        // Method to close AWT application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new ClosingAWTApplication();
    }
}
