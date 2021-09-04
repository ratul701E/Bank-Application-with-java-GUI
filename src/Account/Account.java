package Account;

import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable {
	
	private String accountNo;
	private String branchName;
	
	private double balance;
	
	ArrayList<Transaction> transactionHistory;
	
	public Account() {
		transactionHistory = new ArrayList<Transaction>();
	}

	public Account(String accountNo, String branchName, double balance) {
		this();
		this.accountNo = accountNo;
		this.branchName = branchName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addTransaction(Transaction transaction) {
		transactionHistory.add(transaction);
	}
	
}
