package com.dylan.trainning.command;

import java.io.Serializable;

public abstract class Command implements Serializable {
	
	protected String name;
	protected String args;
	protected ConfigureOperator operator;
	
	public Command(String name) {
		this.name=name;
	}
	
	
	public void setConfigureOperator(ConfigureOperator operator){
		this.operator=operator;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	//declare two run command method
	abstract void execute();
	abstract void execute(String args);

}
