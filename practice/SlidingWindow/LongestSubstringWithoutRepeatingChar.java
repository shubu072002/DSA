package practice.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
      int windowStart = 0;
      int windowEnd = 0;
      int maxlength = Integer.MIN_VALUE;
      int n = s.length();
      HashMap<Character, Integer> map = new HashMap<>();
      while(windowEnd<n){
          char ch = s.charAt(windowEnd);
          if(map.containsKey(ch) && map.get(ch)>=windowStart){
              windowStart = map.get(ch)+1;
          }
          map.put(ch, windowEnd);
          maxlength = Math.max(maxlength, windowEnd-windowStart+1);
          windowEnd++;
      }
      return (maxlength==Integer.MIN_VALUE?0 : maxlength);
    }
}
