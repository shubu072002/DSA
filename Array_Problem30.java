import java.util.*;
public class Array_Problem30 {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n = arr.size();
        if(arr.size()==0 || arr.size()==1){
            return 0;
        }
        Collections.sort(arr);
        int result = Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int min = arr.get(i);
            int max = arr.get(i+m-1);

            result = Math.min(result,max-min);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(9);
        arr.add(56);
        arr.add(7);
        arr.add(9);
        arr.add(12);
        int m = 5;
        System.out.println(findMinDiff(arr,m));

    }
}
