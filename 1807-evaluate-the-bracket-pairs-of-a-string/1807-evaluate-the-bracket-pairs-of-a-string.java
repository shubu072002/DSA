class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        HashMap<String, String> map = new HashMap<>();
        for(List<String> list: knowledge){
            map.put(list.get(0), list.get(1));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                int closeIdx = s.indexOf(')',i);
                String key = s.substring(i+1, closeIdx);
                if(map.containsKey(key)){
                    sb.append(map.get(key));
                }else{
                    sb.append('?');
                }  
                i=  closeIdx;  
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}