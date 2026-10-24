class Solution {
    public int orangesRotting(int[][] grid) {
       int freshCount =0;
       int time =0;
       Queue<int[]> queue = new LinkedList<>();
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                freshCount++;
            }
            else if(grid[i][j]==2){
                queue.offer(new int[]{i,j});
            }
        }
       }
       if(freshCount==0){
        return 0;
       }
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] rotten = queue.poll();
                int r= rotten[0];
                int c =rotten[1];
                int[][] neighbours = {{r-1,c},{r,c+1},{r+1,c},{r,c-1}};
                for(int[] neighbour: neighbours){
                    int nr = neighbour[0];
                    int nc = neighbour[1];

                    if(nr<0|| nc<0 || nr>=grid.length || nc>=grid[0].length||grid[nr][nc] == 0|| grid[nr][nc]==2){
                        continue;
                    }
                    grid[nr][nc]=2;
                    queue.offer(new int[]{nr,nc});
                }
            }
            time++;
            freshCount-= queue.size();
            if(freshCount==0){
                return time;
            }
        } 
       return freshCount!=0?-1:time;
    }
}