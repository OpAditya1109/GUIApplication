package dipak;
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class Task1 extends JFrame {
    private JButton button1, button2, button3, button4;
    private JCheckBox checkbox1, checkbox2;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup radioGroup;
    private JTextField colorTextField, checkboxTextField, radioTextField;

    public Task1() {
        super("GUI Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(0, 2, 10, 10));

        // Part A: Buttons, Checkboxes, and Radio Buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");

        checkbox1 = new JCheckBox("Checkbox 1");
        checkbox2 = new JCheckBox("Checkbox 2");

        radio1 = new JRadioButton("Option 1");
        radio2 = new JRadioButton("Option 2");
        radio3 = new JRadioButton("Option 3");
        radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);
        radioGroup.add(radio3);

        button1.setBackground(Color.RED);
        button2.setBackground(Color.BLUE);
        button3.setBackground(Color.GREEN);
        button4.setBackground(Color.YELLOW);

        colorTextField = new JTextField(20);
        colorTextField.setEditable(false);


        checkboxTextField = new JTextField(20);
        checkboxTextField.setEditable(false);


        radioTextField = new JTextField(20);
        radioTextField.setEditable(false);


        add(button1);
        add(checkbox1);
        add(button2);
        add(checkbox2);
        add(button3);
        add(radio1);
        add(button4);
        add(radio2);
        add(new JLabel());
        add(radio3);
        add(new JLabel("Button Color:"));
        add(colorTextField);
        add(new JLabel("Checkbox:"));
        add(checkboxTextField);
        add(new JLabel("Selected Radio Button:"));
        add(radioTextField);

        button1.addActionListener(new ButtonColorListener());
        button2.addActionListener(new ButtonColorListener());
        button3.addActionListener(new ButtonColorListener());
        button4.addActionListener(new ButtonColorListener());
        checkbox1.addActionListener(new CheckboxListener());
        checkbox2.addActionListener(new CheckboxListener());
        radio1.addActionListener(new RadioListener());
        radio2.addActionListener(new RadioListener());
        radio3.addActionListener(new RadioListener());

        setVisible(true);
    }


    class ButtonColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            colorTextField.setText(button.getBackground().toString());
        }
    }


    class CheckboxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JCheckBox checkbox = (JCheckBox) e.getSource();
            checkboxTextField.setText(checkbox.getText());
        }
    }


    class RadioListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JRadioButton radio = (JRadioButton) e.getSource();
            radioTextField.setText(radio.getText());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task1();
            }
        });
    }
}
