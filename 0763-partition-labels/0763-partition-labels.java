class Solution {
    public List<Integer> partitionLabels(String s) {
        int i=0;
        int n = s.length();
        List<Integer> res = new ArrayList<>();
        while(i<n){
            int startIdx = i;
            int endIdx = s.lastIndexOf(s.charAt(startIdx));
            for(int j=startIdx+1;j<=endIdx;j++){
                int nextIdxOfCurrChar = s.lastIndexOf(s.charAt(j));
                if(nextIdxOfCurrChar>endIdx){
                    endIdx = nextIdxOfCurrChar;
                }
            }
            res.add(endIdx-i+1);
            i=endIdx+1;
        }
        return res;
    }
}
