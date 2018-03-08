package com.dylan.trainning.factory;

public class FileLoggerFactory extends LoggerFactory{

	@Override
	public Logger getLogger() {
		return new FileLogger();
	}

	
}
