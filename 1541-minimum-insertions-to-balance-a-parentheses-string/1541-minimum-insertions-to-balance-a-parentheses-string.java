class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int res = 0;
        int count = 0;
        int i=0;
        while(i<n){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
                i++;
            }
            else
            {
                if(count>0){
                    count--;
                }
                else{
                    res++;
                }
                if(i+1<n && s.charAt(i+1)==')'){
                    i+=2;
                }
                else{
                    res++;
                    i++;
                }
            }
        }
        return res + (count*2);
    }
}