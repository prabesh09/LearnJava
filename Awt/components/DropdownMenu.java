import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownMenu extends Frame {
    Label lbl, selected;
    Button btn;
    Choice ch;

    DropdownMenu() {
        dropDownMenu();
        setSize(400, 400);
        setTitle("Dropdown Menu");
        setLayout(null);
        setVisible(true);
    }

    public void dropDownMenu() {
        lbl = new Label("Select item: ");
        lbl.setBounds(20, 40, 300, 30);
        add(lbl);

        ch = new Choice();
        ch.setBounds(50, 80, 80, 40);
        ch.add("Anime");
        ch.add("Manga");
        ch.add("Manhwa");
        add(ch);

        btn = new Button("Show selected item");
        btn.setBounds(20, 130, 300, 30);
        add(btn);

        selected = new Label("Select something");
        selected.setBounds(20, 170, 200, 30);
        add(selected);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String item = ch.getItem(ch.getSelectedIndex());
                selected.setText(item);
            }
        });
    }

    public static void main(String[] args) {
        new DropdownMenu();
    }
}
