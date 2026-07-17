package Blind75.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int start=0;
        int end = 0;
        int maxFreq = Integer.MIN_VALUE;
        int maxLength= Integer.MIN_VALUE;
        int[] freqmap = new int[26];
        while(start<n && end<n){
            freqmap[s.charAt(end)-'A']++;
            maxFreq = Math.max(maxFreq, freqmap[s.charAt(end)-'A']);
            int windowSize = end - start +1;

            if(windowSize-maxFreq>k){
                freqmap[s.charAt(start)-'A']--;
                start++;
            }
            windowSize =  end - start +1;
            maxLength=Math.max(maxLength, windowSize);
            end++;
        }
        return maxLength;

    }
}
