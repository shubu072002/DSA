package Blind75.SlidingWindow;

import java.util.*;

public class LongestSubstringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {

      int n = s.length();
        if(n==0){
            return 0;
        }
      int maxLength = Integer.MIN_VALUE;
      int start = 0;
      int end =0;
      HashMap<Character, Integer> map = new HashMap<>();
      while(start<n && end<n){
          char ch = s.charAt(end);
          if(map.containsKey(ch) && map.get(ch)>=start){
              start=map.get(ch)+1;
              map.put(ch,end);
          }
          else {
              map.put(ch,end);
          }
          int length = end - start +1;
          maxLength=Math.max(length, maxLength);
          end++;
      }
      return maxLength;
    }
}
