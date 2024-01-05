package solid.open_closed;

public class Employee {
    private String type;

    public void calculateSalary() {
        if ("Manager".equals(type)) {
            // DO SOMETHING
        } else if ("Vice President".equals(type)) {
            // DO SOMETHING
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
