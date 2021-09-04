package tools;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Notification extends JOptionPane {
	
	public static void infoMessage(Component c, String message, String title) {
		message = "<html>"
				+ "<font size='3' color='#2C6593' face='Consolas'>"
				+ message
				+ "</font>"
				+ "</html>";
		showMessageDialog(c, message, title, INFORMATION_MESSAGE);
	}
	
	public static void errorMessage(Component c, String message, String title) {
		message = "<html>"
				+ "<font size='4' color='#C42B2B' face='Consolas'>"
				+ message
				+ "</font>"
				+ "</html>";
		showMessageDialog(c, message, title, ERROR_MESSAGE);
	}
	
	public static int yesNoConfirmation(Component c, String message, String title) {
		message = "<html>"
				+ "<font size='4' color='#329B73' face='Consolas'>"
				+ message
				+ "</font>"
				+ "</html>";
		return showConfirmDialog(c, message, title, YES_NO_OPTION, QUESTION_MESSAGE);
	}
	
	public static int okConfirmation(Component c, String message, String title) {
		message = "<html>"
				+ "<font size='4' color='#C42B2B' face='Consolas'>"
				+ message
				+ "</font>"
				+ "</html>";
		return showConfirmDialog(c, message, title, DEFAULT_OPTION, ERROR_MESSAGE);
	}
	
}
