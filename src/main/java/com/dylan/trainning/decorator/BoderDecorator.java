package com.dylan.trainning.decorator;

public class BoderDecorator implements ComponentDecorator {
	
	private Component c;
	
	public BoderDecorator(Component c) {
		this.c=c;
	}

	@Override
	public void display() {
		addBoder();
		c.display();
		
	}
	
	
	public void addBoder(){
		System.out.println("add boder");
	}

}
