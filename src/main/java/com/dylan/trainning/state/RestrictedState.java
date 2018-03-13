package com.dylan.trainning.state;

public class RestrictedState extends AccountState {
	
	public RestrictedState(AccountState state){
		this.acc=state.acc;
	}

	

	@Override
	void deposite(double amount) {
		
		this.acc.setBalance(this.acc.getBalance() + amount);
		stateCheck();

	}

	@Override
	void withdraw(double amount) {
		System.out.println("operation failed, the account was restricted");

	}

	@Override
	void compulateInterest() {
		System.out.println("calculate interest");

	}

	@Override
	void stateCheck() {
		if (acc.getBalance() > 0) {
			acc.setState(new NormalState(this));
		} else if (acc.getBalance() > -2000) {
			acc.setState(new OverdraftState(this));
		}

	}
}
