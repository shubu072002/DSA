package practice.TwoPointer;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
      int i=0;
      for(int element: nums){
          if(i<1 || nums[i-1] != element){
              nums[i] = element;
              i++;
          }
      }
      return i;
    }
}
