package design_patterns.creational.factory_method;

public class DigitalProduct implements Product {
    private final static String DIGITAL_TYPE = "DIGITAL";

    private String name;
    private String type;
    private boolean isPhysicalProduct;

    public DigitalProduct(String name) {
        this.name = name;
        this.type = DIGITAL_TYPE;
        this.isPhysicalProduct = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isPhysicalProduct() {
        return isPhysicalProduct;
    }

    @Override
    public void use() {
        System.out.println("Using Digital Product " +
                ", with name : " + name +
                ", type : " + type +
                ", isPhysicalProduct : " + isPhysicalProduct);
    }
}
