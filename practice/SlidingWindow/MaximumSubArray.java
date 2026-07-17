package practice.SlidingWindow;

public class MaximumSubArray {
    int maxSubarraySum(int[] arr) {
       int cursum =0;
       int maxsum = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           cursum+=arr[i];
           if(cursum>maxsum){
               maxsum=cursum;
           }
           if (cursum<0) {
               cursum=0;
           }
       }
       return maxsum;
    }
}
