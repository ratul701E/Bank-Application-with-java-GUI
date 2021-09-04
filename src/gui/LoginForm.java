package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import Database.Database;
import users.CurrentUsers;

public class LoginForm extends JFrame implements ActionListener{
	
	String path = "src/gui/icons/";
	boolean loginAsAdmin = false;
	String selected = "Client";
	
	Color borderColor = new Color(45,142,56);
	Color unselectedBorderColor = new Color(243, 76, 40);
	Color innerColor = new Color(180,253,187);
	Color unselectedInnerColor = new Color(255, 196, 181);
	JButton clientButton;
	JButton adminButton;
	JLabel selectedLabel;
	JTextField usernameField;
	
	public  LoginForm() {
		setTitle("Abstract Bank | Login");
		setSize(Toolkit. getDefaultToolkit().getScreenSize().width/2, Toolkit. getDefaultToolkit().getScreenSize().height/2 + 150);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new GridLayout(4, 1));

		
		
		JPanel mainPanel, p1, p2, p3, p4, p5;
		mainPanel = new JPanel(new GridLayout(5, 1));
		//mainPanel.setOpaque(false);
		//mainPanel.add(new JLabel(new ImageIcon(path + "mainBackgroud.png")));
		
		mainPanel.setBackground(new Color(185, 245, 235));
		add(mainPanel);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		
		mainPanel.add(p1);
		mainPanel.add(p2);
		mainPanel.add(p3);
		mainPanel.add(p4);
		mainPanel.add(p5);
		
		
		
		//p1.setBorder(BorderFactory.createTitledBorder("This is a test")//
//		p1.setBackground(Color.red);
//		p2.setBackground(Color.gray);
//		p3.setBackground(Color.yellow);
//		p4.setBackground(Color.cyan);
		p1.setOpaque(false);
		p2.setOpaque(false);
		p3.setOpaque(false);
		p4.setOpaque(false);
		p5.setOpaque(false);
		
		/*
		 * 				p1 panel settings
		 */
		
		p1.add(new JLabel("<html>"
				+ "<font size='6' color='#0A5347' face='Consolas'>"
				+ "<br>Choose Account Type"
				+ "</font>"
				+ "</html>"));
		
		/*
		 * 				p1 panel settings end
		 */
		
					//----------------------------------
		
		/*
		 * 				p2 panel settings
		 */
		p2.setLayout(new GridLayout(1, 4));
		p2.add(new JLabel());
		clientButton = new JButton(new ImageIcon(path + "client.png"));
		adminButton = new JButton(new ImageIcon(path + "admin.png"));
		
		
		setButtonSelected(clientButton);
		clientButton.setBackground(innerColor);
		clientButton.setFocusable(false);
		clientButton.setText("<html>"
				+ "<font size='3' color='#454745' face='Consolas'>"
				+ "<br><br><br>Client"
				+ "</font>"
				+ "</html>");
		//clientButton.setAlignmentY(JButton.BOTTOM);
		clientButton.setBorder(BorderFactory.createLineBorder(borderColor, 3));
		clientButton.addActionListener(this);
		
		
		setButtonDiselected(adminButton);
		adminButton.setBackground(unselectedInnerColor);
		adminButton.setFocusable(false);
		adminButton.setText("<html>"
				+ "<font size='3' color='#454745' face='Consolas'>"
				+ "<br><br><br>Admin"
				+ "</font>"
				+ "</html>");
		//adminButton.setAlignmentY(JButton.BOTTOM);
		adminButton.setBorder(BorderFactory.createLineBorder(unselectedBorderColor, 3));
		adminButton.addActionListener(this);
		
		p2.add(clientButton);
		p2.add(adminButton);
		p2.add(new JLabel());
		/*
		 * 				p2 panel settings end
		 * 
		 */
		
						//----------------------------------
		
		
		/*
		 * 				p3 panel settings
		 */
		
		p3.setLayout(null);
		
		
		usernameField = new JTextField("Username");
		usernameField.setFont(new Font("Consolas", Font.BOLD, 15));
		//usernameField.setMaximumSize(new Dimension(300, 30));
		//usernameField.setAlignmentX(p3.CENTER_ALIGNMENT);
		usernameField.setBounds(178, 30, 300, 30);
		
		
		
		JPasswordField passwordField;
		passwordField = new JPasswordField("Password");
		passwordField.setFont(new Font("Consolas", Font.BOLD, 15));
		//passwordField.setMaximumSize(new Dimension(300, 30));
		//passwordField.setAlignmentX(p3.CENTER_ALIGNMENT);
		passwordField.setBounds(178, 70, 300, 30);
		passwordField.setEchoChar((char)0);
		
		selectedLabel = new JLabel("<html>"
				+ "<font size='3' color='#454745' face='Consolas'>"
				+ "Selected: " + "<font size='3' color='#4C4FFF' face='Consolas'>" + selected + "</font>"
				+ "</font>"
				+ "</html>");
		selectedLabel.setBounds(264, 0, 300, 30);
		
