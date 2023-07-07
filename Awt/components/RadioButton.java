import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class RadioButton extends Frame {
    Checkbox c1, c2, c3, c4;
    CheckboxGroup chg;

    RadioButton() {
        radioButton();
        setSize(400, 400);
        setTitle("RadioButton");
        setLayout(null);
        setVisible(true);
    }

    public void radioButton() {
        chg = new CheckboxGroup();

        c1 = new Checkbox("Male", false, chg);
        c2 = new Checkbox("Female", true, chg);
        c3 = new Checkbox("Others", false, chg);

        c1.setBounds(10, 20, 100, 30);
        c2.setBounds(10, 60, 100, 30);
        c3.setBounds(10, 110, 100, 30);

        add(c1);
        add(c2);
        add(c3);
    }

    public static void main(String[] args) {
        new RadioButton();
    }
}
