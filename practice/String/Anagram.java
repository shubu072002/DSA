package practice.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        s = s.toLowerCase();
        t =t.toLowerCase();
        int i=0;
        int j=0;
        int l = s.length();

        int[] freq = new int[26];

        while(i<l && j<l){
            char charA = s.charAt(i);
            int freqIdxA = charA-97;
            freq[freqIdxA]++;

            char charB = t.charAt(j);
            int freqIdxB = charB-97;
            freq[freqIdxB]--;
        }
        for(int element: freq){
            if(element != 0){
                return false;
            }
        }
        return true;

    }
}
