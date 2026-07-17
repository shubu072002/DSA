package Blind75.TwoPinters;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    int n = height.length;
    int start = 0;
    int end = n-1;
    int maxArea = Integer.MIN_VALUE;
    while(start<end){
        int area = (end-start) * Math.min(height[end], height[start]);
        maxArea=Math.max(maxArea, area);
        if(height[start]<=height[end]){
            start++;
        }
        else {
            end--;
        }
    }
    return maxArea;
    }
}
