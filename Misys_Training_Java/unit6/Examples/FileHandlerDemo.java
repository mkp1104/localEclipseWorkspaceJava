import java.util.logging.*;
import java.io.*;

class FileHandlerDemo 
{
	private FileHandler handler = null;
	private Logger logger = null;

	public FileHandlerDemo(String pattern) throws Exception
	{
		logger = Logger.getLogger("somelogger");
		handler	= new FileHandler(pattern);
		handler.setFormatter(new SimpleFormatter());
		logger.addHandler(handler);
	}
	public void logMessage()
	{
		logger.info("Stream handler is working...");
		handler.flush();
		handler.close();
	}
	public static void main(String[] args) throws Exception
	{
		FileHandlerDemo handler = new FileHandlerDemo("log.out");
		handler.logMessage(); 
	}
}
