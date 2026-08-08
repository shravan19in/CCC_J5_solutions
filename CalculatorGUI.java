import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    // Declare components and variables (e.g., label for display, variables for calculation)
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    // ... other variables for state management

    public CalculatorGUI() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("0"); // Initialize display label

        // Frame setup
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label, BorderLayout.NORTH); // Add label to the top

        // Panel setup for buttons
        panel.setLayout(new GridLayout(4, 4)); // 4x4 grid layout

        // Create and add buttons to the panel, adding ActionListener to each
        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};
        for (String text : buttonLabels) {
            JButton button = new JButton(text);
            button.addActionListener(this); // Add action listener
            panel.add(button);
        }

        // Add the button panel to the center of the frame
        frame.add(panel, BorderLayout.CENTER);

        frame.pack(); // Adjusts window size to fit components
        frame.setVisible(true); // Make the window visible
    }

    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT) for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This is where you handle button clicks
        String command = e.getActionCommand(); // Get the button's text
        // Implement logic to handle number inputs, operations, and calculate results
    }
}
