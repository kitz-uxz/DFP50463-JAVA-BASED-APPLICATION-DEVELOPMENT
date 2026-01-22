package my.edu.spmp.app;

import java.awt.FlowLayout;
import javax.swing.*;

public class CelsiusCalculator {
	public static JFrame celsiusConvertor() {
        JFrame frame = new JFrame("CelsiusConvert");
        
        JTextField field = new JTextField(15);
        
        
        JLabel blankJLabel = new JLabel("K");
       
        
        JButton clearButton = new JButton("Clear");
        JButton calculateButon = new JButton("Calculate");
        
        frame.setSize(350, 250);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        panel.add(blankJLabel);
        panel.add(field);
        panel.add(clearButton);
        panel.add(calculateButon);
        
        frame.add(panel); 
        return frame; 
	}

        public static void main(String[] args) {
            
            
            JFrame frame = celsiusConvertor();
            frame.setVisible(true);
        };
    }