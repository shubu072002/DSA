import java.util.HashMap;

public class Array_Problem28 {
    public static boolean twosum(int[] arr, int remsum, int start, int end){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=start;i<=end;i++){
            if(map.containsKey(remsum-arr[i])){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;

    }

    public static  boolean hasTripletSum(int arr[], int target) {
    int n = arr.length;
    for(int i=0;i<n;i++){
        int remsum = target-arr[i];
        boolean ans = twosum(arr,remsum,i+1,n-1);
        if(ans){
            return true;
        }
    }
    return false;

    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
       int  target = 13;
        System.out.println(hasTripletSum(arr,target));
    }

}
