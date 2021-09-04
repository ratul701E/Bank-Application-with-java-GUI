package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Database.Database;
import tools.Notification;
import users.CurrentUsers;

public class SignupContinueForm extends JFrame {
	
	JTextField username;
	JPasswordField  password;
	JPasswordField cPasswordField;
	JLabel passwordLabel, cPasswordLabel;
	
	public SignupContinueForm() {
		setTitle("Abstract Bank | Setup Login Informations");
		setSize(Toolkit. getDefaultToolkit().getScreenSize().width/2, Toolkit. getDefaultToolkit().getScreenSize().height/2 + 75);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		
		JPanel topText, fields, buttons;
		
		topText = new JPanel();
		fields = new JPanel();
		buttons = new JPanel();
		
		topText.setBackground(new Color(217, 255, 226));
		fields.setBackground(new Color(217, 255, 226));
		buttons.setBackground(new Color(217, 255, 226));
		
		
		add(topText);
		add(fields);
		add(buttons);
		
		
					// Text Panel
		
		topText.setLayout(new GridLayout(4, 1));
		
		JPanel p0, p1, p2, p3;
		
		p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		p0.setOpaque(false);
		p1.setOpaque(false);
		p2.setOpaque(false);
		p3.setOpaque(false);
		
		JLabel text = new JLabel("<html>"
				+ "<font size='6' color='#835F51' face='Consolas'>"
				+ "Select Username and Password"
				+ "</font>"
				+ "</html>");
		
		
		p1.add(text);
		
		
		JLabel usernameLabel = new JLabel("<html>"
				+ "<font size='4' color='#2A2726' face='Consolas'>"
				+ "<br>Username"
				+ "</font>"
				+ "</html>");

		
		p3.add(usernameLabel);
		
		topText.add(p0);
		topText.add(p1);
		topText.add(p2);
		topText.add(p3);
		
					// fields panel
		
		fields.setLayout(new GridLayout(4, 1));
		
		JPanel usernamePanel, passwordLablePanel, passwordPanel, cPasswordLablePanel;
		
		usernamePanel = new JPanel();
		passwordLablePanel = new JPanel();
		passwordPanel = new JPanel();
		cPasswordLablePanel = new JPanel();
		
		usernamePanel.setOpaque(false);
		passwordLablePanel.setOpaque(false);
		passwordPanel.setOpaque(false);
		cPasswordLablePanel.setOpaque(false);
		
		username = new JTextField(20);
		username.setFont(new Font("Consolas", Font.BOLD, 20));
		usernamePanel.add(username);
		
		passwordLabel = new JLabel("<html>"
				+ "<font size='4' color='#2A2726' face='Consolas'>"
				+ "<br>Password (At least 8)"
				+ "</font>"
				+ "</html>");
		passwordLablePanel.add(passwordLabel);
		
		password = new JPasswordField(20);
		password.setFont(new Font("Consolas", Font.BOLD, 20));
		passwordPanel.add(password);
		
		cPasswordLabel = new JLabel("<html>"
				+ "<font size='4' color='#2A2726' face='Consolas'>"
				+ "<br>Confirm Password"
				+ "</font>"
				+ "</html>");
		cPasswordLablePanel.add(cPasswordLabel);
		
		
		fields.add(usernamePanel);
		fields.add(passwordLablePanel);
		fields.add(passwordPanel);
		fields.add(cPasswordLablePanel);
		
		// button panel
		buttons.setLayout(new GridLayout(3, 1));
		
		JPanel p4, p5,p6;
		
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		
		p4.setOpaque(false);
		p5.setOpaque(false);
		p6.setOpaque(false);
		
		cPasswordField = new JPasswordField(20);
		cPasswordField.setFont(new Font("Consolas", Font.BOLD, 20));
		p4.add(cPasswordField);
		
		JButton signupButton, previewButton, backButton;
		
		backButton = new JButton("<html>"
				+ "<font size='3' color='#2A2726' face='Consolas'>"
				+ " Back  "
				+ "</font>"
				+ "</html>");
		
		backButton.setFocusable(false);
		backButton.setBackground(new Color(105, 106, 106));
		
		signupButton = new JButton("<html>"
				+ "<font size='3' color='#2A2726' face='Consolas'>"
				+ "Signup "
				+ "</font>"
				+ "</html>");
		
		signupButton.setFocusable(false);
		signupButton.setBackground(new Color(31, 146, 31));
		
		previewButton = new JButton("<html>"
				+ "<font size='3' color='#2A2726' face='Consolas'>"
				+ "Preview"
				+ "</font>"
				+ "</html>");
		
		previewButton.setFocusable(false);
		previewButton.setBackground(new Color(33, 163, 220));
		
		p5.add(backButton);
		p5.add(previewButton);
		p5.add(signupButton);
		
		
		buttons.add(p4);
		buttons.add(p5);
		buttons.add(p6);
		
		
		setVisible(true);
		
		
				// listeneres
		
		backButton.addActionListener(new ActionListener() {		//back button
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SignupForm();
				
			}
		});
		
		signupButton.addActionListener(new ActionListener() {  		// sign up
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkFields()) {
					Notification.infoMessage(rootPane, "Account created successfully", "Account Creation Dialog");
					dispose();
					Database.addUser(CurrentUsers.currentTempUser);
					CurrentUsers.resetCurrentTempUser();
					new LoginForm();
				}
			}
		});
		
		
		previewButton.addActionListener(new ActionListener() {		//preview
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkFields()) {
					new AccountPreview();
				}
				
			}
		});
	}
	
	public boolean checkFields() {
		String username, password, cPassword;
		username = this.username.getText();
		password = new String(this.password.getPassword());
		cPassword = new String(this.cPasswordField.getPassword());
		
		boolean isEmpty = false;
		
		if(username.isEmpty()) {
			setBorderRed(this.username);
			isEmpty = true;
		}else {
			setBorderGreen(this.username);
		}
		
		if(password.isEmpty() || password.length() < 8) {
			setBorderRed(this.password);
			isEmpty = true;
		}else {
			setBorderGreen(this.password);
		}
		
		if(cPassword.isEmpty() || cPassword.length() < 8) {
			setBorderRed(this.cPasswordField);
			isEmpty = true;
		}else {
			setBorderGreen(this.cPasswordField);
		}
		
		
		if(isEmpty) {
			Notification.okConfirmation(rootPane, "Field cannot be empty <br> or, Password length less than 8", "Error");
			return false;
		}
		
		if(!cPassword.equals(password)) {
			Notification.errorMessage(rootPane, "Password doesnot matched", "Password match error");
			return false;
		}
		
		CurrentUsers.currentTempUser.setUsername(username);
		CurrentUsers.currentTempUser.setPassword(cPassword);
		return true;
		
	}
	
	private void setBorderRed(JComponent c) {
		c.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
	}
	private void setBorderGreen(JComponent c) {
		c.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
	}
}
