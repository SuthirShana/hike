package org.encapsulation;
public class BankWebPage {
	private String username;
	private static String IFSC;
	public static void main(String[] args) {
		BankPoJo a=new BankPoJo();
	a.setUsername("Smiley");	
	
	String SBIN0005945 = null;
	a.setIFSC(SBIN0005945);
	String username=a.getUsername();
	System.out.println(username);
	int ifsc=a.getIFSC();
	System.out.println("IFSC");

	String output=a.output(username,IFSC);
	System.out.println(output);
	}

}
