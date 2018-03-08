package com.dylan.trainning.factory;

import com.dylan.trainning.Utils;

public class Client {
	
	public static void main(String[] args) {
		Logger lg;
		
		String factoryName=Utils.getProperty("factoryBean");
		
		LoggerFactory factory=null;
		
		try {
			 factory=(LoggerFactory)Class.forName(factoryName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lg=factory.getLogger();
		
		lg.writhLog();
				
		
	}

}
