package com.dylan.trainning.template;

public class CurrentAccount extends Account{

	@Override
	public double calculateInterest() {
		System.out.println("calculate interest with current account method");
		return 0;
	}

	@Override
	public boolean displayBalance() {
		
		return true;
	}

}
