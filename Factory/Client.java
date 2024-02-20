package Factory;

import Factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Platform p = new Platform();
        UIComponentFactory uiComponentFactory = p.createUIComponentFactory("Android");
        Button b = uiComponentFactory.createButton();
        b.getSize();
    }
}
