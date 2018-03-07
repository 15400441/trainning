package com.dylan.trainning.decorator;

public class FontDecorator implements ComponentDecorator {
	
	private Component c;
	
	public  FontDecorator(Component c) {
		this.c=c;
	}

	@Override
	public void display() {
		changeFont();
		c.display();
		
	}
	
	
	public void changeFont(){
		System.out.println("change font");
	}

}
