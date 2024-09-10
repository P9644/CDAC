package cog.ex;

	class Logger {
	    private static Logger instance = null;
	    private StringBuilder logMessages;

	    private Logger() {
	        logMessages = new StringBuilder();
	    }

	    public static Logger getInstance() {
	        if (instance == null) {
	            instance = new Logger();
	        }
	        return instance;
	    }

	    public void log(String message) {
	        logMessages.append(message).append("\n");
	    }

	    public String getLog() {
	        return logMessages.toString();
	    }

	    public void clearLog() {
	        logMessages.setLength(0);
	    }
	}

	public class Q2 {
	    public static void main(String[] args) {
	        Logger logger = Logger.getInstance();
	        
	        logger.log("Application started");
	        logger.log("User logged in");
	        
	        System.out.println("Log messages: ");
	        System.out.println(logger.getLog());
	        
	        logger.clearLog();
	        System.out.println("Log after clearing: ");
	        System.out.println(logger.getLog());
	    }

	}
/*2.	Design and implement a class named Logger to manage logging messages for an application. The class should be implemented as a singleton to ensure that only one instance of the Logger exists throughout the application.

The class should include the following methods:
•	getInstance(): Returns the unique instance of the Logger class.
•	log(String message): Adds a log message to the logger.
•	getLog(): Returns the current log messages as a String.
•	clearLog(): Clears all log messages.
*/
