import java.util.logging.*;

class ConfigurationDemo 
{
	private Logger logger = null;
	private ConsoleHandler handler = null;

	public ConfigurationDemo()
	{
		logger = Logger.getLogger("log");
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
	}
	public static void main(String[] args) 
	{
		ConfigurationDemo demo = new ConfigurationDemo();
		demo.logMessage();
	}
}
