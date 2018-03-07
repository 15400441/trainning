package com.dylan.trainning;

import static org.junit.Assert.*;

import org.junit.*;


import com.dylan.trainning.singleton.WindowsTaskManager;

public class WindowsTaskManagerTest {
	
	@Before
	public void beforeRun(){
		System.out.println("-------before---------");
	}
	
	@Test
	public void testDisplayProcess(){
		
		WindowsTaskManager.getInstance().displayProcesses();
		
	}
	
	@Test
	public void testEndProcess(){
		assertEquals(true,WindowsTaskManager.getInstance().endProcess(1));
	}

}
