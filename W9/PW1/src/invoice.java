import javax.swing.*;
import java.awt.*;

public class invoice extends JFrame {
    
    private JTextField txtClient, txtRate, txtHours, txtTax;
    private JCheckBox chkDiscount;
    private JTextArea txtReport;

    public invoice() {
        setTitle("Invoice Generator");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        
        inputPanel.add(new JLabel("Client Name:"));
        txtClient = new JTextField();
        inputPanel.add(txtClient);

        inputPanel.add(new JLabel("Hourly Rate:"));
        txtRate = new JTextField();
        inputPanel.add(txtRate);

        inputPanel.add(new JLabel("Hours Worked:"));
        txtHours = new JTextField();
        inputPanel.add(txtHours);

        inputPanel.add(new JLabel("Tax Rate (%):"));
        txtTax = new JTextField();
        inputPanel.add(txtTax);

        inputPanel.add(new JLabel("Discount:"));
        chkDiscount = new JCheckBox("Apply 10% Discount");
        inputPanel.add(chkDiscount);

        add(inputPanel, BorderLayout.NORTH);

        txtReport = new JTextArea();
        txtReport.setEditable(false);
        add(new JScrollPane(txtReport), BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        JButton btnGenerate = new JButton("Generate Report");
        JButton btnClear = new JButton("Clear Form");
        btnPanel.add(btnGenerate);
        btnPanel.add(btnClear);
        add(btnPanel, BorderLayout.SOUTH);

        btnGenerate.addActionListener(e -> generateReport());
        btnClear.addActionListener(e -> clearForm());
    }

    private void generateReport() {
        try {
            String client = txtClient.getText().trim();
            double rate = Double.parseDouble(txtRate.getText().replace("$", ""));
            double hours = Double.parseDouble(txtHours.getText());
            double tax = Double.parseDouble(txtTax.getText().replace("%", ""));

            double subtotal = rate * hours;
            double taxAmount = subtotal * (tax / 100);
            double discount = chkDiscount.isSelected() ? (subtotal * 0.10) : 0;
            double total = subtotal + taxAmount - discount;

            String report = String.format(
                "Client: %s\nInvoice Corp.\nDescription: Software Development\n" +
                "Rate: $%.2f/hr\n%.0f hrs\nSubtotal: $%.2f\nTax (%.0f%%): $%.2f\n",
                client, rate, hours, subtotal, tax, taxAmount
            );
            
            if (chkDiscount.isSelected()) {
                report += String.format("Discount (10%%): -$%.2f\n", discount);
            }
            
            report += String.format("Total Due: $%.2f\nThank you for your business!", total);
            txtReport.setText(report);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtClient.setText("");
        txtRate.setText("");
        txtHours.setText("");
        txtTax.setText("");
        chkDiscount.setSelected(false);
        txtReport.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new invoice().setVisible(true));
    }
}