package com.keith.app;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.GridLayout; 


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

 private JFrame frame;
 private JTextField txtUsername;
 private JPasswordField txtPassword;
 
 String userString = "admin";
 String passString = "library123";
 
 String memberString = "member01";
 String memberpassString = "read456";

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     Login window = new Login();
     window.frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public Login() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame("Mukah Public Library - Login");
  frame.setBounds(100, 100, 300, 150);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  frame.getContentPane().setLayout(new GridLayout(3, 2, 10, 10));
  
  JLabel lblNewLabel = new JLabel(" Librarian ID:");
  txtUsername = new JTextField();
  
  JLabel lblNewLabel_1 = new JLabel(" Password:");
  txtPassword = new JPasswordField();
  
  JButton btnNewButton = new JButton("Enter"); 

  btnNewButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
       
    String enteredPass = new String(txtPassword.getPassword());
       
    if(txtUsername.getText().equals(userString) && enteredPass.equals(passString) ) {
        BookingInventory inventory = new BookingInventory();
        inventory.setVisible(true);
        inventory.setSize(500, 650);
        frame.dispose();
    
    } else if(txtUsername.getText().equals(memberString) && enteredPass.equals(memberpassString)) {
        MemberRegistrationWindow registration = new MemberRegistrationWindow();
        registration.setVisible(true);
        frame.dispose(); 
     
    } else {
        String errorString = "invalid";
        JOptionPane.showMessageDialog(frame, errorString, "Error",  JOptionPane.ERROR_MESSAGE);
    }
   }
  });
  
  frame.getContentPane().add(lblNewLabel);
  frame.getContentPane().add(txtUsername);
  

  frame.getContentPane().add(lblNewLabel_1);
  frame.getContentPane().add(txtPassword);
  
 
  frame.getContentPane().add(new JLabel("")); 
  frame.getContentPane().add(btnNewButton);
 }
}