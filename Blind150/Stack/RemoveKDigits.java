package Blind150.Stack;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char ch: num.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>ch && k>0){
                stack.pop();
                k--;
            }
            if(!stack.isEmpty() || ch!='0'){
                stack.push(ch);
            }
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
