package design_patterns.behavioral_patterns.chain_of_responsibility_design_pattern;

public class InfoLogger extends Logger {
    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==Logger.INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
