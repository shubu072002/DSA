package Singleton;

public class singleton {
    public static singleton instance;
    private singleton(){
    }
    public static singleton getInstance(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        singleton s1=singleton.getInstance();
        System.out.println(s1.hashCode());
        singleton s2=singleton.getInstance();
        System.out.println(s2.hashCode());
    }
}
