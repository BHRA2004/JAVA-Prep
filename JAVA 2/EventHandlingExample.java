import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingExample extends JFrame implements ActionListener {
    private JLabel resultLabel;

    public EventHandlingExample() {
        setTitle("Event Handling Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a panel with GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        addButton("Button 1", gridPanel);
        addButton("Button 2", gridPanel);
        addButton("Button 3", gridPanel);
        addButton("Button 4", gridPanel);
        addButton("Button 5", gridPanel);
        addButton("Button 6", gridPanel);
        addButton("Button 7", gridPanel);
        addButton("Button 8", gridPanel);
        addButton("Button 9", gridPanel);

        // Create another panel with BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        addButton("North Button", borderPanel, BorderLayout.NORTH);
        addButton("South Button", borderPanel, BorderLayout.SOUTH);
        addButton("East Button", borderPanel, BorderLayout.EAST);
        addButton("West Button", borderPanel, BorderLayout.WEST);
        addButton("Center Button", borderPanel, BorderLayout.CENTER);

        // Create a result label
        resultLabel = new JLabel("Click a button!");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create a main panel with BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(gridPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add some space
        mainPanel.add(borderPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add some space
        mainPanel.add(resultLabel);

        add(mainPanel);

        // Set up the frame
        setVisible(true);
    }

    private void addButton(String buttonText, JPanel panel) {
        JButton button = new JButton(buttonText);
        button.addActionListener(this);
        panel.add(button);
    }

    private void addButton(String buttonText, JPanel panel, String position) {
        JButton button = new JButton(buttonText);
        button.addActionListener(this);
        panel.add(button, position);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClicked = e.getActionCommand();
        resultLabel.setText("Button clicked: " + buttonClicked);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventHandlingExample();
            }
        });
    }
}
