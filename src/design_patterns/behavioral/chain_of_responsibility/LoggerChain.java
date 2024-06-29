package design_patterns.behavioral.chain_of_responsibility;

import design_patterns.behavioral.chain_of_responsibility.logger.DebugLogger;
import design_patterns.behavioral.chain_of_responsibility.logger.ErrorLogger;
import design_patterns.behavioral.chain_of_responsibility.logger.InfoLogger;
import design_patterns.behavioral.chain_of_responsibility.logger.Logger;

public class LoggerChain {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(3);
        Logger debugLogger = new DebugLogger(2);
        Logger infoLogger = new InfoLogger(1);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
