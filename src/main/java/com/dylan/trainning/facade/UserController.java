package com.dylan.trainning.facade;

public class UserController implements UserOperation{
	
	private DataValidator dataValidator;
	private UserDao userDao;
	private Encryptor encryptor;
	
	public UserController(){
		dataValidator=new DataValidator();
		userDao=new UserDao();
		encryptor=new Encryptor();
	}
	
	public void login(String username,String pwd){
		dataValidator.validate(username, pwd);
		userDao.get(username, pwd);
		encryptor.encrypt();
		System.out.println("--------------------------------");
	}

}
