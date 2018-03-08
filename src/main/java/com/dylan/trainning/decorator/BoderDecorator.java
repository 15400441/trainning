package com.dylan.trainning.decorator;

public class BoderDecorator implements ComponentDecorator {
	
	private Component c;
	
	public BoderDecorator(Component c) {
		this.c=c;
	}

	@Override
	public void display() {
		addBorder();
		c.display();
		
	}
	
	
	public void addBorder(){
		System.out.println("add border");
	}

}
