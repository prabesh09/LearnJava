import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingAnonymousClass {
    Frame frame;
    Button btn;
    Label lbl;

    public UsingAnonymousClass() {
        frame = new Frame("Event Handling Using Anonymous Class");

        lbl = new Label("Change this text");
        lbl.setBounds(40, 40, 200, 20);
        frame.add(lbl);

        btn = new Button("Change");
        btn.setBounds(40, 80, 150, 20);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lbl.setText("This text has been changed.");
            }
        });

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UsingAnonymousClass();
    }
}