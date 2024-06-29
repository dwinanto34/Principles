package design_patterns.behavioral;

import design_patterns.behavioral.chain_of_responsibility.LoggerChain;
import design_patterns.behavioral.chain_of_responsibility.logger.Logger;

public class BehavioralApp {
    public static void main(String[] args) {
        chainOfResponsibility();
    }

    public static void chainOfResponsibility() {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        loggerChain.logMessage(1, "This is an information.");
        loggerChain.logMessage(2, "This is a debug level information.");
        loggerChain.logMessage(3, "This is an error information.");
    }
}
