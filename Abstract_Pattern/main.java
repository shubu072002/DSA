package Abstract_Pattern;

public class main {
    public static void main(String[] args) {
        GUIFactory winFactory=new winFactory();
        Button winButton=winFactory.createButton();
        winButton.Paint();
    }
}
