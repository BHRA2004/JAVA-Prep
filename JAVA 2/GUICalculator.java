import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator extends JFrame {

    private JButton button1;
    private JTextField textField1;

    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField2;
    private JTextField textField3;


    public static void main(String[] args) {
        GUICalculator cal = new GUICalculator();

        cal.setTitle("GUI Calculator");

        cal.setSize(600, 400);

        cal.setVisible(true);

        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public GUICalculator() {
        JPanel panel1 = new JPanel();

        button1 = new JButton("+");
        button2 = new JButton("-");
        button3 = new JButton("*");
        button4 = new JButton("/");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);


        ListenForButton listenForButton = new ListenForButton();
        button1.addActionListener(listenForButton);
        button2.addActionListener(listenForButton);
        button3.addActionListener(listenForButton);
        button4.addActionListener(listenForButton);

        panel1.add(textField1);
        panel1.add(textField2);
        panel1.add(textField3);

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        this.add(panel1);
    }

    private class ListenForButton implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            //1
            double number1 = 0;
            double number2 = 0;

            //2
            try {
                number1 = Double.parseDouble(textField1.getText());
                number2 = Double.parseDouble(textField2.getText());
            } catch (Exception error) {
                error.printStackTrace();
            }

            //3
            if (e.getSource() == button1) {
                textField3.setText(number1 + number2 + "");
            } else if (e.getSource() == button2) {
                textField3.setText(number1 - number2 + "");
            } else if (e.getSource() == button3) {
                textField3.setText(number1 * number2 + "");
            } else if (e.getSource() == button4) {
                textField3.setText(number1 / number2 + "");
            }
        }
    }
}