package com.dylan.trainning.strategy;

public class Client {
	
	public static void main(String[] args) {
		TakeOffStrategy ts=new VerticalTakeOffStrategy();
		TakeOffStrategy ts1=new LongDistanceTakeOffStrategy();
		
		Helicopter hc=new Helicopter();
		hc.setTakeOffStrategy(ts);
		
		Fighter f=new Fighter();
		f.setTakeOffStrategy(ts1);
		
		hc.takeOff();
		
		f.takeOff();
		
	
		
		
		
	}

}
