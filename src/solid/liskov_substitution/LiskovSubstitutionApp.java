package solid.liskov_substitution;

public class LiskovSubstitutionApp {
    public static void main(String[] args) {
        // Good example
        // Because all child vehicles could start and stop
        NormalVehicle normalVehicle = new NormalVehicle();
        normalVehicle.addGas();

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.charge();
    }
}
