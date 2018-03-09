package com.dylan.trainning.template;

public abstract class Account {
	
	
	public void operation(){
		validate();
		calculateInterest();
		displayInterest();
		
		if(displayBalance()){
			System.out.println("display balance");
		}
		
	}
	
	
	
	public void validate(){
		System.out.println("validate account");
	}
	
	public abstract double calculateInterest();
	
	public void displayInterest(){
		System.out.println("display interest");
	}
	
	
	//hook method, using child to control parent behaviour
	public abstract boolean displayBalance();

}
