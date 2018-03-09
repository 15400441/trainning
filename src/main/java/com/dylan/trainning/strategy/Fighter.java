package com.dylan.trainning.strategy;

public class Fighter implements FlyMachine {
	TakeOffStrategy ts;
	FlyingStrategy fs;

	@Override
	public void takeOff() {
		System.out.println("Fighter takeOff");
		ts.takeOff();

	}

	@Override
	public void flying() {
		System.out.println("Fighter flying");
		fs.flying();

	}

	public void setTakeOffStrategy(TakeOffStrategy ts) {
		this.ts = ts;
	}
	
	public void setFlyingStrategy(FlyingStrategy fs){
		this.fs=fs;
	}

}
