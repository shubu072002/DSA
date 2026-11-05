class Solution {
    public boolean isPalindrome(String s) {
       String str =  s.toLowerCase();
        int n = s.length();
        int  i = 0;
        int j = n-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}