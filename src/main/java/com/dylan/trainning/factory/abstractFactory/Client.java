package com.dylan.trainning.factory.abstractFactory;

import com.dylan.trainning.Utils;

public class Client {
	
	public static void main(String[] args) {
		String factoryName=Utils.getProperty("skinFactoryBean");
		Button b;
		TextField tf;
		
		SkinFactory factory=null;
		
		try {
			 factory=(SkinFactory)Class.forName(factoryName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		b=factory.createButton();
		tf=factory.createTextField();
		
		b.display();
		tf.display();
		
		
	}

}
