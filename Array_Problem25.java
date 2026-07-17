import java.util.HashMap;
import java.util.Map;

public class Array_Problem25 {
    public static int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int threshold = n / k;
        int countResult = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault((arr[i]),0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet() ){
            if(entry.getValue()>threshold){
                countResult++;
            }
        }

        return countResult;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        System.out.println(countOccurence(arr, k));

    }
}
