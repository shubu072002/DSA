package practice.Array;

public class RemoveZeros {
    public void moveZeroes(int[] nums) {
      int nonZeros = 0;
      for(int j=0;j<nums.length;j++){
          if(nums[j] !=0){
              swap(nums, nonZeros, j);
              nonZeros++;
          }
      }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {

    }
}
