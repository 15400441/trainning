package com.dylan.trainning.singleton;

/**
 * 
 * @author dylan.duan
 *lazy loading without performance issues
 */

public class WindowsTaskManager3 {
	
	private static class HolderClass{
		private static final WindowsTaskManager3 tm=new WindowsTaskManager3();
	}
	
	private WindowsTaskManager3(){};
	
	
	public WindowsTaskManager3 getInstance(){
		return HolderClass.tm;
	}

}
