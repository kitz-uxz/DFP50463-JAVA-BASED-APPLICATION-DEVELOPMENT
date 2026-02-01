package com.health.app;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class invoiceGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


JFrame frame = new JFrame("Invoice Tool (FlowLayout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setSize(300,500);

frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10));

frame.add(new JLabel("Client Name : "));
JTextField txtClient = new JTextField(15);
frame.add(txtClient);
	}

}
