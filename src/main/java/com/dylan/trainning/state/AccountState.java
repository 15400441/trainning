package com.dylan.trainning.state;

public abstract class AccountState {
	
	protected Account acc;
	
	abstract void deposite(double amount);
	
	abstract void withdraw(double amount);
	
	abstract void compulateInterest();
	
	abstract void stateCheck();
	
	protected boolean withdrawCheck(double amount){
		if(this.acc.getBalance()-amount<-2000){
			System.out.println("operation restricted");
			return false;
		}
		
		return true;
	}

}
