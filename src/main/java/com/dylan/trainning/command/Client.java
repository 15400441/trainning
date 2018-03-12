package com.dylan.trainning.command;

public class Client {
	
	
	 
	public static void main(String[] args) {
		Command c=new InsertCommand("insert command");
		ConfigureOperator operator=new ConfigureOperator();
		
		c.setConfigureOperator(operator);
		
		
		
		UIConfigSetting configSetting=new UIConfigSetting();
		
		configSetting.setCommand(c);
		configSetting.call("add db connection");
		
		configSetting.saveCommands();
		
		System.out.println("------------do recover---------------");
		
		configSetting.recoverCommands();
		
	}
	
	
	

}
