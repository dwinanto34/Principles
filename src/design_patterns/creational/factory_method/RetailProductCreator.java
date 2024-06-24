package design_patterns.creational.factory_method;

public class RetailProductCreator extends ProductCreator {

    @Override
    public Product factoryMethod(String name) {
        return new RetailProduct(name);
    }
}
