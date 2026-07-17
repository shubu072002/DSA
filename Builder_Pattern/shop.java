package Builder_Pattern;

public class shop {
    public static void main(String[] args) {
        Phone phone = new Phonebuilder().setos("Android").setRam(8).getPhone();
        System.out.println(phone);
    }
}
