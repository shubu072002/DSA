package String;

import java.util.*;
public class String_Problem3 {
    public static void findDuplicate(String name){
        //Method 1
//        HashSet<Character> set = new HashSet<>();
//        for(int i=0;i<name.length();i++){
//            if(!set.add(name.charAt(i))){
//                System.out.println("Rejected at: "+name.charAt(i));
//            }
//        }
        //TC - O(N) SC - O(N)
        //Method 2

        char[] charArray = name.toCharArray();
        Arrays.sort(charArray);
        boolean duplicateFound = false;
        for(int i=1;i<charArray.length;i++){
            if(charArray[i]==charArray[i-1]){
                System.out.print("Rejected at:"+charArray[i]);
                System.out.println();
                duplicateFound = true;
            }
        }
           if(!duplicateFound){
               System.out.println("No duplicates");
           }
    }
    // TC - O(nlogn) SC - O(1)
    public static void main(String[] args) {
        String name = "SHUBHAMA";
        findDuplicate(name);

    }
}
