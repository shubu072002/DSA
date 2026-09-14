class Solution {
    int n;
    public int countOverLapping(int[][] img1, int[][] img2, int row_offset, int col_offset){
        int count = 0;
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1[0].length;j++){
                int img2_i = i+row_offset;
                int img2_j = j+col_offset;

                if(img2_i<0 || img2_i>=n || img2_j<0 || img2_j>=n){
                    continue;
                }
                if(img1[i][j]==1 && img2[img2_i][img2_j]==1){
                   count++;
                }
            }
        }
          return count;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
       n = img1.length;
      int max = Integer.MIN_VALUE;  
      for(int row_offset=-n+1;row_offset<n;row_offset++){
        for(int col_offset=-n+1;col_offset<n;col_offset++){
            int count = countOverLapping(img1,img2,row_offset,col_offset);
            max = Math.max(max,count);
        }
      }
      return max;
    }
}