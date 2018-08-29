package Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Prog on 29.08.2018.
 */


public class GUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label1 = new JLabel("Input:");
    private JLabel label2 = new JLabel("Input:");
    JRadioButton radio1 = new JRadioButton("Sellect 1");
    JRadioButton radio2 = new JRadioButton("Sellect 2");
    JCheckBox check = new JCheckBox("Check", false);


    public GUI() {
        super("Simple Exampl");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label1);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        radio1.setSelected(true);
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());

        container.add(button);


    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String massage = "";
            massage += "Button was pressed\n";
            massage += "Text is " + input.getText() + "\n";
            massage += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
            massage += "Checkbox is" + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, massage, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}
