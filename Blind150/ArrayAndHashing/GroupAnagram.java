package Blind75.ArrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];
            for(char ch: s.toCharArray()){
                int freqIdx = ch-97;
                freq[freqIdx]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int element: freq){
                sb.append("#");
                sb.append(element);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
