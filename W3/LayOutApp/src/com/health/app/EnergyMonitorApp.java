package com.health.app;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EnergyMonitorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame = new JFrame("Energy Monitor");
frame.setLayout(new FlowLayout());

JLabel client = new JLabel("Client Name");
frame.add(client);

JTextField clientTxTextField = new JTextField(10);
frame.add(clientTxTextField);

JLabel hourly = new JLabel("Client Name");
frame.add(hourly);

JTextField hourTxTextField = new JTextField(10);
frame.add(clientTxTextField);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350,450);

frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));


frame.setSize(350, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
	}

}
