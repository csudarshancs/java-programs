import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
    
    public static void main(String[] args) {
        // Create a frame for the user interface
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create components for the UI
        JLabel num1Label = new JLabel("Num1:");
        JTextField num1Field = new JTextField(10);
        
        JLabel num2Label = new JLabel("Num2:");
        JTextField num2Field = new JTextField(10);
        
        JButton divideButton = new JButton("Divide");
        
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);  // Result field is read-only
        
        // Set layout for the frame
        frame.setLayout(new FlowLayout());
        
        // Add components to the frame
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(resultLabel);
        frame.add(resultField);
        
        // Add action listener to the divide button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the values entered by the user
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();
                    
                    // Parse the numbers as integers
                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);
                    
                    // Perform division
                    int result = num1 / num2;
                    
                    // Display result in the result field
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    // Handle non-integer input
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Handle division by zero
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
