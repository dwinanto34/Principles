package design_patterns.creational.abstract_factory.button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a MacOS style.");
    }
}
