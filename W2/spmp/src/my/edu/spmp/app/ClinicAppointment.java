package my.edu.spmp.app;

import java.awt.FlowLayout;
import javax.swing.*;

public class ClinicAppointment {
	public static JFrame clinicAppointment() {
        JFrame frame = new JFrame("ClinicAppointment");
        
        JTextField namefield = new JTextField(15);
        JLabel nameJLabel = new JLabel("Name");
        JTextField appointment1field = new JTextField(15);
        JLabel appointmtalssJLabel = new JLabel("Appointalss");
        JTextField appointment2 = new JTextField(15);
        JLabel appointmentJLabel = new JLabel("Appointment");
       
        
        JButton confirmButton = new JButton("Confirm");
        
        
        frame.setSize(350, 250);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        panel.add(nameJLabel);
        panel.add(namefield);
        
        panel.add(appointmtalssJLabel);
        panel.add(appointment1field);
        
        panel.add(appointmentJLabel);
        panel.add(appointment2);
        
        panel.add(confirmButton);
        
        frame.add(panel); 
        return frame; 
	}
	public static void main(String[] args) {
        
        
        JFrame frame = clinicAppointment();
        frame.setVisible(true);
    };
}