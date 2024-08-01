package abstract_factory;

public class WindowsGUIComponent extends GUIComponent {
    public Button createButton() {
        return new WindowsButton();
    }
    public TextField createTextField() {
        return new WindowsText();  
    }
}
