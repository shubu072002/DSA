package Factory_pattern;

public class ShapeFactory {
    public static Shape getShape(String type){
        if(type.equals("circle")){
            System.out.println("Object of circle class");
            return new Circle();
        } else if (type.equals("Square")) {
            return new Sqaure();
        }
        else
            return null;
    }
}
