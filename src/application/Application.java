package application;


import javax.swing.SwingUtilities;

import gui.AccountPreview;
import gui.Home;
import gui.LoginForm;
import gui.SignupContinueForm;
import gui.SignupForm;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				//new LoginForm();
				//new SignupForm();
				//new SignupContinueForm();
				new Home();
				//new AccountPreview();
				
			}
		});
		
		
		
	}

}
