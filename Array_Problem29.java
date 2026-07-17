//Q--> TRAPPING RAINWATER PROBLEM
public class Array_Problem29 {
    public static int maxWater(int[] arr){
       int n = arr.length;
       int leftmax=0;
       int rightmax=0;
       int l=0;
       int r=n-1;
       int ans =0;
       while(l<r){
           if(arr[l]>leftmax) leftmax=arr[l];
           if(arr[r]>rightmax) rightmax=arr[r];

           if(leftmax<rightmax){
               ans+=leftmax-arr[l];
               l++;
           }
           else {
               ans+=rightmax-arr[r];
               r--;
           }
       }
       return ans ;
    }


    //BRUTEFORCE APPROCH
//    public static int maxWater(int[] arr) {
//        int n = arr.length;
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            int leftMax = 0;
//            for (int l = 0; l < i; l++) {
//                if (arr[l] > leftMax) {
//                    leftMax = arr[l];
//                }
//            }
//                int rightMax = 0;
//                for (int r = i; r < n; r++) {
//                    if (arr[r] > rightMax) {
//                        rightMax = arr[r];
//                    }
//                }
//                    int min = Math.min(leftMax, rightMax) - arr[i];
//                    if (min > 0) {
//                        ans += min;
//                    }
//
//
//            }
//            return ans;
//        }
        public static void main (String[] args){
            int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            System.out.println(maxWater(height));


        }
}
