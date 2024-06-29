package design_patterns.structural;

import design_patterns.structural.adapter.PaymentGatewayAdapter;
import design_patterns.structural.adapter.PaymentProcessor;
import design_patterns.structural.adapter.ThirdPartyPaymentGateway;
import design_patterns.structural.bridge.device.DVDPlayerDevice;
import design_patterns.structural.bridge.device.Device;
import design_patterns.structural.bridge.device.TVDevice;
import design_patterns.structural.bridge.remote_control.AdvancedRemoteControl;
import design_patterns.structural.bridge.remote_control.BasicRemoteControl;
import design_patterns.structural.bridge.remote_control.RemoteControl;
import design_patterns.structural.composite.Department;
import design_patterns.structural.composite.Employee;
import design_patterns.structural.composite.OrganizationComponent;

public class StructuralApp {
    public static void main(String[] args) {
        adapter();
        bridge();
        composite();
    }

    public static void adapter() {
        PaymentProcessor paymentProcessor = new PaymentGatewayAdapter(new ThirdPartyPaymentGateway());
        paymentProcessor.pay(100);
    }

    public static void bridge() {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemoteControl(tv);

        basicRemote.powerOn();
        basicRemote.setChannel(5);
        basicRemote.setVolume(20);
        basicRemote.powerOff();

        Device dvdPlayer = new DVDPlayerDevice();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(dvdPlayer);

        advancedRemote.powerOn();
        advancedRemote.setVolume(30);
        advancedRemote.mute();
        advancedRemote.powerOff();
    }

    public static void composite() {
        OrganizationComponent alice = new Employee("Alice", "Developer");
        OrganizationComponent bob = new Employee("Bob", "Designer");
        OrganizationComponent charlie = new Employee("Charlie", "Manager");

        Department devDept = new Department("Development");
        devDept.addComponent(alice);

        Department designDept = new Department("Design");
        designDept.addComponent(bob);

        Department headDept = new Department("Head");
        headDept.addComponent(charlie);
        headDept.addComponent(devDept);
        headDept.addComponent(designDept);

        // Showing details of the entire organization
        headDept.showDetails();
    }
}
