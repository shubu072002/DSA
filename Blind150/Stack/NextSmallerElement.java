package Blind75.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static int[] nextSmallerElement(int[] arr, int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--) {
            int curr = arr[i];
            while(stack.peek()>=curr){
                stack.pop();
            }
            //ans is stack ka top
            res[i]=stack.peek();
            stack.push(curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};
        int n = arr.length;
        int[] res = nextSmallerElement(arr,n);
        System.out.println(Arrays.toString(res));
    }
}
