package Blind75.ArrayAndHashing;

public class RemoveZeros {
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void moveZeroes(int[] nums) {
       int nonZeros =0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               swap(nums, i,nonZeros);
               nonZeros++;
           }
       }
    }
}
