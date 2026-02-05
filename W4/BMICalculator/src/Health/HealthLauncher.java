package Health;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HealthLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame = new JFrame("Helath Suite launcher");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(800, 600);
frame.setLayout(new BorderLayout());

JLabel title = new JLabel("Health Suite Launcher", JLabel.CENTER);
title.setFont(new Font("Arial", Font.BOLD, 24));
frame.add(title, BorderLayout.NORTH);

JPanel gridJPanel = new JPanel(new GridLayout(2,2,20,20));
gridJPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

JPanel bmiCard = new JPanel(new BorderLayout());
JLabel bmiIcon = new JLabel (new ImageIcon("bmi_icon.png"));
JButton bmiBtn = new JButton ("Open App");
bmiBtn.setBackground(new Color(255,165,0));

bmiCard.add(bmiIcon,BorderLayout.CENTER);
bmiCard.add(bmiBtn,BorderLayout.SOUTH);

gridJPanel.add(bmiCard);



//-- WATER APP CARD
JPanel waterCard = new JPanel(new BorderLayout());
JLabel waterIcon = new JLabel(new ImageIcon("water_icon.png"));
JButton waterBtn = new JButton("Open App");
waterBtn.setBackground(new Color(30, 144, 255));

waterCard.add(waterIcon, BorderLayout.CENTER);
waterCard.add(waterBtn, BorderLayout.SOUTH);

gridJPanel.add(waterCard);



frame.add(gridJPanel,BorderLayout.CENTER);
frame.setLocationRelativeTo(null);
frame.setVisible(true);

	}

}
