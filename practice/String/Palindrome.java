package practice.String;

public class Palindrome {
//    boolean isPalindrome(String s) {
//        int n = s.length();
//        String rev = "";
//        for(int i=n-1;i>=0;i--){
//            rev += s.charAt(i);
//        }
//        if(s.equals(rev)){
//            return true;
//        }
//        return false;
//    }
boolean isPalindrome(String s) {
 int left = 0;
 int right= s.length()-1;

 while(left<right){
     if(s.charAt(left) != s.charAt(right)){
         return false;
     }
     left++;
     right--;
 }
 return true;
}
}
