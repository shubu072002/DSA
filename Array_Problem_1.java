// Reverse an array
public class Array_Problem_1 {
    public static void main(String[] args) {
        int[] arr  = {10,20,30,40,50,60};
        int l =arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;

        for(int i=0;i<n;i++){
            temp = arr[i];
            arr[i]= arr[l-1-i];
            arr[l-1-i] = temp; 
        }
        for(int element: arr){
            System.out.print(element + (" "));
        }
    }
}
