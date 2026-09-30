class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();
        for(char ch: num.toCharArray()){
            while(!stack.isEmpty() && ch<stack.peek() && k>0){
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
        for(char elem: stack){
            sb.append(elem);
        }
        return sb.toString();
    }
}