package design_patterns.behavioral;

import design_patterns.behavioral.chain_of_responsibility.LoggerChain;
import design_patterns.behavioral.chain_of_responsibility.logger.Logger;
import design_patterns.behavioral.command.*;
import design_patterns.behavioral.interpreter.Expression;
import design_patterns.behavioral.interpreter.MultiplyExpression;
import design_patterns.behavioral.interpreter.NumberExpression;
import design_patterns.behavioral.iterator.Iterator;
import design_patterns.behavioral.iterator.StringCollection;
import design_patterns.behavioral.mediator.AirTrafficControlTowerMediator;
import design_patterns.behavioral.mediator.airplane.Airplane;
import design_patterns.behavioral.mediator.AirportControlTowerMediator;
import design_patterns.behavioral.mediator.airplane.CommercialAirplane;
import design_patterns.behavioral.memento.TextEditor;
import design_patterns.behavioral.memento.TextEditorCaretaker;
import design_patterns.behavioral.observer.Investor;
import design_patterns.behavioral.observer.Stock;

public class BehavioralApp {
    public static void main(String[] args) {
        chainOfResponsibility();
        command();
        interpreter();
        iterator();
        mediator();
        memento();
        observer();
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

    public static void mediator() {
        AirTrafficControlTowerMediator controlTower = new AirportControlTowerMediator();

        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeoff();
        airplane2.requestLanding();
    }

    public static void memento() {
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        textEditor.setText("ONE");
        caretaker.save(textEditor);
        System.out.println("Current text: " + textEditor.getText());

        textEditor.setText("TWO");
        caretaker.save(textEditor);
        System.out.println("Current text: " + textEditor.getText());

        textEditor.setText("THREE");
        System.out.println("Current text: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After undo, current text: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After undo, current text: " + textEditor.getText());
    }

    public static void observer() {
        Stock googleStock = new Stock("Google", 1345.0);

        Investor alice = new Investor("Alice");
        Investor bob = new Investor("Bob");
        Investor charlie = new Investor("Charlie");

        googleStock.registerObserver(alice);
        googleStock.registerObserver(bob);
        googleStock.registerObserver(charlie);

        googleStock.setPrice(1350.0);
        googleStock.setPrice(1400.0);

        googleStock.removeObserver(bob);

        googleStock.setPrice(1450.0);
    }
}
