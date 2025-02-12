package design_patterns.behavioral_patterns.chain_of_responsibility_design_pattern;

public class DebugLogger extends Logger {
    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==Logger.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
