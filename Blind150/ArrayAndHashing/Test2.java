package Blind150.ArrayAndHashing;

public interface Test2 {

     void hello();

}
class Test3 implements Test2{

    @Override
    public void hello(){
        System.out.println("Hello Arpit");
    }
}
 class main {
    public static void main(String[] args) {
    Test2 test2 = new Test3();
    test2.hello();
    }
}

