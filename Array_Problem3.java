//Q - find the kth max and min element in array
public class Array_Problem3 {
    public static void main(String[] args) {
        int[] arr = {10, 32, 53, 20, 11, 56, 89, 34, 19};
        int k =2;
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println("The 2nd minimum no. in the array is " + arr[i]);
                break;
            }
        }
        System.out.println("..........................");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
