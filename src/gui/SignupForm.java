package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer.Form;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SignupForm extends JFrame{
	
	String path = "src/gui/icons/";
	
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
		
		JTextField firsName = new JTextField(30);
		firsName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel firstNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>First Name"
				+ "</font>"
				+ "</html>");
		
		JTextField lastName = new JTextField(30);
		lastName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel lastNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Last Name"
				+ "</font>"
				+ "</html>");
		
		JTextField fathersName = new JTextField(30);
		fathersName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel fathersNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Father's Name"
				+ "</font>"
				+ "</html>");
		
		JTextField mothersName = new JTextField(30);
		mothersName.setFont(new Font("Consolas", Font.BOLD, 15));
		JLabel mothersNameLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Mother's Name"
				+ "</font>"
				+ "</html>");
		
		
		JRadioButton maleButton = new JRadioButton("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "Male"
				+ "</font>"
				+ "</html>");
		maleButton.setOpaque(false);
		JRadioButton femaleButton = new JRadioButton("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "Female"
				+ "</font>"
				+ "</html>");
		femaleButton.setOpaque(false);
		JRadioButton customGender = new JRadioButton("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "Custom"
				+ "</font>"
				+ "</html>");
		customGender.setOpaque(false);
		JLabel sexLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Sex"
				+ "</font>"
				+ "</html>");
		ButtonGroup sexButtons = new ButtonGroup();
		sexButtons.add(maleButton);
		sexButtons.add(femaleButton);
		sexButtons.add(customGender);
		
		
		JTextArea address = new JTextArea(3, 22);
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
		formPanel1.add(customGender);
		formPanel1.add(addressLabel);
		formPanel1.add(address);
		
		
					// Form Panel 2 setup
		
		formPanel2.setLayout(new BoxLayout(formPanel2, BoxLayout.PAGE_AXIS));
		
		JLabel formp2Header = new JLabel("<html>"
				+ "<font size='6' color='#FF4821' face='Consolas'>"
				+ "<br>Critical Informations<br><br>"
				+ "</font>"
				+ "</html>");
		
		JTextField nidField = new JTextField(25);
		JLabel nidLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>NID Number"
				+ "</font>"
				+ "</html>");
		
		JTextField mobileField = new JTextField(25);
		JLabel mobileLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Mobile Number"
				+ "</font>"
				+ "</html>");
		
		JTextField tinField = new JTextField(25);
		JLabel tinLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>TIN"
				+ "</font>"
				+ "</html>");
		
		JTextField dobField = new JTextField(25);
		JLabel dobLabel = new JLabel("<html>"
				+ "<font size='3' color='#588FAD' face='Consolas'>"
				+ "<br>Date of Birth"
				+ "</font>"
				+ "</html>");
		
		
		JCheckBox sameAsPresent = new JCheckBox("<html>"
				+ "<font size='2' color='#588FAD' face='Consolas'>"
				+ "Same as present<sup>~</sup>"
				+ "</font>"
				+ "</html>");
		sameAsPresent.setOpaque(false);
		sameAsPresent.setFocusable(false);
 		JTextArea pAddress = new JTextArea(4, 22);
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
		formPanel2.add(dobField);
		formPanel2.add(PAddressLabel);
		formPanel2.add(sameAsPresent);
		formPanel2.add(pAddress);
		formPanel2.add(Continue);
		formPanel2.add(login);
		
		
		
					// listeners
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginForm();
				
			}
		});
		
		setVisible(true);
	}
}
