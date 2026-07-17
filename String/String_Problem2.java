package String;

//Q--> palindrome or not ?
public class String_Problem2 {
     public static void reverseString(String name){
            int l = name.length();
            String Rev = "";
            for(int i=l-1;i>=0;i--){
                Rev += name.charAt(i);
            }
            if(name.equals(Rev)){
                System.out.println("palindrome String");
            }
            else {
                System.out.println("Not a palindrome String");
            }
     }


    public static void main(String[] args) {
         String name = "BOB";
         reverseString(name);

    }
}
