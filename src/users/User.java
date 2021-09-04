package users;

import java.io.File;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;

import Account.Account;


public class User implements Serializable {

		private String fName;
		private String lName;
		private String fatherName;
		private String mothername;
		private String sex;
		private String pAddress;
		private String permanentAddress;
		private String nid;
		private String mobile;
		private String tin;
		private Date date;
		
		
		private String username;
		private String password;
		
		private boolean isAdmin;
		
		private Account account;
		
		private ImageIcon dp;



		public User() {
		}
		

		public User(String fName, String lName, String fatherName, String mothername, String sex, String pAddress,
				String permanentAddress, String nid, String mobile, String tin, Date date, boolean isAdmin) {
			this.fName = fName;
			this.lName = lName;
			this.fatherName = fatherName;
			this.mothername = mothername;
			this.sex = sex;
			this.pAddress = pAddress;
			this.permanentAddress = permanentAddress;
			this.nid = nid;
			this.mobile = mobile;
			this.tin = tin;
			this.date = date;
			this.isAdmin = isAdmin;
		}





		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public String getFatherName() {
			return fatherName;
		}

		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}

		public String getMothername() {
			return mothername;
		}

		public void setMothername(String mothername) {
			this.mothername = mothername;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getpAddress() {
			return pAddress;
		}

		public void setpAddress(String pAddress) {
			this.pAddress = pAddress;
		}

		public String getPermanentAddress() {
			return permanentAddress;
		}

		public void setPermanentAddress(String permanentAddress) {
			this.permanentAddress = permanentAddress;
		}

		public String getNid() {
			return nid;
		}

		public void setNid(String nid) {
			this.nid = nid;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getTin() {
			return tin;
		}

		public void setTin(String tin) {
			this.tin = tin;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}
		
		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}


		public ImageIcon getDp() {
			return dp;
		}


		public void setDp(ImageIcon imageIcon) {
			this.dp = imageIcon;
		}
		
		
		
}
