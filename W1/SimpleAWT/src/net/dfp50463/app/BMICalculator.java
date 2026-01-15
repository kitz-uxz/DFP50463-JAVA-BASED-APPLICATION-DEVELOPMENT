package net.dfp50463.app;

import java.awt.*;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frame frame = new Frame ("BMI Calculator");
frame.setLayout(new FlowLayout());

Label weightLabel = new Label("Weight (kg)");
frame.add(weightLabel);

TextField weightField = new TextField("0.0",10);
frame.add(weightField);

Label heightLabel = new Label("Height (mm)");
frame.add(heightLabel);

TextField heightField = new TextField("0.0",10);
frame.add(heightField);

Button calculateButton = new Button("Calculate BMI");
frame.add(calculateButton);

frame.setSize(300, 350);

frame.setVisible(true);

	}

}
