package Blind150.Stack;

import java.util.Stack;

public class Count_Minimum_Bracket_Removal {
    public int countMinReversals(String s) {
        int n = s.length();
        if(n%2!=0){
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty() || stack.peek()=='}'){
                    stack.push(ch);
                }
                else{
                    stack.pop();
                }
            }
        }
        int ans =0;
        int open =0;
        int close =0;
        while(!stack.isEmpty()){
            char ch = stack.pop();
            if(ch=='{'){
                open++;
            }
            else{
                close++;
            }
        }
        ans = (int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
        return ans;
    }

}
