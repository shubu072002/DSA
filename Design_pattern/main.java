package Design_pattern;

public class main {
    public static void main(String[] args) {
        Shape s1 = shapeFactory.getShape("Circle");
        System.out.println(s1.hashCode());
    }
}
