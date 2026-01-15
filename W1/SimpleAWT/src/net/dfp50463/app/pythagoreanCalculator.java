package net.dfp50463.app;

import java.awt.*;

public class pythagoreanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Frame frame = new Frame("pythaCalculator");
	frame.setLayout(new FlowLayout());
	
	Label a = new Label("a =");
	frame.add(a);

	TextField aInput = new TextField("",10);
	frame.add(aInput);
	
	Label b = new Label("b =");
	frame.add(b);

	TextField bInput = new TextField("",10);
	frame.add(bInput);
	
	Label c = new Label("c =");
	frame.add(c);

	TextField cInput = new TextField("",10);
	frame.add(cInput);
	
	
	
	
	Button calculateButton = new Button("Calculate Pytha");
	frame.add(calculateButton);

	frame.setSize(300, 350);

	frame.setVisible(true);

	}

}
