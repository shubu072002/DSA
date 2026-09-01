class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
       int[] max = new int[target.length];
       for(int[] triplet: triplets){
        if(triplet[0]<=target[0] && triplet[1]<=target[1] && triplet[2]<=target[2]){
            max[0] = Math.max(triplet[0],max[0]);
            max[1]=Math.max(triplet[1],max[1]);
            max[2]=Math.max(triplet[2],max[2]);
        }
       }
       return max[0]==target[0]&&max[1]==target[1]&&max[2]==target[2];
    }
}