class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int start = 0;
        int end =0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',1);
        int uniqueCharCount = map.size();
        int count =0;
        while(end<n){
            char ch = s.charAt(end);
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                uniqueCharCount--;
            }
            while(uniqueCharCount==0){
                count+=n-end;
                char c = s.charAt(start);
                map.put(c,map.get(c)+1);
                if(map.get(c) > 0) {
    uniqueCharCount++;
}
                start++;
            }
            end++;
        }
        return count;
    }
}