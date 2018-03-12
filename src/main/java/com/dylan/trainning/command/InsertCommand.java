package com.dylan.trainning.command;

public class InsertCommand extends Command{
	
	

	
	public InsertCommand(String name) {
		super(name);
	}
	

	@Override
	void execute() {
		operator.insert(this.args);
		
	}

	@Override
	void execute(String args) {
		this.args=args;
		operator.insert(args);
		
	}

	
}
