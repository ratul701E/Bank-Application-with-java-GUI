package gui;

import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

import users.CurrentUsers;

public class AccountPreview extends JFrame {
	
	
	public AccountPreview() {
		setTitle("Abstract Bank | Account Information Preview");
		setSize(400,550);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(15, 1, 5, 5));
		
		
		JLabel topText = new JLabel("<html>"
				+ "<font size='5' color='#835F51' face='Consolas'>"
				+ "Information Preview"
				+ "</font>"
				+ "</html>");
		
		JLabel firstName =new JLabel( getString("First Name: " + CurrentUsers.currentTempUser.getfName()));
		JLabel lastName =new JLabel( getString("Last Name: " + CurrentUsers.currentTempUser.getlName()));
		JLabel fathersName =new JLabel( getString("Father's Name: " + CurrentUsers.currentTempUser.getFatherName()));
		JLabel mothersName =new JLabel( getString("Mother's Name: " + CurrentUsers.currentTempUser.getMothername()));
		JLabel sex =new JLabel( getString("Sex: " + CurrentUsers.currentTempUser.getSex()));
		JLabel presentAddress =new JLabel( getString("Present Address: " + CurrentUsers.currentTempUser.getpAddress()));
		JLabel nid =new JLabel( getString("NID: " + CurrentUsers.currentTempUser.getNid()));
		JLabel tin =new JLabel( getString("TIN: " + CurrentUsers.currentTempUser.getTin()));
		JLabel mobile =new JLabel( getString("Mobile: " + CurrentUsers.currentTempUser.getMobile()));
		JLabel username =new JLabel( getString("Username: " + CurrentUsers.currentTempUser.getUsername()));
		JLabel password =new JLabel( getString("Password: " + CurrentUsers.currentTempUser.getPassword()));
		JLabel permanentAddress =new JLabel( getString("Permanent address: " + CurrentUsers.currentTempUser.getPermanentAddress()));
		
		
		String tempDateString;
		try {
			SimpleDateFormat format =  new SimpleDateFormat("dd/mm/yyyy");
			tempDateString = format.format(CurrentUsers.currentTempUser.getDate());
		}catch(Exception e) {
			tempDateString = "";
		}
		
		JLabel dob = new JLabel(getString("Date of Birth: " + tempDateString));
		
		add(topText);
		add(firstName);
		add(lastName);
		add(fathersName);
		add(mothersName);
		add(sex);
		add(nid);
		add(tin);
		add(dob);
		add(mobile);
		add(username);
		add(password);
		add(presentAddress);
		add(permanentAddress);
		
		setVisible(true);
	}
	
	
	
	private String getString(String str) {
		return "<html>"
				+ "<font size='3' color='#835F51' face='Consolas'>"
				+ str
				+ "</font>"
				+ "</html>";
	}
}
