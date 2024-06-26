package design_patterns.creational;

import design_patterns.creational.abstract_factory.Application;
import design_patterns.creational.abstract_factory.factory.GUIFactory;
import design_patterns.creational.abstract_factory.factory.MacOSFactory;
import design_patterns.creational.abstract_factory.factory.WindowsFactory;
import design_patterns.creational.factory_method.DigitalProductCreator;
import design_patterns.creational.factory_method.ProductCreator;
import design_patterns.creational.factory_method.RetailProductCreator;
import design_patterns.creational.singleton.ListSingleton;

import java.util.ArrayList;
import java.util.List;

public class CreationalApp {
    public static void main(String[] args) {
        singletonDemo();
        factoryMethodDemo();
        abstractFactory();
    }

    public static void singletonDemo() {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();

        // Expected result: False
        // Different object references since two separate instances are created
        System.out.println("Not singleton");
        System.out.println(listOne == listTwo);

        // Expected result: True
        // Same object reference because they use the exact same object from the singleton
        System.out.println("Singleton");
        List<String> singletonOne = ListSingleton.getInstance();
        List<String> singletonTwo = ListSingleton.getInstance();
        System.out.println(singletonOne == singletonTwo);
    }

    public static void factoryMethodDemo() {
        ProductCreator digitalProductCreator = new DigitalProductCreator();
        digitalProductCreator.checkout("CINEMA TIX");

        ProductCreator retailProductCreator = new RetailProductCreator();
        retailProductCreator.checkout("SHAMPOO");
    }

    public static void abstractFactory() {
        GUIFactory factory;

        String OPERATING_SYSTEM = "MAC";
        if ("MAC".contains(OPERATING_SYSTEM)) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}
