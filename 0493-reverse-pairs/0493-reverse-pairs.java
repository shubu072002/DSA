class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        return mergeSort(nums,left, right);
    }
    public int countReversePair(int[] nums, int left, int right){
         int mid = left + (right-left)/2;

         int count = 0;
         int j = mid+1;
         for(int i=left;i<=mid;i++){
            while(j<=right && (long)nums[i]>2L*nums[j]){
                j++;
            }
            count+= j-(mid+1);
         }
         return count;
    }
    public int mergeSort(int[] nums, int left, int right){
        int count = 0;
        if(left>=right){
            return 0;
        }

        int mid = left + (right-left)/2;

        count+=mergeSort(nums,left,mid);
        count+=mergeSort(nums,mid+1,right);
        count+=countReversePair(nums,left,right);
        merge(nums,left,right);
        return count;
    }
    public void merge(int[] nums, int left, int right){
        int mid = left + (right-left)/2;

        int len1 = mid-left+1;
        int len2 = right-mid;

        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];

        int k = left;
        for(int i =0;i<len1;i++){
            leftArr[i]=nums[k++];
        }
        k=mid+1;
        for(int i=0;i<len2;i++){
            rightArr[i]=nums[k++];
        }

        int i =0;
        int j=0;
         k = left;
        while(i<len1 && j<len2){
            if(leftArr[i]<=rightArr[j]){
                nums[k++]=leftArr[i++];
            }
            else if(leftArr[i]>rightArr[j]){
                nums[k++]=rightArr[j++];
            }
        }
        while(i<len1){
            nums[k++]=leftArr[i++];
        }
        while(j<len2){
            nums[k++]=rightArr[j++];
        }
    }
}