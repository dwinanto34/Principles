package design_patterns.creational.prototype;

public class Distributor extends Seller {
    public Distributor() {
        type = "Distributor";
        isWholesale = true;
    }

    @Override
    public void sell() {
        System.out.println("Selling products in bulk as a Distributor");
    }

    @Override
    public Seller clone() {
        Distributor clone = new Distributor();
        clone.setId(this.getId());
        clone.setName(this.getName());
        return clone;
    }
}
