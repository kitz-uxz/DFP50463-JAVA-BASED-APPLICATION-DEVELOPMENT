import java.awt.*;
import javax.swing.*;

class BMIModule extends JFrame {

    private JTextField txtWeight;
    private JTextField txtHeight;
    private JLabel lblResult;

    public BMIModule() {
        setTitle("BMI Assessment");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel(" Weight (kg):", SwingConstants.CENTER));
        txtWeight = new JTextField();
        add(txtWeight);

        add(new JLabel(" Height (cm):", SwingConstants.CENTER));
        txtHeight = new JTextField();
        add(txtHeight);

        JButton btnCalculate = new JButton("Calculate BMI");
        JButton btnClear = new JButton("Clear");
        
        add(btnCalculate);
        add(btnClear);

        add(new JLabel(" Result:", SwingConstants.CENTER));
        lblResult = new JLabel("-");
        lblResult.setFont(new Font("Arial", Font.BOLD, 12));
        add(lblResult);

        btnCalculate.addActionListener(e -> calculateBMI());
        
        btnClear.addActionListener(e -> {
            txtWeight.setText("");
            txtHeight.setText("");
            lblResult.setText("-");
        });
        
        setLocationRelativeTo(null);
    }

    private void calculateBMI() {
        try {
     
            double weight = Double.parseDouble(txtWeight.getText().trim());
            double height = Double.parseDouble(txtHeight.getText().trim());

            if (weight <= 0 || height <= 0) {
                JOptionPane.showMessageDialog(this, "Values must be greater than 0.", "Logical Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double heightInMeters = height / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            String category;

            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) { 
                category = "Normal weight";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }

            lblResult.setText(String.format("%.2f (%s)", bmi, category));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BMIModule().setVisible(true);
        });
    }
}