package com.dylan.trainning.adapter;

public class Client {
	
	public static void main(String[] args) {
		DBUtils dbu=new DBUtilsAdapter();
		
		dbu.encreptUserInfo("username", "pwd");
		
	}
	

}
