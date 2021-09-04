package Database;

import users.User;

public abstract class Database {
	static User users[];
	
	static {
		users = new User[500];
	}
	
	
	
	public static boolean addUser(User user) {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				users[i]= user;
				return true;
			}
		}
		return false;
	}
	
	public static boolean removeUser(String username) {
		for(int i = 0; i < users.length; i++) {
			if(users[i]!= null ) {
				if(users[i].getUsername().equals(username)) {
					users[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public static User getUser(String username) {
		for(int i = 0; i < users.length; i++) {
			if(users[i]!= null ) {
				if(users[i].getUsername().equals(username)) {
					return users[i];
				}
			}
		}
		return null;
	}
	
	public static boolean loginVerification(String username, String password) {
		for(int i = 0; i < users.length; i++) {
			if(users[i]!= null ) {
				if(users[i].getUsername().equals(username)) {
					if(users[i].getPassword().equals(password)) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		return false;
	}
	

}
