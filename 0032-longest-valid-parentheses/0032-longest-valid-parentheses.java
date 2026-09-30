class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    max = Math.max(max, i-stack.peek());
                }
                else{
                    stack.push(i);
                }
            }

        }
        return max;
    }
}