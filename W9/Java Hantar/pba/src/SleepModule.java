import java.awt.*;
import javax.swing.*;

class SleepModule extends JFrame {

    private JTextField txtHours;
    private JLabel lblResult;

    public SleepModule() {
        setTitle("Sleep Tracking");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel(" Hours Slept:", SwingConstants.CENTER));
        txtHours = new JTextField();
        add(txtHours);

        JButton btnCalculate = new JButton("Evaluate");
        JButton btnClear = new JButton("Clear");

        add(btnCalculate);
        add(btnClear);

        add(new JLabel(" Status:", SwingConstants.CENTER));
        lblResult = new JLabel("-");
        lblResult.setFont(new Font("Arial", Font.BOLD, 12));
        add(lblResult);

        btnCalculate.addActionListener(e -> evaluateSleep());

        btnClear.addActionListener(e -> {
            txtHours.setText("");
            lblResult.setText("-");
        });

        setLocationRelativeTo(null);
    }

    private void evaluateSleep() {
        try {
            double hours = Double.parseDouble(txtHours.getText());

            if (hours < 0 || hours > 24) {
                JOptionPane.showMessageDialog(this, "Please enter a value between 0 and 24.", "Logical Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (hours < 7) {
                lblResult.setText("You need more sleep (Goal: 7-9 hrs).");
            } else if (hours >= 7 && hours <= 9) {
                lblResult.setText("Optimal sleep duration achieved.");
            } else {
                lblResult.setText("You overslept. Try aiming for 7-9 hrs.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
}