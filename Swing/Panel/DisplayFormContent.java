import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayFormContent extends JFrame {
    JPanel top, bottom;
    JLabel name, gender, fav, displayName, displayGender, displayFav;
    JTextField nameField;
    JRadioButton r1, r2, r3;
    JCheckBox ch1, ch2, ch3;
    JButton saveBtn;

    DisplayFormContent() {
        setSize(700, 500);
        setTitle("Display Form");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        top = new JPanel();
        top.setBackground(Color.YELLOW);

        bottom = new JPanel();
        bottom.setBackground(Color.decode("#d9d9d9"));

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;

        add(top, gbc);

        gbc.gridy = 1;
        gbc.weighty = 0.5;
        add(bottom, gbc);

        // Add top components
        top.setLayout(null);

        name = new JLabel("Name : ");
        name.setBounds(10, 20, 100, 30);
        top.add(name);

        nameField = new JTextField("Boa Hancock");
        nameField.setBounds(130, 20, 350, 30);
        top.add(nameField);

        gender = new JLabel("Gender : ");
        gender.setBounds(10, 70, 100, 30);
        top.add(gender);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r3 = new JRadioButton("Others");
        r1.setBounds(130, 70, 80, 30);
        r2.setBounds(220, 70, 80, 30);
        r3.setBounds(310, 70, 80, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);
        r2.setSelected(true);
        genderGroup.add(r3);
        top.add(r1);
        top.add(r2);
        top.add(r3);

        fav = new JLabel("Favorite Anime : ");
        fav.setBounds(10, 120, 100, 30);
        top.add(fav);

        ch1 = new JCheckBox("OnePiece");
        ch2 = new JCheckBox("Naruto");
        ch3 = new JCheckBox("Gintama");
        ch1.setBounds(130, 120, 120, 30);
        ch2.setBounds(260, 120, 120, 30);
        ch3.setBounds(390, 120, 120, 30);
        ch1.setSelected(true);
        ch3.setSelected(true);
        top.add(ch1);
        top.add(ch2);
        top.add(ch3);

        saveBtn = new JButton("Save");
        saveBtn.setBounds(10, 170, 150, 30);
        top.add(saveBtn);

        // Add Bottom Components
        bottom.setLayout(null);
        name = new JLabel("Name : ");
        name.setBounds(10, 20, 100, 30);
        bottom.add(name);

        displayName = new JLabel(nameField.getText());
        displayName.setBounds(130, 20, 120, 30);
        bottom.add(displayName);

        gender = new JLabel("Gender : ");
        gender.setBounds(10, 70, 100, 30);
        bottom.add(gender);

        displayGender = new JLabel();
        displayGender.setBounds(130, 70, 120, 30);
        bottom.add(displayGender);
        toDisplayGender(r1, r2, r3, displayGender);

        fav = new JLabel("Favorite Anime : ");
        fav.setBounds(10, 120, 100, 30);
        bottom.add(fav);

        displayFav = new JLabel();
        displayFav.setBounds(130, 120, 250, 30);
        bottom.add(displayFav);
        toDisplayCheckBox(ch1, ch2, ch3, displayFav);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display Name
                displayName.setText(nameField.getText());

                // Display gender
                toDisplayGender(r1, r2, r3, displayGender);
                // Display Check box
                toDisplayCheckBox(ch1, ch2, ch3, displayFav);
            }
        };
        saveBtn.addActionListener(actionListener);
    }

    static void toDisplayGender(JRadioButton r1, JRadioButton r2, JRadioButton r3, JLabel displayGender) {
        if (r1.isSelected()) {
            displayGender.setText("Male");
        } else if (r2.isSelected()) {
            displayGender.setText("Female");
        } else if (r3.isSelected()) {
            displayGender.setText("Others");
        }
    }

    static void toDisplayCheckBox(JCheckBox ch1, JCheckBox ch2, JCheckBox ch3, JLabel displayFav) {
        StringBuilder result = new StringBuilder();
        if (ch1.isSelected()) {
            result.append(ch1.getText()).append(", ");
        }
        if (ch2.isSelected()) {
            result.append(ch2.getText()).append(", ");
        }
        if (ch3.isSelected()) {
            result.append(ch3.getText()).append(", ");
        }

        // Remove the trailing ", " if the result is not empty
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        displayFav.setText(result.toString());
    }

    public static void main(String[] args) {
        new DisplayFormContent();
    }
}