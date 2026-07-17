package String;

import java.util.HashMap;
import java.util.HashSet;

public class String_Problem33 {
    public int findSubString(String str) {
        int n =str.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(str.charAt(i));
        }
        int setlength =set.size();
        int i=0;
        int j=0;
        int ans =Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            char ch = str.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==setlength){
             while(map.get(str.charAt(i))>1){
                 map.put(str.charAt(i),map.get(str.charAt(i))-1);
                 i++;
             }
             ans=Math.min(ans,j-i+1);
            }
            j++;
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
