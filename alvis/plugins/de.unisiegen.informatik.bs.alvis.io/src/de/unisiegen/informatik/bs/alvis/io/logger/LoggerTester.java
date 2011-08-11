package de.unisiegen.informatik.bs.alvis.io.logger;

public class LoggerTester {

	public static void main(String[] args) {
		Logger l = Logger.getInstance();
		l.setLogLevel(Logger.DEBUG);
		l.setLogToFile(true);
		l.log("LoggerTester", Logger.WARNING, "Warning message");
		l.setLogLevel(6); //too high
		l.setLogLevel(Logger.WARNING);
		l.log("LoggerTester", Logger.DEBUG, "Should not be logged, log level too low");
		l.log("LoggerTester", Logger.CRITICAL, "Should be logged, log level high enough");
	}
}
