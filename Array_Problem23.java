//Q--> find maximum product subarray
public class Array_Problem23 {
    public static int maxproduct(int[] arr , int n){
        int prefix=1;
        int suffix=1;
        int ans =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=arr[i];
            suffix*=arr[n-i-1];
            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
    //bruteforce approach
//    public static int MaxProduct(int[] arr, int n ){
//        int result = Integer.MIN_VALUE;
//
//        for(int i=0;i<n;i++){
//            int product = 1;
//            for(int j=i;j<n;j++){
//                product *= arr[j];
//                result = Math.max(product,result);
//            }
//
//        }
//        return result;
//    }
    public static void main(String[] args) {
     int[] nums = {6,-3,-10,0,2};
     int n = nums.length;
        System.out.println(maxproduct(nums,n));
    }
}
