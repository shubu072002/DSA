class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i =0;
        int j = n-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int width = j-i;
            int length = Math.min(height[i],height[j]);
            int area = length*width;
            max = Math.max(area,max);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}