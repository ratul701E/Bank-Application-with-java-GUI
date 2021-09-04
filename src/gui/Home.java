package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import Account.Account;
import Database.Database;
import tools.Notification;
import users.CurrentUsers;
import users.User;

public class Home extends JFrame {
	
	JPanel left, right, left2, right2;
	JLabel dp;
	
	public Home() {
		setTitle("Abstract Bank | Home");
		setSize(1000,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		
		left = new JPanel();
		right = new JPanel();
		left2 = new JPanel();
		right2 = new JPanel();
		
		
		left.setBackground(Color.red);
		right.setBackground(Color.green);
		left2.setBackground(Color.blue);
		right2.setBackground(Color.cyan);
		
		
		
		/*
		 * 			right panel
		 */
		right.setLayout(new GridLayout(1, 2));
		
		JPanel rp1, rp2, rp3;
		
		rp1 = new JPanel();
		rp2 = new JPanel();
		//rp3 = new JPanel();
		
		rp2.setBackground(Color.red);
		
		
		// testing purpose-----------------------------------------------------------
		CurrentUsers.currentUser = new User("Ratul", "Khan", "", "", "",  "",
				 "", "", "", "", null, false );
		CurrentUsers.currentUser.setAccount(new Account("12121", "Dhaka", 0.0));
		CurrentUsers.currentUser.setUsername("Ratul Ratul");
		CurrentUsers.currentUser.setDp(new ImageIcon("src/gui/icons/admin.png"));
		// --------------------------------------------------------------------------
		
		JLabel name, accountno, username, balance, accountInfoLabel;
		accountInfoLabel = new JLabel("<html>"
				+ "<font size='6' color='#337428' face='Consolas'>"
				+ "Account info"
				+ "</font>"
				+ "</html>");
		
		name = new JLabel(getString("Full Name: " + CurrentUsers.currentUser.getfName() + " " + CurrentUsers.currentUser.getlName()));
		username = new JLabel(getString("Username: " + CurrentUsers.currentUser.getUsername()));
		accountno = new JLabel(getString("Account no: " + CurrentUsers.currentUser.getAccount().getAccountNo()));
		balance = new JLabel(getString("Balance: " + Double.toString(CurrentUsers.currentUser.getAccount().getBalance())));
		
		
		
		rp1.setLayout(new GridLayout(8,1));
		rp1.add(accountInfoLabel);
		rp1.add(name);
		rp1.add(username);
		rp1.add(accountno);
		rp1.add(balance);
		
		
		
		rp2.setLayout(new GridLayout(2,1));
		
		JPanel dpPanel, buttonsPanel;
		
		dpPanel = new JPanel();
		dpPanel.setBackground(Color.gray);
		
		buttonsPanel = new JPanel();
		
		dp = new JLabel(CurrentUsers.currentUser.getDp());
		//dp = new JLabel(new ImageIcon("src/gui/icons/admin.png"));
		dpPanel.add(dp);
		
		
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.PAGE_AXIS));
		JButton logout, basicInformation, chooseDp;
		logout = new JButton("<html>"
				+ "<font size='5' color='#C31212' face='Consolas'>"
				+ "Logout"
				+ "</font>"
				+ "</html>");
		logout.setFocusable(false);
		//logout.setBackground(new Color(70, 202, 43));
		
		basicInformation = new JButton("<html>"
				+ "<font size='5' color='#30901B' face='Consolas'>"
				+ "Basic Information"
				+ "</font>"
				+ "</html>");
		basicInformation.setFocusable(false);
		//basicInformation.setBackground(new Color(70, 202, 43));
		
		chooseDp = new JButton("<html>"
				+ "<font size='4' color='#1A8299' face='Consolas'>"
				+ "Upload New Display Picture"
				+ "</font>"
				+ "</html>");
		chooseDp.setFocusable(false);
		//chooseDp.setBackground(new Color(115, 154, 234));
		
		buttonsPanel.add(chooseDp);
		buttonsPanel.add(basicInformation);
		buttonsPanel.add(logout);
		
		rp2.add(dpPanel);
		rp2.add(buttonsPanel);

		right.add(rp1);
		right.add(rp2);
		//right.add(rp3);
		
		
		/*
		 * 			end of right panel
		 */
		
		
		
		
		
		// action listeners
		
		chooseDp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
				fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));
				int cnfm = fileChooser.showSaveDialog(rootPane);
				if(cnfm == fileChooser.APPROVE_OPTION) {
					//CurrentUsers.currentUser.setDpSource(fileChooser.getSelectedFile().getAbsolutePath());
					File file = fileChooser.getSelectedFile();
					BufferedImage  bi = null;
					try {
						bi = ImageIO.read(file);
						CurrentUsers.currentUser.setDp(new ImageIcon(bi));
						dp.setIcon(new ImageIcon(bi));
					} catch (Exception e2) {
						Notification.errorMessage(rootPane, "Please choose correct format file.", "Invalid File");
					}
					
				}
				else {
					Notification.errorMessage(rootPane, "Something wrong. Try Again", "Error");
					validate();
				}
			}
		});
		
		
		
		
		
		
		add(left);
		add(right);
		add(left2);
		add(right2);
		setVisible(true);
	}
	
	private String getString(String str) {
		return "<html>"
				+ "<font size='5' color='#3363BC' face='Consolas'>"
				+ str
				+ "</font>"
				+ "</html>";
	}
}
