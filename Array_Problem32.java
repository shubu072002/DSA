//Q--> Three way partitioning of an array around a given value
public class Array_Problem32 {
    public static void threeWayPartition(int arr[], int a, int b){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int i=0;
        while(i<=r){
            if(arr[i]<a){
                swap(arr,l,i);
                l++;
                i++;
            } else if (arr[i]>b) {
                swap(arr,r,i);
                r--;
            }
            else{
                i++;
            }

        }
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
    public static void swap(int[] arr, int start, int end ){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int []arr={5,7,1,4,6,3};
        int a=2;
        int b=4;
        threeWayPartition(arr,a,b);


    }
}
