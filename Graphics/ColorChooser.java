import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DisplayColorChooser extends JPanel {
    JButton changeBtn;
    Color color = Color.BLUE;

    public DisplayColorChooser() {
        setSize(200, 200);
        changeBtn = new JButton("Change Color");
        add(changeBtn);

        changeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(DisplayColorChooser.this, "Choose a color", color);
                if (color == null) {
                    color = Color.RED;
                }
                setBackground(color);
            }
        });
    }
}

public class ColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new DisplayColorChooser());
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
