package com.dylan.trainning.state;

public class Account {
	
	private AccountState accountState;
	private String owner;
	private double balance=0;
	
	public Account(String owner,double init){
		this.owner=owner;
		this.balance=init;
		this.accountState=new NormalState(this);
	}
	
	public void setState(AccountState state){
		this.accountState=state;
	}
	
	public void setBalance(double b){
		this.balance=b;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void deposite(double amount){
		System.out.println(owner +" deposite "+amount);
		accountState.deposite(amount);
		System.out.println("current balance:"+balance);
		System.out.println("current state:"+ this.accountState.getClass().getName());
		System.out.println("--------------------------------");
	}
	
	
	public void withdraw(double amount){
		System.out.println(owner +" withdraw "+amount);
		accountState.withdraw(amount);
		System.out.println("current balance:"+balance);
		System.out.println("current state:"+ this.accountState.getClass().getName());
		System.out.println("--------------------------------");
	}
	
	public void compulateInterest(){
		accountState.compulateInterest();
	}
	

}
