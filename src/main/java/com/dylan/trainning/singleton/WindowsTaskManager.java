package com.dylan.trainning.singleton;


/**
 * 
 * @author dylan.duan
 * immediately initialize.
 */
public class WindowsTaskManager {
	
	private WindowsTaskManager(){};
	
	private  final static WindowsTaskManager tm=new WindowsTaskManager();
	
	public static WindowsTaskManager getInstance(){
		return tm;
	}
	
	public void displayProcesses(){
		System.out.println("display processes");
	}
	
	public boolean endProcess(int pid){
		System.out.println("end process:"+pid);
		return true;
	}

}
