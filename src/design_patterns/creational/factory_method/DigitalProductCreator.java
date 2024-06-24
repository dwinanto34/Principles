package design_patterns.creational.factory_method;

public class DigitalProductCreator extends ProductCreator {

    @Override
    public Product factoryMethod(String name) {
        return new DigitalProduct(name);
    }
}
