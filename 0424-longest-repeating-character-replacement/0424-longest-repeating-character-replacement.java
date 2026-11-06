class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int freqMap[] = new int[26];
        int maxLength = Integer.MIN_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int start = 0;
        int end =0;
        while(end<n){
            char ch = s.charAt(end);
            freqMap[ch-'A']++;
            maxFreq = Math.max(maxFreq, freqMap[ch-'A']);
            int windowSize = end - start + 1;
            if((windowSize-maxFreq)>k){
                char c = s.charAt(start);
                freqMap[c-'A']--;
                start++;
            } 
            int length = end -start +1;
            maxLength = Math.max(maxLength, length);
            end++;
        }
        return maxLength;
    }
}