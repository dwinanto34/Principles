package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.button.Button;
import design_patterns.creational.abstract_factory.button.WindowsButton;
import design_patterns.creational.abstract_factory.checkbox.Checkbox;
import design_patterns.creational.abstract_factory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
