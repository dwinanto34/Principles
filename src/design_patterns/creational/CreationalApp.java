package design_patterns.creational;

import design_patterns.creational.singleton.ListSingleton;
import java.util.ArrayList;
import java.util.List;

public class CreationalApp {
    public static void main(String[] args) {
        singletonDemo();
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
}
