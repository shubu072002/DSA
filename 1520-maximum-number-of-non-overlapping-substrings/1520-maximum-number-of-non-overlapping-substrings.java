class Solution {
    public List<String> maxNumOfSubstrings(String s) {
      int n = s.length();
      int[] start = new int[26];
      int[] end = new int[26];
      List<String> result = new ArrayList<>();
      boolean[] isvalid = new boolean[26];
      Arrays.fill(start,-1);
      Arrays.fill(isvalid,true);
      for(int i=0;i<n;i++){
        int charIdx = s.charAt(i)-'a';
        if(start[charIdx]==-1){
           start[charIdx]=i;
        }
        end[charIdx]=i;
      }  
      for(int i=0;i<26;i++){
        if(start[i]==-1)continue;

        for(int j=start[i];j<=end[i];j++){
            int idx = s.charAt(j)-'a';
            if(start[idx]<start[i]){
                isvalid[i]=false;
                break;
            } 
            end[i]=Math.max(end[i],end[idx]);
        }
      }
       int lastTakenStart = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            int c = s.charAt(i) - 'a';

            if (!isvalid[c]) continue;

            if (i == start[c] && end[c] < lastTakenStart) {
                result.add(s.substring(i, end[c] + 1));
                lastTakenStart = i;
            }
        }

        return result;
    }
}