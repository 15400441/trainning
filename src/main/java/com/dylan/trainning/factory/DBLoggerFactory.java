package com.dylan.trainning.factory;

public class DBLoggerFactory implements LoggerFactory {

	@Override
	public Logger getLogger() {
		return new DBLogger();
	}

}
