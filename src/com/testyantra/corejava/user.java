package com.testyantra.corejava;

public class user {
	String name;
	long number;
	
	public user (String name, long number){
		
	 this.name = name;
	 System.out.println("from use");
	 this.number = number;
}
public user() {
	System.out.println("from use");
}
public void chat() {
	System.out.println(name+"is chatting");
}
public void videocall() {
	System.out.println(name+"is videocalling");
	
}
	

}



