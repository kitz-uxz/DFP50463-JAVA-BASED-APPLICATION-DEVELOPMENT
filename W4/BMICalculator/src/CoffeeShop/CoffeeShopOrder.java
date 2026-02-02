package CoffeeShop;

import java.awt.FlowLayout;
import javax.swing.*;
 
public class CoffeeShopOrder {
 
    public static JFrame createCoffeeFrame() {
        JFrame frame = new JFrame("Coffee Shop Order System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 

        JLabel instructionLabel = new JLabel("COffee Shop Order System", JLabel.CENTER);
        JLabel typeLabel = new JLabel("Select Coffee Type: ");
        String[] types = {"Latte", "Cappuccino", "Espresso"};
        JComboBox<String> typeCombo = new JComboBox<>(types);
 
        JLabel qtyLabel = new JLabel("Quantity: ");
        JTextField qtyField = new JTextField(5);
 
        JLabel sugarLabel = new JLabel("Sugar Level: ");
        String[] levels = {"None", "Low", "Medium", "High"};
        JComboBox<String> sugarCombo = new JComboBox<>(levels);
 
        JLabel nameLabel = new JLabel("Customer Name: ");
        JTextField nameField = new JTextField(15);
 
        JButton orderButton = new JButton("Place Order");
        JLabel resultLabel = new JLabel("");
 
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
 
        panel.add(typeLabel);
        panel.add(typeCombo);
        panel.add(qtyLabel);
        panel.add(qtyField);
        panel.add(sugarLabel);
        panel.add(sugarCombo);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(orderButton);
        panel.add(resultLabel);
 
        
        orderButton.addActionListener(e -> {
            String name = nameField.getText();
            String qty = qtyField.getText();
            String type = (String) typeCombo.getSelectedItem();
            String level = (String) sugarCombo.getSelectedItem();
            resultLabel.setText("Order for " + name + ": " + qty + " " + type + " " +  level + " COMING UP!");
        });
        frame.add(instructionLabel);
 
        frame.add(panel);
        return frame;
    }
 
    public static void main(String[] args) {
        JFrame frame = createCoffeeFrame();
        frame.setVisible(true);
    }
}