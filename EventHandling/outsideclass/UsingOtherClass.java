package outsideclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class UsingOtherClass {
    Button btn;
    Frame frame;
    Label lbl;

    UsingOtherClass() {
        frame = new Frame("Outside Class");

        lbl = new Label("Change this into uppercase.");
        lbl.setBounds(40, 40, 200, 20);
        frame.add(lbl);

        btn = new Button("Change");
        btn.setBounds(40, 80, 150, 20);
        frame.add(btn);

        EventHandlingFromOutside handler = new EventHandlingFromOutside(this);
        btn.addActionListener(handler);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
