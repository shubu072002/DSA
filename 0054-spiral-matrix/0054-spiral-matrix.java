class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0;
        int er = n-1;
        int sc = 0;
        int ec = m-1;

        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                list.add(matrix[sr][i]);
            }
            sr++;
            for(int i=sr;i<=er;i++){
                list.add(matrix[i][ec]);
            }
            ec--;
            if(sr<=er){
            for(int i=ec;i>=sc;i--){
                list.add(matrix[er][i]);
            }
             er--;
            }
           
            if(sc<=ec){
            for(int i=er;i>=sr;i--){
               list.add(matrix[i][sc]);
            }
             sc++;
            }
           
        }
        return list;
    }
}