package Blind150.RecursionAndBacktracking;
import java.util.*;

public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        StringBuilder sb = new StringBuilder();
        String[] mapping = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(res,digits,0,sb, mapping);
         return res;
    }
    public void helper(List<String> res, String digits, int index, StringBuilder sb, String[] mapping){
        //base case
        if(index>=digits.length()){
            res.add(sb.toString());
            return;
        }
        Integer number = (int)digits.charAt(index);
        String str = mapping[number];

        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            helper(res,digits,index+1,sb, mapping);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
