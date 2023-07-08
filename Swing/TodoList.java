import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoList extends JFrame implements ActionListener {
    JLabel[] lbl = new JLabel[10];
    JTextField txt;
    JButton addBtn;
    int itemCount;

    TodoList() {
        setSize(400, 400);
        setTitle("Todo list application");
        setLayout(null);
        setVisible(true);

        txt = new JTextField();
        txt.setBounds(10, 20, 300, 30);
        add(txt);

        addBtn = new JButton("Add Items");
        addBtn.setBounds(10, 50, 150, 30);
        add(addBtn);

        addBtn.addActionListener(this);

        itemCount = 0;
    }

    public void actionPerformed(ActionEvent ae) {
        String item = txt.getText();
        if (itemCount < 10) {
            lbl[itemCount] = new JLabel(item);
            lbl[itemCount].setBounds(10, 80 + itemCount * 30, 300, 30);
            add(lbl[itemCount++]);
            txt.setText("");
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        new TodoList();
    }
}