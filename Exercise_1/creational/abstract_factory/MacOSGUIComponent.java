package abstract_factory;

public class MacOSGUIComponent extends GUIComponent {
    public Button createButton() {
        return new MacOSButton();
    }
    public TextField createTextField() {
        return new MacOSText();
    }
}
