package com.dylan.trainning.strategy;

public class Helicopter implements FlyMachine {

	TakeOffStrategy ts;
	FlyingStrategy fs;

	@Override
	public void takeOff() {
		System.out.println("Helicopter takeOff");
		ts.takeOff();

	}

	@Override
	public void flying() {
		System.out.println("Helicopter flying");
		fs.flying();

	}

	public void setTakeOffStrategy(TakeOffStrategy ts) {
		this.ts = ts;
	}
	
	public void setFlyingStrategy(FlyingStrategy fs){
		this.fs=fs;
	}

}
