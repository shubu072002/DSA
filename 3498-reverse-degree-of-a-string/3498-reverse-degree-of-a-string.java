class Solution {
    public int reverseDegree(String s) {
        int[] revIdx = new int[26];
        for(int i=0;i<26;i++){
            revIdx[i]=revIdx.length-i;
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            int charIdx = (s.charAt(i)-'a');
            ans+= (i+1)*(revIdx[charIdx]);
        }
        return ans;
    }
}