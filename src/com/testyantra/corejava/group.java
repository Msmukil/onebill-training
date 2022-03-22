package com.testyantra.corejava;

public class group {
	
	public static void main(String[] args) {
		user user = new admin("mukilan",6383);
		user.chat();
		user.videocall();
		
		
		admin admin = (admin) user;
		admin.adduser("ravi",234566);
		admin.removeuser("ram",78887);
	}
}
