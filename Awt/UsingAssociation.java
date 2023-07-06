import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;

public class UsingAssociation {
    Frame frame;
    TextField fname, lname;
    Label fLabel, sLabel;
    Button btn;

    UsingAssociation() {
        frame = new Frame("Frame using Association");
        frame.setSize(300, 300);

        fLabel = new Label("First Name:");
        fLabel.setBounds(30, 20, 150, 30);
        frame.add(fLabel);

        fname = new TextField();
        fname.setBounds(30, 50, 150, 20);
        frame.add(fname);

        sLabel = new Label("Second Name:");
        sLabel.setBounds(30, 80, 150, 30);
        frame.add(sLabel);

        lname = new TextField();
        lname.setBounds(30, 110, 150, 20);
        frame.add(lname);

        btn = new Button("Submit");
        btn.setBounds(30, 140, 50, 20);
        frame.add(btn);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UsingAssociation();
    }
}
