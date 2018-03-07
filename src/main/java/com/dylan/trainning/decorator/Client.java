package com.dylan.trainning.decorator;

public class Client {
	public static void main(String[] args) {
		Component c1,c2,cWithFont,cWithFondBoder;
		
		c1=new FormComponent();
		c2=new InputComponent();
		
		cWithFont=new FontDecorator(c1);
		cWithFondBoder=new BoderDecorator(cWithFont);
		
		cWithFondBoder.display();
		
		
	}

}
