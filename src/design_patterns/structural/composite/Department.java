package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (OrganizationComponent component : components) {
            component.showDetails();
        }
    }
}
