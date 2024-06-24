package design_patterns.creational.factory_method;

public class RetailProduct implements Product {
    private final static String RETAIL_TYPE = "RETAIL";

    private String name;
    private String type;
    private boolean isPhysicalProduct;

    public RetailProduct(String name) {
        this.name = name;
        this.type = RETAIL_TYPE;
        this.isPhysicalProduct = true;
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
        System.out.println("Using Retail Product " +
                ", with name : " + name +
                ", type : " + type +
                ", isPhysicalProduct : " + isPhysicalProduct);
    }
}
