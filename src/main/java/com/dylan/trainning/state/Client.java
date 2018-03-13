package com.dylan.trainning.state;

public class Client {
	
	public static void main(String[] args) {
		Account a=new Account("dylan", 9999);
		a.deposite(1000);
		
		a.withdraw(13000);
	}
	
	

}
