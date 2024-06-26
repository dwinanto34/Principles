package design_patterns.creational.abstract_factory.checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a MacOS style.");
    }
}
