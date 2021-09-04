package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.Format;
import java.text.Normalizer.Form;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import tools.Notification;
import users.CurrentUsers;
import users.User;

import java.util.Calendar;
import java.util.Date;

public class SignupForm extends JFrame{
	
	String path = "src/gui/icons/";
	JTextField pAddress;
	JTextField firsName;
	JTextField lastName;
	JTextField fathersName;
	JTextField mothersName;
	JTextField address;
	JTextField nidField;
	JTextField mobileField;
	JTextField tinField;
	JTextField dateTextField;
	
	JRadioButton maleButton;
	JRadioButton femaleButton;
	JRadioButton customButton;
	
	JLabel sexLabel;
	
	public SignupForm() {
		setTitle("Abstract Bank | Signup");
		setSize(Toolkit. getDefaultToolkit().getScreenSize().width/2 + 200, Toolkit. getDefaultToolkit().getScreenSize().height/2 + 150);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,3));
		
				// top panels
		
		JPanel textPanel = new JPanel();
		textPanel.setBackground(new Color(185, 245, 235));
		add(textPanel);
		
		JPanel formPanel1 = new JPanel();
		formPanel1.setBackground(new Color(230, 241, 227));
		add(formPanel1);
		
		JPanel formPanel2 = new JPanel();
		formPanel2.setBackground(new Color(241, 227, 227));
		add(formPanel2);
		
		
				// Text Panel setup
		
		textPanel.setLayout(new GridLayout(2, 1));
		JLabel motto = new JLabel("<html>"
				+ "<font size='9' color='#588FAD' face='Consolas'>"
				+ "Welcome To Abstract Bank LTD"
				+ "</font>"
				+ "</html>");
		//textPanel.setAlignmentX(textPanel.BOTTOM_ALIGNMENT);
		
		
		textPanel.add(motto);
		textPanel.add(new JLabel(new ImageIcon(path + "mainBackground.png")));
		
		
		
		
		// Form Panel 1 setup
		
		formPanel1.setLayout(new BoxLayout(formPanel1, BoxLayout.PAGE_AXIS));
		
		JLabel formp1Header = new JLabel("<html>"
				+ "<font size='6' color='#75E773' face='Consolas'>"
				+ "<br>General Informations<br><br>"
				+ "</font>"
				+ "</html>");
		
		firsName = new JTextField(CurrentUsers.currentTempUser.getfName(), 30);
		firsName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel firstNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>First Name"
				+ "</font>"
				+ "</html>");
		
		lastName = new JTextField(CurrentUsers.currentTempUser.getlName(), 30);
		lastName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel lastNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Last Name"
				+ "</font>"
				+ "</html>");
		
		fathersName = new JTextField(CurrentUsers.currentTempUser.getFatherName(), 30);
		fathersName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel fathersNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Father's Name"
				+ "</font>"
				+ "</html>");
		
		mothersName = new JTextField(CurrentUsers.currentTempUser.getMothername(), 30);
		mothersName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel mothersNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Mother's Name"
				+ "</font>"
				+ "</html>");
		
		
		maleButton = new JRadioButton("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "Male"
				+ "</font>"
				+ "</html>");
		maleButton.setOpaque(false);
		femaleButton = new JRadioButton("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "Female"
				+ "</font>"
				+ "</html>");
		femaleButton.setOpaque(false);
		customButton = new JRadioButton("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "Custom"
				+ "</font>"
				+ "</html>");
		customButton.setOpaque(false);
		sexLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Sex"
				+ "</font>"
				+ "</html>");
		ButtonGroup sexButtons = new ButtonGroup();
		
		if(CurrentUsers.currentTempUser.getSex().equals("Male")) maleButton.setSelected(true);
		else if(CurrentUsers.currentTempUser.getSex().equals("Female")) femaleButton.setSelected(true);
		else if(CurrentUsers.currentTempUser.getSex().equals("Custom")) customButton.setSelected(true);
		
		sexButtons.add(maleButton);
		sexButtons.add(femaleButton);
		sexButtons.add(customButton);
		
		
		address = new JTextField(CurrentUsers.currentTempUser.getpAddress());
		address.setFont(new Font("Consolas", Font.BOLD, 10));
		JLabel addressLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Present Address"
				+ "</font>"
				+ "</html>");
		
		formPanel1.add(formp1Header);
		formPanel1.add(firstNameLabel);
		formPanel1.add(firsName);
		formPanel1.add(lastNameLabel);
		formPanel1.add(lastName);
		formPanel1.add(fathersNameLabel);
		formPanel1.add(fathersName);
		formPanel1.add(mothersNameLabel);
		formPanel1.add(mothersName);
		formPanel1.add(sexLabel);
		formPanel1.add(maleButton);
		formPanel1.add(femaleButton);
		formPanel1.add(customButton);
		formPanel1.add(addressLabel);
		formPanel1.add(address);
		
		
					// Form Panel 2 setup
		
		formPanel2.setLayout(new BoxLayout(formPanel2, BoxLayout.PAGE_AXIS));
		
		JLabel formp2Header = new JLabel("<html>"
				+ "<font size='6' color='#FF4821' face='Consolas'>"
				+ "<br>Critical Informations<br><br>"
				+ "</font>"
				+ "</html>");
		
		nidField = new JTextField(CurrentUsers.currentTempUser.getNid(), 25);
		nidField.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel nidLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>NID Number"
				+ "</font>"
				+ "</html>");
		
		mobileField = new JTextField(CurrentUsers.currentTempUser.getMobile(), 25);
		mobileField.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel mobileLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Mobile Number"
				+ "</font>"
				+ "</html>");
		
		tinField = new JTextField(CurrentUsers.currentTempUser.getTin(), 25);
		tinField.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel tinLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>TIN"
				+ "</font>"
				+ "</html>");
		
		String tempDateString;
		try {
			SimpleDateFormat format =  new SimpleDateFormat("dd/mm/yyyy");
			tempDateString = format.format(CurrentUsers.currentTempUser.getDate());
		}catch(Exception e) {
			tempDateString = "";
		}
		
		dateTextField = new JTextField(tempDateString, 25);
		dateTextField.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel dobLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Date of Birth (dd/mm/yyyy)"
				+ "</font>"
				+ "</html>");
						
		
		
		JCheckBox sameAsPresent = new JCheckBox("<html>"
				+ "<font size='2' color='#588FAD' face='Consolas'>"
				+ "Same as present<sup>~</sup>"
				+ "</font>"
				+ "</html>");
		sameAsPresent.setOpaque(false);
		sameAsPresent.setFocusable(false);
		pAddress = new JTextField(CurrentUsers.currentTempUser.getPermanentAddress());
		pAddress.setFont(new Font("Consolas", Font.BOLD, 10));
		JLabel PAddressLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Permanent Address<sup>~</sup>"
				+ "</font>"
				+ "</html>");
		
		JButton Continue = new JButton("<html>"
				+ "<font size='3' color='#2A2726' face='Consolas'>"
				+ "Continue"
				+ "</font>"
				+ "</html>");
		Continue.setFocusable(false);
		Continue.setBackground(new Color(116, 149, 255));
		
		JButton login = new JButton("<html>"
				+ "<font size='2' color='#2A2726' face='Consolas'>"
				+ "Already have an account? Login"
				+ "</font>"
				+ "</html>");
		login.setFocusable(false);
		login.setBackground(new Color(70, 202, 43));
		
		
		formPanel2.add(formp2Header);
		formPanel2.add(nidLabel);
		formPanel2.add(nidField);
		formPanel2.add(mobileLabel);
		formPanel2.add(mobileField);
		formPanel2.add(tinLabel);
		formPanel2.add(tinField);
		formPanel2.add(dobLabel);
		formPanel2.add(dateTextField);
		formPanel2.add(PAddressLabel);
		formPanel2.add(sameAsPresent);
		formPanel2.add(pAddress);
		formPanel2.add(Continue);
		formPanel2.add(login);
		
		
		
					// listeners
		
		login.addActionListener(new ActionListener() {			// login
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Notification.yesNoConfirmation(rootPane, "Are you sure to go back?", "Resubmission") == 0) {
					dispose();
					new LoginForm();
				}
			}
		});
		
		
		Continue.addActionListener(new ActionListener() {		// continue
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(checkFields()) {
					dispose();
					new SignupContinueForm();
				}
			}
		});
		
		
		sameAsPresent.addActionListener(new ActionListener() {		// same as present address
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(sameAsPresent.isSelected()) {
					pAddress.setText(address.getText());
				}else {
					pAddress.setText("");
				}
				
			}
		});
		
		
		
		
		
		setVisible(true);
	}
	
	public boolean checkFields() {
		String fName = firsName.getText();
		 String lName = lastName.getText();
		 String fatherName = fathersName.getText();
		 String mothername = mothersName.getText();
		 String sex = "";
		 if(maleButton.isSelected()) sex = "Male";
		 else if(femaleButton.isSelected()) sex = "Female";
		 else if(customButton.isSelected()) sex = "Custom";
		 String presentAddress = address.getText();
		 String permanentAddress = pAddress.getText();
		 String nid = nidField.getText();
		 String mobile = mobileField.getText();
		 String tin = tinField.getText();
		 Date date = null;
		 
		 boolean isAnyFieldEmpty = false;
		 
		 try {
			 date = new SimpleDateFormat("dd/mm/yyyy").parse(dateTextField.getText());
			 setBorderGreen(dateTextField);
		 } catch (ParseException e1) {
			 setBorderRed(dateTextField);
			 isAnyFieldEmpty = true;
		 }
		 
		//|| lName.isEmpty() || fatherName.isEmpty() || mothername.isEmpty() || presentAddress.isEmpty() || mothername.isEmpty())
		 
		 if(fName.isEmpty()) {
			 setBorderRed(firsName);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(firsName);
		 }
		 
		 if(lName.isEmpty()) {
			 setBorderRed(lastName);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(lastName);
		 }
		 
		 if(fatherName.isEmpty()) {
			 setBorderRed(fathersName);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(fathersName);
		 }
		 
		 if(mothername.isEmpty()) {
			 setBorderRed(mothersName);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(mothersName);
		 }
		 
		 if(presentAddress.isEmpty()) {
			 setBorderRed(address);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(address);
		 }
		 
		 if(permanentAddress.isEmpty()) {
			 setBorderRed(pAddress);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(pAddress);
		 }
		 
		 if(nid.isEmpty() || checkAlpha(nid)) {
			 setBorderRed(nidField);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(nidField);
		 }
		 
		 if(tin.isEmpty() || checkAlpha(tin)) {
			 setBorderRed(tinField);
			 isAnyFieldEmpty = true;
		 }
		 else {
			 setBorderGreen(tinField);
		 }
		 
		 if(mobile.isEmpty() || checkAlpha(mobile)) {
			 setBorderRed(mobileField);
			 isAnyFieldEmpty = true;
		 }else {
			 setBorderGreen(mobileField);
		 }
		
		
		if(maleButton.isSelected() || femaleButton.isSelected() || customButton.isSelected()) {
			sexLabel.setText("<html>"
				+ "<font size='3' color='#49B232' face='Consolas'>"
				+ "Sex"
				+ "</font>"
				+ "</html>");
		}else {
			sexLabel.setText("<html>"
					+ "<font size='3' color='#D02038' face='Consolas'>"
					+ "Sex"
					+ "</font>"
					+ "</html>");
			isAnyFieldEmpty = true;
		}
		 
		 
		
		if (isAnyFieldEmpty) {
			Notification.okConfirmation(rootPane, "Field cannot be empty or invalid information", "Error");
			return false;
		}
		 
		User tempUser;
		tempUser = new User(fName, lName, fatherName, mothername, sex,  presentAddress,
					permanentAddress, nid, mobile, tin, date, false );
		CurrentUsers.currentTempUser = tempUser;
		return true;
		 
	}
	
	private void setBorderRed(JComponent c) {
		c.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
	}
	private void setBorderGreen(JComponent c) {
		c.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
	}
	
	private boolean checkAlpha(String str) {
		byte chars[] = str.getBytes();
		for(int i : chars) {
			if(i < 48 || i > 57) return true;
		}
		return false;
	}
}
