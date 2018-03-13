package com.dylan.trainning.state;

public class OverdraftState extends AccountState {

	public OverdraftState(AccountState state) {
		this.acc = state.acc;
	}

	@Override
	void deposite(double amount) {
		this.acc.setBalance(this.acc.getBalance() + amount);
		stateCheck();

	}

	@Override
	void withdraw(double amount) {
		
		if(!withdrawCheck(amount))
			return;
		this.acc.setBalance(this.acc.getBalance() - amount);
		stateCheck();

	}

	@Override
	void compulateInterest() {
		System.out.println("calculate interest");
	}

	@Override
	void stateCheck() {
		if (acc.getBalance() > 0) {
			acc.setState(new NormalState(this));
		} else if (acc.getBalance() == -2000) {
			acc.setState(new RestrictedState(this));
		} else if (acc.getBalance() < -2000) {
			System.out.println("operation restricted");
		}

	}

}
