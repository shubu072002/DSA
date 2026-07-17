package String;
//Q-->Write a Program to check whether a string is a valid shuffle of two strings or not
import java.util.Arrays;

public class String_Problem6 {
    public static String sort(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);
        return str;
    }
    public static boolean isshuffle(String first, String second, String result){
        int n = first.length();
        int m = second.length();
        if(n+m!=result.length()){
            return false;
        }
        first = sort(first);
        second=sort(second);
        result=sort(result);

        int i=0;
        int j =0;
        int k=0;
        while(k<result.length()){
            if(i<first.length() && first.charAt(i)==result.charAt(k)){
                i++;
            } else if (j<second.length() && second.charAt(j)==result.charAt(k)) {
                j++;
            }
            else {
                return false;
            }
            k++;
        }
        if(i<first.length() || j<second.length()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String first= "acbd";
        String second = "egf";
        String result = "adbecfg";
        if(isshuffle(first,second,result)){
            System.out.println("String is a valid shuffle");
        }
        else
        System.out.println("String is not a valid shuffle ");

    }
}
