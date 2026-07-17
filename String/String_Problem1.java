package String;

public class String_Problem1 {
    public static void reverseString(String name){
        int l = name.length();
        String Rev = " ";
        for(int i=l-1;i>=0;i--){
            Rev += name.charAt(i);
        }
        System.out.println(Rev);
    }
    public static void main(String[] args) {
        String name = "SHUBHAM";
        reverseString(name);

    }
}
