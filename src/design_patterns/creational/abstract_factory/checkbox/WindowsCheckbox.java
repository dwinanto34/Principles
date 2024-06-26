package design_patterns.creational.abstract_factory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style.");
    }
}
