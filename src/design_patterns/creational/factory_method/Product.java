package design_patterns.creational.factory_method;

public interface Product {
    String getName();
    String getType();
    boolean isPhysicalProduct();
    void use();
}
