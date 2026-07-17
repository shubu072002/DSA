//Q- Find duplicate in an array of n+1 integers.
public class Array_Problem11 {
    public static int duplicate(int[] nums){
        int slow=0;
        int fast=0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow!=fast);
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,2};
        System.out.println(duplicate(arr));
        
    }
}
