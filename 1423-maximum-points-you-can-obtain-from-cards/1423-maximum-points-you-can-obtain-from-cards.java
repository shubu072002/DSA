class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        int max = Integer.MIN_VALUE;
        for(int ele: cardPoints){
            totalSum+=ele;
        }
        int currWindowSum =0;
        for(int i=0;i<n-k;i++){
           currWindowSum+=cardPoints[i];
        }
        max=Math.max(max,totalSum-currWindowSum);
        for(int i=1;i<=n-(n-k);i++){
            currWindowSum-=cardPoints[i-1];
            currWindowSum+=cardPoints[i+(n-k)-1];
            max=Math.max(max,totalSum-currWindowSum);
        }
        return max;
    }
}