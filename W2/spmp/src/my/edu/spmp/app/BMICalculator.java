package my.edu.spmp.app;

import java.awt.FlowLayout;
import javax.swing.*;

public class BMICalculator { 

    public static JFrame createBMIFrame() {
        JFrame frame = new JFrame("BMI Calculator");
        
        JTextField heightfield = new JTextField(5);
        JTextField agefield = new JTextField(5);
        JTextField weightfield = new JTextField(5);
        
        JLabel heightJLabel = new JLabel("Height (cm): ");
        JLabel ageJLabel = new JLabel("Age: ");
        JLabel weightJLabel = new JLabel("Weight (kg): ");
        
        JButton calculateButton = new JButton("Calculate");
        JButton resetButton = new JButton("Reset");
        
        frame.setSize(350, 250);
        
        
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        panel.add(heightJLabel);
        panel.add(heightfield);
        
        panel.add(ageJLabel);
        panel.add(agefield);
        
        panel.add(weightJLabel);
        panel.add(weightfield); 
        
        panel.add(calculateButton);
        panel.add(resetButton);
        
        frame.add(panel); 
        return frame;    
    }

    public static void main(String[] args) {
       
       
            JFrame frame = createBMIFrame();
            frame.setVisible(true);
        }
    }

