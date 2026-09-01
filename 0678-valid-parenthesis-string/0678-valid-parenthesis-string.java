class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> astrisk =new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open.push(i);
            }
            else if(s.charAt(i)=='*'){
                astrisk.push(i);
            }
            else{
                if(!open.isEmpty()){
                    open.pop();
                }
                else if(!astrisk.isEmpty()){
                    astrisk.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!open.isEmpty()){
            if(astrisk.isEmpty()){
                return false;
            }
            if(open.pop()>astrisk.pop()){
                return false;
            }
        }
        return true;
    }
}