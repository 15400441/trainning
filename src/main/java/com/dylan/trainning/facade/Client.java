package com.dylan.trainning.facade;

public class Client {
	
	public static void main(String[] args) {
		UserOperation operation=new UserController();
		
		operation.login("dylan", "123");
	}

}
