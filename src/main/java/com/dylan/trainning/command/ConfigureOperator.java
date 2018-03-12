package com.dylan.trainning.command;

import java.io.Serializable;

public class ConfigureOperator implements Serializable {
	
	public void insert(String content){
		System.out.println("insert content:" +content);
	}

}
