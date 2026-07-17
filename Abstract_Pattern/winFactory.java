package Abstract_Pattern;

public class winFactory implements GUIFactory{
    public Button createButton(){
        return new WinButton();
    }
}
