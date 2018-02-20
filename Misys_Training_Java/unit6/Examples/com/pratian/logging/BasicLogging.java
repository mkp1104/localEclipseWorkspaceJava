package com.pratian.logging;

import java.util.logging.*;

public class BasicLogging 
{
	private Logger logger;
	private ConsoleHandler console;
	public BasicLogging()
	{
		logger = Logger.getLogger("MyLogger");
		console = new ConsoleHandler();
		logger.addHandler(console);
	}
	public void logMessage()
	{
		logger.info("Logging a test message....");
	}
	public static void main(String[] args) 
	{
		BasicLogging log = new BasicLogging();
		log.logMessage();
	}
}
