class Solution {
    public int findMax(int[][] matrix, int n , int m , int mid){
        int max = -1;
        int index = -1;
        for(int row=0;row<n;row++){
            if(matrix[row][mid]>max){
                max = matrix[row][mid];
                index = row;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start =0;
        int end = m-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int row = findMax(matrix,n,m,mid);
            int left = mid-1>=0?matrix[row][mid-1]:-1;
            int right = mid+1<m?matrix[row][mid+1]:-1;
            
            if(matrix[row][mid]>left && matrix[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(matrix[row][mid]<left){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return new int[]{};
    }
}