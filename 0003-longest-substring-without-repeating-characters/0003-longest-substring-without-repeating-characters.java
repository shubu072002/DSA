class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength  =0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end =0;
        while(end<n){
            char ch = s.charAt(end);
            if(map.containsKey(ch) && map.get(ch)>=start){
               start = map.get(ch)+1;
            }
            int length = end - start +1;
            maxLength = Math.max(maxLength, length);
            map.put(ch,end);
            end++;
        }
        return maxLength;
    }
}