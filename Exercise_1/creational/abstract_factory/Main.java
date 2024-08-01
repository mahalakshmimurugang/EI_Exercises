package abstract_factory;
public class Main {
    public static void main(String[] args) {
        GUIComponent factory = new WindowsGUIComponent();
        Button buttonFeature = factory.createButton();
        TextField textFieldFeature = factory.createTextField();
        buttonFeature.button();
        textFieldFeature.textField();

        factory = new MacOSGUIComponent();
        buttonFeature = factory.createButton();
        textFieldFeature = factory.createTextField();
        buttonFeature.button();
        textFieldFeature.textField();
    }
}