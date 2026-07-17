package Abstract_Pattern;

public class MacFactory implements GUIFactory{
    public Button createButton(){
        return new MacButton();
    }
}
