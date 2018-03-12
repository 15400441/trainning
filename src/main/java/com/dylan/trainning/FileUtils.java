package com.dylan.trainning;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class FileUtils {
	
	public static void writeCommands(List ls){
		
		try(FileOutputStream fos=new FileOutputStream("src/main/resources/config.log");ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			
			oos.writeObject(ls);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static List readCommands(){
		
		InputStream inputStream=FileUtils.class.getClassLoader().getResourceAsStream("config.log");
		List list=null;
		
		try(ObjectInputStream ois=new ObjectInputStream(inputStream)) {
			
			list=(List) ois.readObject();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		return list;
	}

}
