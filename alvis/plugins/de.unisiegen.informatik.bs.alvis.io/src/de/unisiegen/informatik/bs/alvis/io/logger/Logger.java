package de.unisiegen.informatik.bs.alvis.io.logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Alvis Logger. This class adds logging functionality to Alvis.
 * @author Jan Bauerdick
 * @version 0.2.1
 */

public class Logger {
	
	/**
	 * Some constants to define the log levels
	 */
	public static final int DEBUG = 0;
	public static final int INFO = 1;
	public static final int WARNING = 2;
	public static final int ERROR = 3;
	public static final int CRITICAL = 4;
	
	private int logLevel;
	private boolean logToFile;
	private String logFilename;
	private static Logger instance;
	
	private Logger() { 
		instance = this;
		this.logLevel = WARNING;
		this.logToFile = true;
		this.logFilename = System.getProperty("user.dir") +System.getProperty("file.separator")+ "alvis.log";		 //$NON-NLS-1$
		System.out.println(System.getProperty("user.dir")+System.getProperty("file.separator")+"alvis.log");
	}
	
	public static void setInstance(Logger l) {
		instance = l;
	}
	
	/**
	 * Get access to the logger. Returns a logger instance with default values.
	 * Default log level: WARNING
	 * Default logging to file: disabled
	 * Default log file name: alvis.log
	 * @return
	 */
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public int getLogLevel() {
		return this.logLevel;
	}
	
	/**
	 * Use this to set a new log level
	 * @param logLevel The new level. Only messages with this or higher level are logged
	 */
	public void setLogLevel(int logLevel) {
		if (logLevel >= DEBUG && logLevel <= CRITICAL) {
			log("Logger", INFO, Messages.Logger_LEVEL_CHANGED + logLevel); //$NON-NLS-1$
			this.logLevel = logLevel;
		} else {
			log("Logger", ERROR, Messages.Logger_ERROR_CHANGE_LEVEL); //$NON-NLS-1$
		}
	}
	
	public boolean getLogToFile() {
		return this.logToFile;
	}
	
	/**
	 * Use this to switch logging to a file on or off
	 * @param logToFile True for logging to file enabled. False to disable
	 */
	public void setLogToFile(boolean logToFile) {
		if (logToFile) {
			log("Logger", INFO, Messages.Logger_FILE_ENABLED); //$NON-NLS-1$
		} else {
			log("Logger", INFO, Messages.Logger_FILE_DISABLED); //$NON-NLS-1$
		}
		this.logToFile = logToFile;
	}
	
	public String getLogFilename() {
		return this.logFilename;
	}
	
	/**
	 * Use this to change the name of the log file. No effect if logging to file is disabled
	 * @param logFilename The new filename.
	 */
	public void setLogFilename(String logFilename) {
		log("Logger", INFO, Messages.Logger_LOG_FILE_CHANGED+ logFilename); //$NON-NLS-1$
		this.logFilename = logFilename;
	}

	/**
	 * Use this to log your messages
	 * @param module Name of the module from where the logger is called
	 * @param level Log level of your message. Message will be only logged if level is high enough
	 * @param message The message you will log
	 */
	public void log(String module, int level, String message) {
		if (level >= this.logLevel) {
			Calendar c = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //$NON-NLS-1$
			String date = dateFormat.format(c.getTime());
			String logMessage = ""; //$NON-NLS-1$
			switch (level) {
			case DEBUG:
				logMessage = date + "\tDEBUG\t" + module + "\t" + message; //$NON-NLS-1$ //$NON-NLS-2$
				break;
			case INFO:
				logMessage = date + "\tINFO\t" + module + "\t" + message; //$NON-NLS-1$ //$NON-NLS-2$
				break;
			case WARNING:
				logMessage = date + "\tWARNING\t" + module + "\t" + message; //$NON-NLS-1$ //$NON-NLS-2$
				break;
			case ERROR:
				logMessage = date + "\tERROR\t" + module + "\t" + message; //$NON-NLS-1$ //$NON-NLS-2$
				break;
			case CRITICAL:
				logMessage = date + "\tCRITICAL\t" + module + "\t" + message; //$NON-NLS-1$ //$NON-NLS-2$
				break;
			default:
				logMessage = date + Messages.Logger_FUCKED;
			}
			if (this.logToFile) {
				String endline = System.getProperty("line.separator");
				try {
					append(this.logFilename, logMessage + endline);
				} catch (IOException e) {
				  this.setLogToFile(false);
				  log("Logger", CRITICAL, Messages.Logger_LOGGING_FAILED);
				}
			} else {
				System.out.println(logMessage);
			}
		} else {
			//do nothing
			//message's log level too low
		}
	}

	/**
	 * Append text to existing file
	 * @param fileName The file
	 * @param text The text
	 * @throws IOException I/O error
	 */
	public static void append(String fileName, String text) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName, true);
		fos.write(text.getBytes());
		fos.close();
	}
	
}
