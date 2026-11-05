class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int n = arr2.length;
        int count =0;
        for(int i=0;i<arr1.length;i++){
            int j = lowerBound(arr2, arr1[i]);
            
            if(j==0){
                  if (Math.abs(arr1[i] - arr2[0]) > d) {
                 count++;
    }
            }
            else if(j==n){
                if(Math.abs(arr1[i]-arr2[n-1])>d){
                    count++;
                }
            }
            else{
                if(Math.abs(arr1[i]-arr2[j])>d && Math.abs(arr1[i]-arr2[j-1])>d){
                    count++;
                }
            }
      
        }
          return count;
    }

    public int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}