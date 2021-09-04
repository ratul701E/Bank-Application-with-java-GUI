package users;

public abstract class CurrentUsers {
	public static User currentUser = new User("", "", "", "", "",  "",
			 "", "", "", "", null, false );;
	public static User currentTempUser = new User("", "", "", "", "",  "",
			 "", "", "", "", null, false );;
	
	
	public static void resetCurrentUser() {
		currentUser = new User("", "", "", "", "",  "",
				 "", "", "", "", null, false );
	}
	
	public static void resetCurrentTempUser() {
		currentTempUser = new User("", "", "", "", "",  "",
				 "", "", "", "", null, false );
	}
}
