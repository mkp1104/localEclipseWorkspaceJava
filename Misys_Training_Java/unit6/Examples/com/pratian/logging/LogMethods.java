package com.pratian.logging;

import java.util.logging.*;

public class LogMethods 
{
	private Logger logger;
	private ConsoleHandler console;
	public LogMethods()
	{
		logger = Logger.getLogger("MyLogger");
		console = new ConsoleHandler();
		console.setLevel(Level.FINEST);
		logger.setLevel(Level.INFO);
		logger.addHandler(console);
		logger.setUseParentHandlers(false);
	}
	public void logMessage()
	{
		logger.info("Logging a INFO message....");
		logger.fine("Logging a FINE message....");
		logger.finer("Logging a FINER message....");
		logger.finest("Logging a FINEST message....");
		logger.warning("Logging a WARNING message....");
		logger.config("Logging a CONFIG message....");
		logger.severe("Logging a SEVERE message....");

		//using the log() method
		logger.log(Level.SEVERE , "Logging a SEVERE message, using the log() method...");
	}
	public static void main(String[] args) 
	{
		LogMethods methods = new LogMethods();
		methods.logMessage();
	}
}
