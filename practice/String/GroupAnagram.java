package practice.String;
import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // setp 1 - create a hashmap
        HashMap<String, List<String>> map = new HashMap<>();
        // setp 2 - generate hash for each string
        for(String s : strs){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                int freqIndex = c - 97;
                freq[freqIndex]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: freq){
                sb.append("#");
                sb.append(i);
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
