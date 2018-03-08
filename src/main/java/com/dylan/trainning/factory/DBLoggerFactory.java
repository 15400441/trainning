package com.dylan.trainning.factory;

public class DBLoggerFactory extends LoggerFactory {

	@Override
	public Logger getLogger() {
		return new DBLogger();
	}

}
