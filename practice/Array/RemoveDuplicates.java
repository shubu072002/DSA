package practice.Array;
// use two pointers
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int element: nums){
            if(i<2 || nums[i-2] != element){
                nums[i] = element;
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {


    }
}
