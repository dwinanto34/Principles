package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.button.Button;
import design_patterns.creational.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();

}
