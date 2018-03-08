package com.dylan.trainning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	
	static Properties p=null;
	
	static{
		p=new Properties();
		try {
			p.load(Utils.class.getClassLoader().getResourceAsStream("factory.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static String getProperty(String key){
		return p.getProperty(key);
	}

}
