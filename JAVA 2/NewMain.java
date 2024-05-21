import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NewMain{
public static void main(String[] args){
JFrame f = new JFrame("Registration");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JTextField Id  = new JTextField();
Id.setBounds(100,50,150,50);
JTextField Password  = new JTextField();
Password.setBounds(100,50,150,50);
f.add(Id);
f.add(Password);
JButton B1 = new JButton("Login");
ActionListener actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent actionEvent){
        String S1 = Id.getText();
        System.out.println(S1);
        JOptionPane.showMessageDialog(f,"Login Successful");
    }
};
B1.addActionListener(actionListener);
f.add(B1);
f.add(B1,BorderLayout.SOUTH);
f.setSize(400, 400);
f.setVisible(true);
}
}