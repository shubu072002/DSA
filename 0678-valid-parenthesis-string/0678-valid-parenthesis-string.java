class Solution {
    public boolean checkValidString(String s) {
      int n = s.length();
      Stack<Integer> open = new Stack<>();
      Stack<Integer> aestrick = new Stack<>();  

      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(ch=='('){
            open.push(i);
        }
        else if (ch=='*'){
            aestrick.push(i);
        }
        else{
            if(!open.isEmpty()){
                open.pop();
            }
            else if (!aestrick.isEmpty()){
                aestrick.pop();
            }
            else{
                return false;
            }
        }
      }
      while(!open.isEmpty()){
        if(aestrick.isEmpty()){
            return false;
        }
        if(open.pop()>aestrick.pop()){
            return false;
        }
      }
      return true;
    }
}