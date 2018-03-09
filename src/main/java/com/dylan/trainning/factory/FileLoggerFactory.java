package com.dylan.trainning.factory;

public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger getLogger() {
		return new FileLogger();
	}

	
}
