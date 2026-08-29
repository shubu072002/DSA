class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       int n = strs.length;
       HashMap<String, ArrayList<String>> map = new HashMap<>();
       for(String s : strs){
        int[] freqCount = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freqCount[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append('#');
            sb.append(freqCount[i]);
        }
        String str = sb.toString();
        if(!map.containsKey(str)){
            map.put(str,new ArrayList<>());
        }
        ArrayList<String> list=map.get(str);
        list.add(s);
       }
       return new ArrayList<>(map.values());
    }
}