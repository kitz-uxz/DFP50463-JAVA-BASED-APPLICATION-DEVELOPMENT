package com.health.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMICalculatorV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("BMI Calculator 4.0 - BoxLayout");
		JPanel panel = new JPanel();
		
		frame.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		Dimension boxSizeDimension = new Dimension(200,30);

		JLabel weightLabel = new JLabel("Weight kg");
		panel.add(weightLabel);

		JTextField weightBox = new JTextField(10);
		panel.add(weightBox);
		

		JLabel heightLabel = new JLabel("Height m");
		panel.add(heightLabel);

		JTextField heightBox = new JTextField(10);
		panel.add(heightBox);


		JButton button = new JButton("Calculate");
		panel.add(button);

		JLabel resultLabel = new JLabel("Your BMI Result");
		panel.add(resultLabel);

		JTextField resultBoxField = new JTextField(10);
		frame.add(resultBoxField,BorderLayout.SOUTH);

		frame.add(resultBoxField,BorderLayout.SOUTH);

		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			}

		}