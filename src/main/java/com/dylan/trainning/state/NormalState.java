package com.dylan.trainning.state;

public class NormalState extends AccountState {

	public NormalState(Account acc) {
		this.acc = acc;
	}

	@Override
	void deposite(double amount) {
		this.acc.setBalance(this.acc.getBalance() + amount);

	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	void compulateInterest() {
		// TODO Auto-generated method stub

	}

	@Override

	public void stateCheck() {
		if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {
			acc.setState(new OverdraftState(this));
		} else if (acc.getBalance() == -2000) {
			acc.setState(new RestrictedState(this));
		} else if (acc.getBalance() < -2000) {
			System.out.println("操作受限！");
		}
	}

}
