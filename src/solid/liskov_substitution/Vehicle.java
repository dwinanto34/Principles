package solid.liskov_substitution;

public class Vehicle {
    public void start() {
        // DO SOMETHING
    }

    public void stop() {
        // DO SOMETHING
    }

    // if we add charge or addGas method here
    // we don't apply Liskov rule
    // because not all vehicle could charge and addGas
}
