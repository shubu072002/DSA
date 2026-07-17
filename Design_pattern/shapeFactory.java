package Design_pattern;

public class shapeFactory {
    public static Shape getShape(String type){
        if(type.equals("Circle")){
            System.out.println("Object of Circle class");
            return new Circle();
        } else if (type.equals("Sqaure")) {
            System.out.println("Object of Sqaure class");
            return new Square();
        }
        else {
            return null;
        }
    }
}
