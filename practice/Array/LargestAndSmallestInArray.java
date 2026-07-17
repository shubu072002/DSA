package practice.Array;

import java.util.*;

public class LargestAndSmallestInArray {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        ArrayList<Integer> List = new ArrayList<>();

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        List.add(min);
        List.add(max);
        return List;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 6};
        ArrayList<Integer> ans = getMinMax(arr);

        System.out.println(ans);
    }
}
