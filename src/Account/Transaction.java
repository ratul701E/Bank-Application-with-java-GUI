package Account;

import users.User;

public class Transaction {
	private User sender;
	private User receiver;
	private String transactionID;
	
	private double transactionAmount;
	
	public Transaction() {}

	public Transaction(User sender, User receiver, String transactionID, double transactionAmount) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.transactionID = transactionID;
		this.transactionAmount = transactionAmount;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	
}
