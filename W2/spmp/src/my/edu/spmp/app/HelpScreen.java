package my.edu.spmp.app;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.*;


public class HelpScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		//JPanel bluePanel = new JPanel();
		//bluePanel.setBackground(Color.blue);
		//bluePanel.setBounds(5,0,100,100);
		//frame.setLayout(new BorderLayout());
		//frame.add(bluePanel, BorderLayout.CENTER);
		JButton button = new JButton("Login");
		JLabel label = new JLabel("Simple Swing App");
		frame.add(label);
		//frame.add(button);
	
	
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
