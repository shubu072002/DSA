package String;

import java.util.Stack;

public class String_Problem16 {
    public boolean isBalanced(String s) {
        int n =s.length();
        if(n%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (ch == '}' && top != '{') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                } else if (ch == ')' && top != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       String s = "[{()}]";
        String_Problem16 parenthesis = new String_Problem16();
        System.out.println(parenthesis.isBalanced(s));

    }
}
