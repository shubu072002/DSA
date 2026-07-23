package Blind150.Stack;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluatReversePolishNotation {
    private boolean isOperator(String str){
        return str.equals("*") || str.equals("+") || str.equals("-") || str.equals("/") ;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens){
            if(!isOperator(s)){
                st.push(Integer.parseInt(s));
            }
            else{
                int b = st.pop();
                int a = st.pop();
                if (s.equals("+")) st.push(a+b);
                else if (s.equals("-")) st.push(a-b);
                else if (s.equals("*")) st.push(a*b);
                else if (s.equals("/")) st.push(a/b);
            }
        }
        return st.pop();
    }
}
