package Blind150.TwoPinters;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int length = s.length();
        String lowerCase = s.toLowerCase();
        int left =0;
        int right=length-1;
        while(left<right) {
            char l = lowerCase.charAt(left);
            char r = lowerCase.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if(lowerCase.charAt(left) != lowerCase.charAt(right)) {
                    return false;
                }
            left++;
            right--;
        }
        }
        return true;
    }
}
