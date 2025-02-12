package design_patterns.behavioral_patterns.chain_of_responsibility_design_pattern;

public abstract class Logger {
    public static int INFO = 1, DEBUG = 2, ERROR = 3;
    Logger nextLogger;

    Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel, String message) {
        if(nextLogger != null) {
            nextLogger.log(logLevel, message);
        } else {
            System.out.println("No suitable logger found");
        }
    }
}
