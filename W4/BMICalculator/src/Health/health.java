package Health;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class health {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame = new JFrame("Wow BMI Calculator");
frame.setLayout(new GridLayout(6,1,10,10));
frame.setSize(350, 450);

JLabel instructionJLabel = new JLabel ("Choose Units and Enter Details", JLabel.CENTER);

	String[] unitString = {"Metrics (kg/m)" , "Imperial(lb/in)"};
	JComboBox<String>unitComboBox = new JComboBox<>(unitString); 
	
	JTextField weightInpuTextField = new JTextField("Enter weight");
	JTextField heightInpuTextField = new JTextField("Enter Height");
	JButton calculateButton = new JButton("Calculate BMI");
	JLabel resultJLabel = new JLabel("Result ---", JLabel.CENTER);
	
	calculateButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
			double weight = Double.parseDouble(weightInpuTextField.getText());
			double height = Double.parseDouble(heightInpuTextField.getText());
			double bmi;
			
			if(unitComboBox.getSelectedIndex()==0) {
				bmi = weight/(height*height);
			}else {
				bmi = 703 * (weight/(height*height));
			}
			resultJLabel.setText(String.format("Result :  %.2f", bmi));
			resultJLabel.setForeground(Color.BLACK);
		} catch (NumberFormatException ex) {
			resultJLabel.setText("Invalid Input");
			resultJLabel.setForeground(Color.RED);
		}
		}
	});
	
	frame.add(instructionJLabel);
	frame.add(unitComboBox);
	frame.add(weightInpuTextField);
	frame.add(heightInpuTextField);
	frame.add(calculateButton);
	frame.add(resultJLabel);
	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	

}
