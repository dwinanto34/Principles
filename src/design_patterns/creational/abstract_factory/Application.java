package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.button.Button;
import design_patterns.creational.abstract_factory.checkbox.Checkbox;
import design_patterns.creational.abstract_factory.factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
