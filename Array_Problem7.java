//Q-Write a program to cyclically rotate an array by one.

public class Array_Problem7 {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,7,9};
        int x = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
