package practice.TwoPointer;

import java.util.HashMap;

public class PairWithGivenSum {
    int countPairs(int arr[], int target) {
        int result = 0;
        int n = arr.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++){
            int secondval = target-arr[i];
            result+= freqMap.getOrDefault(secondval, 0);
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i],0)+1);
        }
       return result;
    }
}
