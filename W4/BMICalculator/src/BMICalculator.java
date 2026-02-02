
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

		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		JMenu refactorMenu = new JMenu("Refactor");
		JMenu navigateMenu = new JMenu("Navigate");
		JMenu searchMenu = new JMenu("Search");
		JMenu projectMenu = new JMenu("Project");
		JMenu runMenu = new JMenu("Run");
		JMenu windowsMenu = new JMenu("Windows");

		JMenu helpMenu = new JMenu("Help");

		JMenuItem aboutItem = new JMenuItem("About");
		JMenuItem helpItem = new JMenuItem("Help");

		helpMenu.add(aboutItem);
		helpMenu.add(helpItem);
		
		

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(sourceMenu);
		menuBar.add(refactorMenu);
		menuBar.add(navigateMenu);
		menuBar.add(searchMenu);
		menuBar.add(projectMenu);
		menuBar.add(runMenu);
		menuBar.add(windowsMenu);
		menuBar.add(helpMenu);

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
				try {
					double weight = Double.parseDouble(weightInputTextField.getText());
					double height = Double.parseDouble(heightInputTextField.getText());

					// bmi = weight / height*2
					double bmi;

					bmi = weight / height * 2;
					resultLabel.setText(String.format("Result : %.2f", bmi));
					resultLabel.setForeground(Color.GREEN);

				} catch (Exception ex) {
					// TODO: handle exception
					resultLabel.setText("Ralat System" + ex.toString());
					resultLabel.setForeground(Color.RED);
				}

			}
		});
		
		helpItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, 
						"BMI Calculator v1",
						"About BMI Calculator",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		aboutItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, 
						"Keith",
						"About Keith",
						JOptionPane.INFORMATION_MESSAGE);
				
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

		frame.setJMenuBar(menuBar);
	}
}
