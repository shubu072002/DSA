package String;
//Q-->Longest Common Prefix
public class String_Problem27 {
    public String longestCommonPrefix(String[] strs){
        int minlength = Integer.MAX_VALUE;
        String ans ="";
        int count=0;

        // Step 1: Find the smallest string (by length)
        for(int i=0;i<strs.length;i++){
            int len =strs[i].length();
            if(len<minlength){
                minlength=len;
                ans=strs[i];
            }
        }

        // Step 2: Compare characters of all strings with the chosen "ans"
        for(int i=0;i<minlength;i++){
            char ch = ans.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    ans=ans.substring(0,count);
                    return ans;
                }
            }
            count++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