		p3.add(selectedLabel);
		p3.add(usernameField);
		p3.add(passwordField);
		
		
		/// Listener for usernameField and password
		
				usernameField.addFocusListener(new FocusListener() {
					
					@Override
					public void focusLost(FocusEvent e) {
						if(usernameField.getText().isEmpty()) {
							usernameField.setText("Username");
						}
						
					}
					
					@Override
					public void focusGained(FocusEvent e) {
						if(usernameField.getText().isEmpty() || usernameField.getText().equals("Username")) {
							usernameField.setText("");
						}
						
						
					}
				});
				
				passwordField.addFocusListener(new FocusListener() {

					@Override
					public void focusLost(FocusEvent e) {
						if(new String(passwordField.getPassword()).isEmpty()) {
							passwordField.setText("Password");
							passwordField.setEchoChar((char)0);
						}
					}
					
					@Override
					public void focusGained(FocusEvent e) {
						if(new String(passwordField.getPassword()).equals("Password") || new String(passwordField.getPassword()).isEmpty()) {
							passwordField.setText("");
							passwordField.setEchoChar('•');
						}
						
					}
				});
				
						// End

		
		/*
		 * 				p3 panel settings end
		 */
		
		
		
						//----------------------------------
		
		
		/*
		 * 				p4 panel settings
		 */
		
		p4.setLayout(new BoxLayout(p4, BoxLayout.PAGE_AXIS));
		
		JButton loginButton = new JButton("<html>"
				+ "<font size='3' color='#2A2726' face='Consolas'>"
				+ "Login"
				+ "</font>"
				+ "</html>");
		loginButton.setMaximumSize(new Dimension(300, 30));
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setFocusable(false);
		loginButton.setBackground(new Color(70, 202, 43));
		
		
		JButton forgetPasswordButton = new JButton("<html>"
				+ "<font size='3' color='#537BF0' face='Consolas'>"
				+ "Forget Password?"
				+ "</font>"
				+ "</html>");
		forgetPasswordButton.setMaximumSize(new Dimension(150, 30));
		forgetPasswordButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		//forgetPasswordButton.setFocusable(false);
		forgetPasswordButton.setContentAreaFilled(false);
		forgetPasswordButton.setOpaque(false);
		forgetPasswordButton.setBorderPainted(false);
		
		JButton newAccountMessage = new JButton("<html>"
				+ "<font size='4' color='#FF8B00' face='Consolas'>"
				+ "New User? Click here to create one."
				+ "</font>"
				+ "</html>");
		newAccountMessage.setMaximumSize(new Dimension(350, 30));
		newAccountMessage.setAlignmentX(Component.CENTER_ALIGNMENT);
		//forgetPasswordButton.setFocusable(false);
		newAccountMessage.setContentAreaFilled(false);
		newAccountMessage.setOpaque(false);
		newAccountMessage.setBorderPainted(false);
		
		
		p4.add(Box.createRigidArea(new Dimension(1, 10)));
		p4.add(loginButton);
		p4.add(forgetPasswordButton);
		p4.add(newAccountMessage);
		
		
						// listeners
		
		newAccountMessage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SignupForm();
				
			}
		});
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
				
				boolean loginConfirmation = Database.loginVerification(username, password);
				CurrentUsers.currentUser = Database.getUser(username);
			}
		});

		
		/*
		 * 				p4 panel settings end
		 */
		
		
		
						//----------------------------------
		
		setVisible(true);
	}
	
	
	void setButtonSelected(JButton btn) {
		btn.setBackground(innerColor);
		btn.setBorder(BorderFactory.createLineBorder(borderColor, 3));
	}
	
	void setButtonDiselected(JButton btn) {
		btn.setBackground(unselectedInnerColor);
		btn.setBorder(BorderFactory.createLineBorder(unselectedBorderColor, 3));
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == adminButton) {
			setButtonSelected(adminButton);
			setButtonDiselected(clientButton);
			loginAsAdmin = true;
			this.selected = "Admin";
			selectedLabel.setText("<html>"
					+ "<font size='3' color='#454745' face='Consolas'>"
					+ "Selected: " + "<font size='3' color='#4C4FFF' face='Consolas'>" + selected + "</font>"
					+ "</font>"
					+ "</html>");;
			
			
		}
		else if (source == clientButton){
			setButtonSelected(clientButton);
			setButtonDiselected(adminButton);
			loginAsAdmin = false;
			this.selected = "Client";
			selectedLabel.setText("<html>"
					+ "<font size='3' color='#454745' face='Consolas'>"
					+ "Selected: " + "<font size='3' color='#4C4FFF' face='Consolas'>" + selected + "</font>"
					+ "</font>"
					+ "</html>");
		}
		
	}
}
