class Solution {
    public int scoreOfParentheses(String s) {
       int n = s.length();
       Stack<Integer> stack = new Stack<>();
       stack.push(0);
       for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(ch=='('){
            stack.push(0);
        }
        else{
            int innerscore = stack.pop();
            int score = Math.max(2*innerscore, 1);
            int prev = stack.pop();
            stack.push(prev+score);
        }
       }
       return stack.pop();
      }
}