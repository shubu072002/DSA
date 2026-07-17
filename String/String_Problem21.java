package String;

import java.util.Stack;

public class String_Problem21 {
    public int countMinReversals(String s) {
        //handle odd case
        if(s.length()%2!=0){
            return -1;
        }
        //remove valid braces
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            //if we got open braces "{"
            if(ch=='{'){
                stack.push(ch);
            }
            else {
                // we got "}",then we have 2 options
                if (!stack.isEmpty() && stack.peek()=='{') {
                        stack.pop();
                    }
                else{
                    stack.push(ch);
                }
            }
        }
        //now we have only invalid braces, so we have the count the occurance of open braces as well as close braces
        int a =0;
        int b =0;
        while(!stack.isEmpty()){
            char top2 = stack.peek();
            if(top2=='{'){
                b++;
            }
            else {
                a++;
            }
            stack.pop();
        }
        int ans = ((a+1)/2) + ((b+1)/2);
        return ans;

    }
    public static void main(String[] args) {
       String s = "}{{}}{{{";
       String_Problem21 minreverse = new String_Problem21();
        System.out.println(minreverse.countMinReversals(s));

    }
}
