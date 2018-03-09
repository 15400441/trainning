package com.dylan.trainning.template;

public class DepositeAccount extends Account {

	@Override
	public double calculateInterest() {
		System.out.println("calculate interest with deposite account method");
		return 0;
	}

	@Override
	public boolean displayBalance() {
		
		return false;
	}

}
