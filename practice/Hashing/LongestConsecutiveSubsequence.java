package practice.Hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int result =1;
        int length=1;
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(prev==arr[i]){
                continue;
            }
            if(arr[i]==prev+1){
                length++;
            }
            else{
                length=1;
            }
            prev=arr[i];
            result=Math.max(result, length);
        }
        return result;
    }
}
