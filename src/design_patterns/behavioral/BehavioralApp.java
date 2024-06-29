package design_patterns.behavioral;

import design_patterns.behavioral.chain_of_responsibility.LoggerChain;
import design_patterns.behavioral.chain_of_responsibility.logger.Logger;
import design_patterns.behavioral.command.*;
import design_patterns.behavioral.interpreter.Expression;
import design_patterns.behavioral.interpreter.MultiplyExpression;
import design_patterns.behavioral.interpreter.NumberExpression;
import design_patterns.behavioral.iterator.Iterator;
import design_patterns.behavioral.iterator.StringCollection;

public class BehavioralApp {
    public static void main(String[] args) {
        chainOfResponsibility();
        command();
        interpreter();
        iterator();
    }

    public static void chainOfResponsibility() {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        loggerChain.logMessage(1, "This is an information.");
        loggerChain.logMessage(2, "This is a debug level information.");
        loggerChain.logMessage(3, "This is an error information.");
    }

    public static void command() {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }

    public static void interpreter() {
        // Terminal expressions
        Expression three = new NumberExpression(3);
        Expression five = new NumberExpression(5);

        // Non-terminal expressions
        Expression multiplication = new MultiplyExpression(three, five);

        // Interpreting the expression
        int result = multiplication.interpret();
        System.out.println("3 * 5 = " + result);
    }

    public static void iterator() {
        StringCollection stringCollection = new StringCollection(2);
        stringCollection.addBook("ONE");
        stringCollection.addBook("TWO");

        Iterator<String> stringIterator = stringCollection.createIterator();

        while (stringIterator.hasNext()) {
            String val = stringIterator.next();
            System.out.println(val);
        }
    }
}
