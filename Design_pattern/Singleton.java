package Design_pattern;

public class Singleton {
    private static Singleton instanse;
    private Singleton(){}

    public static Singleton getInstance(){
        if(instanse==null){
            instanse=new Singleton();
        }
        return instanse;
    }
}
