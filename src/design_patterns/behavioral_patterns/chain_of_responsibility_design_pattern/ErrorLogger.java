package design_patterns.behavioral_patterns.chain_of_responsibility_design_pattern;

public class ErrorLogger extends Logger {
    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==Logger.ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
