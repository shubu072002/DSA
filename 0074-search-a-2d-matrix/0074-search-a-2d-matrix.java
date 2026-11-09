class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int potentialRow = findPotentialRow(matrix, target);
        if(potentialRow!=-1){
            int start =0;
            int end = matrix[0].length-1;
            while(start<=end){
               int mid = start + (end-start)/2;
               if(matrix[potentialRow][mid]==target){
                  return true;
               }
               else{
                 if(matrix[potentialRow][mid]>target){
                    end = mid-1;
                 }
                 else{
                    start = mid+1;
                 }
               }
            }
            return false;
        }
        else{
            return false;
        }
    }
    public int findPotentialRow(int[][] matrix, int target){
        int start = 0;
        int end = matrix.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length-1]){
                return mid;
            }
            else{
                if(target>matrix[mid][0]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}