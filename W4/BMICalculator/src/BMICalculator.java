
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {
public static void main(String[] args) {
// Create main window
JFrame frame = new JFrame("Wow BMI Calculator");
frame.setLayout(new GridLayout(6, 1, 10, 10));
frame.setSize(350, 450);

// UI Components
JLabel instructionLabel = new JLabel("Choose Units and Enter Details", JLabel.CENTER);
String[] unitStrings = { "Metrics (kg/m)", "Imperial (lb/in)" };
JComboBox<String> unitComboBox = new JComboBox<>(unitStrings);
JTextField weightInputTextField = new JTextField("Enter Weight");
JTextField heightInputTextField = new JTextField("Enter Height");
JButton calculateButton = new JButton("Calculate BMI");
JLabel resultLabel = new JLabel("Result: ---", JLabel.CENTER);

   calculateButton.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});

// Add components to frame
frame.add(instructionLabel);
frame.add(unitComboBox);
frame.add(weightInputTextField);
frame.add(heightInputTextField);
frame.add(calculateButton);
frame.add(resultLabel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
