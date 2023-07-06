import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;

public class UsingInheritance extends Frame {
    // Declaring components
    TextField fname, lname;
    Label fLabel, sLabel;
    Button btn;

    UsingInheritance() {
        setSize(500, 500);
        setTitle("Using Inheritance");

        // Using Components
        fLabel = new Label("First Name:");
        fLabel.setBounds(30, 20, 150, 30);
        add(fLabel);

        fname = new TextField();
        fname.setBounds(30, 50, 150, 20);
        add(fname);

        sLabel = new Label("Second Name:");
        sLabel.setBounds(30, 80, 150, 30);
        add(sLabel);

        lname = new TextField();
        lname.setBounds(30, 110, 150, 20);
        add(lname);

        btn = new Button("Submit");
        btn.setBounds(30, 140, 50, 20);
        add(btn);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsingInheritance();
    }
}