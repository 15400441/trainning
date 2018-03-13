package com.dylan.trainning.state;

public class NormalState extends AccountState {

	public NormalState(AccountState state) {
		this.acc = state.acc;
	}
	
	public NormalState(Account acc) {
		this.acc = acc;
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
			
		this.acc.setBalance(this.acc.getBalance()-amount);
		stateCheck();

	}

	@Override
	void compulateInterest() {
		System.out.println("normal state, no need to pay interest");

	}

	@Override

	public void stateCheck() {
		if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {
			acc.setState(new OverdraftState(this));
		} else if (acc.getBalance() == -2000) {
			acc.setState(new RestrictedState(this));
		} else if (acc.getBalance() < -2000) {
			System.out.println("operation restricted");
		}
	}

}
