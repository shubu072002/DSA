package Blind75.Stack;
import java.util.*;

public class LongestValidParenthesis {
    public int longestValidParentheses(String s) {
      int n = s.length();
        if(n==0){
            return 0;
        }
      Stack<Integer> st = new Stack<>();
      int max = 0;
      st.push(-1);
      for(int i=0;i<n;i++){
          char ch = s.charAt(i);
          if(ch=='('){
              st.push(i);
          }
          else{
              st.pop();
              if(!st.isEmpty()){
                  max = Math.max(max, i-st.peek());
              }
              else {
                  st.push(i);
              }
          }

      }
      return max;
    }
}
