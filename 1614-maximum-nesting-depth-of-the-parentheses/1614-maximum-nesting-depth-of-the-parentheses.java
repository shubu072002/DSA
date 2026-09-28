class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int max = 0;
        int count =0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
                max = Math.max(max,count);
            }
            if(ch==')'){
                count--;
            }
        }
        return max;
    }
}