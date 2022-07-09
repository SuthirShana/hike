package org.encapsulation;

public class BankPoJo {
	private String username;
	private int IFSC;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username.equals("Smiley")) {
			this.username = "valid Username";
		} else if (username.equals("Sana")) {
			this.username = "valid Username of Sana";
		} else if (username.equals("Suthir")) {
			this.username = "valid username of Suthir";
		} else {
			this.username = "Invalid username";
		}
	}

	public int getIFSC() {
		return IFSC;
	}

	public void setIFSC(String IFSC) {
		if (IFSC == "SBIN00056786") {
			this.IFSC = 1;
		} else if (IFSC == "SBIN0005944") {
			this.IFSC = 1;
		} else if (IFSC == "SBIN0005945") {
			this.IFSC = 1;
		} else {
			this.IFSC = 0;
		}
	}

	public String output(String usernameStatus, String IFSCStatus) {
		if (usernameStatus.contains("valid") && IFSC == 1) {
			return "Valid Account of Bank";
		} else {
			return "Incorrect Account";
		}
	}
}
