package Blind150.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
     int start = 0;
     int end = 0;
     int startIdx = -1;
     int n = s.length();
     int min = Integer.MAX_VALUE;
     HashMap<Character, Integer> map = new HashMap<>();
     for(int i=0;i<t.length();i++){
         char ch = t.charAt(i);
         map.put(ch, map.getOrDefault(ch,0)+1);
     }
     int uniqueCharCount = map.size();
     //Expansion part
        while (end<n){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    uniqueCharCount--;
                }
            }
     //shrinking part

        while(uniqueCharCount==0){
            int len = end - start + 1;
            if(len<min){
                min=len;
                startIdx=start;
            }
            ch = s.charAt(start);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                if(map.get(ch)>0) {
                    uniqueCharCount++;
                }
            }
            start++;
        }

            end++;
        }
        if(startIdx==-1){
            return "";
        }
        return s.substring(startIdx,startIdx+min);
    }
}
