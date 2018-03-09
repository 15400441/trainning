package com.dylan.trainning.adapter;

public class DBUtilsAdapter implements DBUtils {
	
	private ThirdPartyEncryptLib lib;
	
	public DBUtilsAdapter(){
		lib=new ThirdPartyEncryptLib();
	}

	/*
	 * adapt third party method
	 * 
	 */
	@Override
	public void encreptUserInfo(String username, String pwd) {
		lib.specificEncrept(username, pwd);
		
	}

}
