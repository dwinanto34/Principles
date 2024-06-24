package design_patterns.creational.factory_method;

public abstract class ProductCreator {
    // Factory method
    public abstract Product factoryMethod(String name);

    public void checkout(String name) {
        Product product = factoryMethod(name);
        product.use();
    }
}
