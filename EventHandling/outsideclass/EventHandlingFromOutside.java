package outsideclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingFromOutside implements ActionListener {
    UsingOtherClass obj;

    EventHandlingFromOutside(UsingOtherClass obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        String txt = obj.lbl.getText().toUpperCase();
        obj.lbl.setText(txt);
    }
}
