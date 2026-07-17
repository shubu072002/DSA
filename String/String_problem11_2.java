package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class String_problem11_2 {
    public ArrayList<String> findPermutation(String s) {
        HashSet<String> ans = new HashSet<>();
        permutehelper(s,0,ans);
        return new ArrayList<>(ans);
    }
    public void permutehelper(String str,int index, HashSet<String> ans ){
        int n = str.length();
        //base case
        if(index==n-1){
            ans.add(str);
            return;
        }
        //actual logic
        for(int i=index;i<n;i++){
            str =swap(str,index,i);
           permutehelper(str,index+1,ans);

           //Backtrack
            str=swap(str,index,i);
        }
    }
    public String swap(String str, int start, int end){
        char[] chars= str.toCharArray();
        char temp=chars[end];
        chars[end]=chars[start];
        chars[start]=temp;
        return new String(chars);
    }
    public static void main(String[] args) {
        String_problem11_2 per = new String_problem11_2();
        String str = "KK";
        System.out.println(per.findPermutation(str));

    }
}
