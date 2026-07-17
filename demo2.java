public class demo2 {
    public static void palindrome(String name){
    int l = name.length();
    String rev = "";
    for(int i=l-1;i>=0;i--){
        rev +=name.charAt(i);
    }
    if(name.equals(rev)){
        System.out.println("palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
    }
    public static void main(String[] args) {
        String name = "bob";
      palindrome(name);
    }
}
