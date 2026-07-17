//Q- Next Permutation
public class Array_Problem15 {
    public static void nextPermutation(int[] nums){
        int n = nums.length;
        int k = n-2;
        //null check
        if(nums.length==0 || nums==null){
            return;
        }
        // Find k
        for(int i =n-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                k--;
            }
            else {
                break;
            }
        }
        // k==-1---> reverse the array
        if(k==-1){
            reverse(nums,0,n-1);
        }
        else {
            //replace k with the next greater number on the right side of the k and revrse after swaping
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[k]){
                    int temp = nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                    break;
                }
            }
            reverse(nums,k+1,n-1);

        }
    }
     static void reverse(int [] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

     }
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,1};
        nextPermutation(arr);
        for(int element: arr){
            System.out.print(element + " ");
        }


    }
}

