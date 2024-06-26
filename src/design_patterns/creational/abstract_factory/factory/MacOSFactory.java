package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.button.Button;
import design_patterns.creational.abstract_factory.button.MacOSButton;
import design_patterns.creational.abstract_factory.checkbox.Checkbox;
import design_patterns.creational.abstract_factory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
