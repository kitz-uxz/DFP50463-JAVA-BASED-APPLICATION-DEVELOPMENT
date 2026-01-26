package com.health.app;


import java.awt.GridLayout;


import javax.swing.*;

public class BMICalculatorV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame = new JFrame("BMI Calculator 2.1 - GridLayout");
frame.setLayout(new GridLayout(4,2));

JLabel weightLabel = new JLabel("Weight kg");
frame.add(weightLabel);

JTextField weightBox = new JTextField(10);
frame.add(weightBox);

JLabel heightLabel = new JLabel("Height m");
frame.add(heightLabel);

JTextField heightBox = new JTextField(10);
frame.add(heightBox);

JLabel fillerLabel = new JLabel("Your BMI Result");
frame.add(fillerLabel);

JButton button = new JButton("Calculate");
frame.add(button);

JLabel resultLabel = new JLabel("Your BMI Result");
frame.add(resultLabel);

JTextField resultBoxField = new JTextField(10);
frame.add(resultBoxField);

frame.setSize(350, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
	}

}
