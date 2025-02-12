package design_patterns.behavioral_patterns.chain_of_responsibility_design_pattern;

public class Main {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(Logger.ERROR, "error log");
        logger.log(Logger.DEBUG, "debug log");
        logger.log(Logger.INFO, "info log");
        logger.log(4, "log");
    }
}
