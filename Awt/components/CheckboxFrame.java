import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.Color;

public class CheckboxFrame extends Frame {
    Checkbox c1, c2, c3, c4;

    CheckboxFrame() {
        checkBox();
        setSize(400, 400);
        setTitle("Checkbox");
        setLayout(null);
        setVisible(true);
    }

    public void checkBox() {
        c1 = new Checkbox();
        c2 = new Checkbox("One Piece", true);
        c3 = new Checkbox("Naruto");

        c1.setBounds(10, 20, 100, 30);
        c1.setBackground(Color.cyan);
        c2.setBounds(10, 60, 100, 30);
        c3.setBounds(10, 110, 100, 30);

        add(c1);
        add(c2);
        add(c3);
    }

    public static void main(String[] args) {
        new CheckboxFrame();
    }
}
