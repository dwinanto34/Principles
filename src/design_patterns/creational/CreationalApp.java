package design_patterns.creational;

import design_patterns.creational.abstract_factory.Application;
import design_patterns.creational.abstract_factory.factory.GUIFactory;
import design_patterns.creational.abstract_factory.factory.MacOSFactory;
import design_patterns.creational.abstract_factory.factory.WindowsFactory;
import design_patterns.creational.builder.House;
import design_patterns.creational.factory_method.DigitalProductCreator;
import design_patterns.creational.factory_method.ProductCreator;
import design_patterns.creational.factory_method.RetailProductCreator;
import design_patterns.creational.prototype.Distributor;
import design_patterns.creational.prototype.RetailSeller;
import design_patterns.creational.prototype.Seller;
import design_patterns.creational.singleton.ListSingleton;

import java.util.ArrayList;
import java.util.List;

public class CreationalApp {
    public static void main(String[] args) {
        singletonDemo();
        factoryMethodDemo();
        abstractFactory();
        builder();
        prototype();
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

    public static void builder() {
        House smallHouse = new House.HouseBuilder("Brick Walls", "Shingle Roof")
                .build();
        System.out.println(smallHouse);

        House luxuryVilla = new House.HouseBuilder("Concrete Walls", "Metal Roof")
                .setRooms(5)
                .setHasGarage(true)
                .setHasSwimmingPool(true)
                .setHasGarden(true)
                .build();
        System.out.println(luxuryVilla);
    }

    public static void prototype() {
        Distributor distributor = new Distributor();
        distributor.setId("1");
        distributor.setName("Global Distributor");

        RetailSeller retailSeller = new RetailSeller();
        retailSeller.setId("2");
        retailSeller.setName("Local Retailer");

        Seller clonedDistributor = distributor.clone();
        System.out.println("Seller Type: " + clonedDistributor.getType());
        System.out.println("Seller Name: " + clonedDistributor.getName());
        clonedDistributor.sell();

        Seller clonedRetailSeller = retailSeller.clone();
        System.out.println("Seller Type: " + clonedRetailSeller.getType());
        System.out.println("Seller Name: " + clonedRetailSeller.getName());
        clonedRetailSeller.sell();
    }
}
