import java.awt.*;
import javax.swing.*;

class DietModule extends JFrame {

    private JTextField txtGoal;
    private JTextField txtConsumed;
    private JLabel lblResult;

    public DietModule() {
        setTitle("Dietary Monitoring");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel(" Calorie Goal:", SwingConstants.CENTER));
        txtGoal = new JTextField("2000"); 
        add(txtGoal);

        add(new JLabel(" Calories Consumed:", SwingConstants.CENTER));
        txtConsumed = new JTextField();
        add(txtConsumed);

        JButton btnCalculate = new JButton("Calculate");
        JButton btnClear = new JButton("Clear");

        add(btnCalculate);
        add(btnClear);

        add(new JLabel(" Status:", SwingConstants.CENTER));
        lblResult = new JLabel("-");
        lblResult.setFont(new Font("Arial", Font.BOLD, 12));
        add(lblResult);

        btnCalculate.addActionListener(e -> calculateDiet());

        btnClear.addActionListener(e -> {
            txtConsumed.setText("");
            lblResult.setText("-");
        });

        setLocationRelativeTo(null);
    }

    private void calculateDiet() {
        try {
            double goal = Double.parseDouble(txtGoal.getText());
            double consumed = Double.parseDouble(txtConsumed.getText());

            if (goal <= 0 || consumed < 0) {
                JOptionPane.showMessageDialog(this, "Values cannot be negative.", "Logical Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double remaining = goal - consumed;

            if (remaining < 0) {
                lblResult.setText(String.format("Exceeded limit by %.0f kcal!", Math.abs(remaining)));
                lblResult.setForeground(Color.RED);
            } else {
                lblResult.setText(String.format("%.0f kcal remaining.", remaining));
                lblResult.setForeground(new Color(60, 179, 113)); 
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
}