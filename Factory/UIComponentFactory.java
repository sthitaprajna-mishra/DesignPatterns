package Factory;

import Factory.components.button.Button;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
