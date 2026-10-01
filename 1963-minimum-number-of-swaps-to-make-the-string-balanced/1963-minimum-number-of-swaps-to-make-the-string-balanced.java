class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int balance =0;
        int swaps = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='['){
                balance++;
            }
            else{
                balance--;
            }
            if(balance<0){
                swaps++;
                balance+=2;
            }
        }
        return swaps;
    }
}