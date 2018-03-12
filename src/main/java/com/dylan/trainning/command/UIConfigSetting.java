package com.dylan.trainning.command;

import java.util.LinkedList;
import java.util.List;

import com.dylan.trainning.FileUtils;

public class UIConfigSetting {
	
	private Command command;
	private List<Command> ls=new LinkedList<>();
	
	
	public void setCommand(Command c){
		this.command=c;
	}
	
	
	public void call(String args){
		command.execute(args);
		ls.add(command);
	}
	
	
	public void saveCommands(){
		FileUtils.writeCommands(ls);
	}
	
	
	public void recoverCommands(){
		List<Command> ls=FileUtils.readCommands();
		
		if(ls!=null){
			
			ls.stream().forEach(c->{
				c.execute();
			});
			
		}
		
	}
	
	
	
	

}
