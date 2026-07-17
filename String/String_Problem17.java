package String;

import java.util.Arrays;
import java.util.HashSet;

public class String_Problem17 {
    public boolean wordBreak(String s, String[] dictionary) {
        int n = s.length();
        int[] dp = new int [n+1];
        Arrays.fill(dp,-1);

        HashSet<String> set = new HashSet<>();
        for(String element : dictionary){
            set.add(element);
        }
        return solve(s,set,0,dp);
    }

    public boolean solve(String s, HashSet<String> set, int i, int[] dp){
        //base case
        if (i == s.length()) return true;

        //check dp
        if(dp[i]!=-1){
            if(dp[i]==1){
                return true;
            }
            else {
                return false;
            }
        }
        //logic
        String temp = "";
        for(int j=i;j<s.length();j++){
            temp+=s.charAt(j);
            if(set.contains(temp)){
                if(solve(s,set,j+1,dp)){
                    dp[i]=1;
                    return true;
                }
            }
        }
        dp[i]=0;
        return false;

    }
}
