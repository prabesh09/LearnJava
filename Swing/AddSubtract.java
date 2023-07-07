import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddSubtract extends JFrame implements ActionListener {
    JButton addBtn, subBtn;
    JTextField fNum, sNum, result;
    JLabel lbl1, lbl2;

    AddSubtract() {
        setSize(500, 500);
        setTitle("Add and Subtract in Swing");
        setLayout(null);
        setVisible(true);

        lbl1 = new JLabel("Enter first number:");
        lbl1.setBounds(20, 10, 150, 30);
        add(lbl1);

        fNum = new JTextField();
        fNum.setBounds(180, 10, 150, 30);
        add(fNum);

        lbl2 = new JLabel("Enter second number:");
        lbl2.setBounds(20, 50, 150, 30);
        add(lbl2);

        sNum = new JTextField();
        sNum.setBounds(180, 50, 150, 30);
        add(sNum);

        addBtn = new JButton("Add");
        addBtn.setBounds(20, 90, 80, 30);
        add(addBtn);

        subBtn = new JButton("Subtract");
        subBtn.setBounds(110, 90, 150, 30);
        add(subBtn);

        result = new JTextField("Result Here");
        result.setBounds(20, 130, 150, 30);
        add(result);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(fNum.getText());
        int num2 = Integer.parseInt(sNum.getText());

        if (ae.getSource().equals(addBtn)) {
            result.setText(String.valueOf(num1 + num2));
        }

        if (ae.getSource().equals(subBtn)) {
            result.setText(String.valueOf(num1 - num2));
        }
    }

    public static void main(String[] args) {
        new AddSubtract();
    }
}