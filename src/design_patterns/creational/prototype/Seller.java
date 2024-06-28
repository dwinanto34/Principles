package design_patterns.creational.prototype;

public abstract class Seller {
    private String id;
    protected String type;
    protected String name;
    protected boolean isWholesale;

    public abstract void sell();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWholesale() {
        return isWholesale;
    }

    public abstract Seller clone();

    @Override
    public String toString() {
        return "Seller [id=" + id + ", type=" + type + ", name=" + name + ", isWholesale=" + isWholesale + "]";
    }
}
