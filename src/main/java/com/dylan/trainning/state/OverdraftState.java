package com.dylan.trainning.state;

public class OverdraftState extends AccountState {
	
	public OverdraftState(AccountState state){
		this.acc=state.acc;
	}

	@Override
	void deposite(double amount) {
		// TODO Auto-generated method stub
		
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
	void stateCheck() {
		// TODO Auto-generated method stub
		
	}

}
