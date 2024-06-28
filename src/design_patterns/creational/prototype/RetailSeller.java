package design_patterns.creational.prototype;

public class RetailSeller extends Seller {
    public RetailSeller() {
        type = "RetailSeller";
        isWholesale = false;
    }

    @Override
    public void sell() {
        System.out.println("Selling products individually as a Retail Seller");
    }

    @Override
    public Seller clone() {
        RetailSeller clone = new RetailSeller();
        clone.setId(this.getId());
        clone.setName(this.getName());
        return clone;
    }
}
