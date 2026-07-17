//Q- Sort the array containing 0,1,2 without using any sorting  algorithm 
public class Array_problem4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 1, 2};
        int zero=0;
        int one=0;
        int two=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if (arr[i]==1) {
                one ++; 
            }
            else
                two++;
        }
        int index =0;
        for(int i =0;i<zero;i++){
            arr[index++]=0;
        }
        for(int i =0;i<one;i++){
            arr[index++]=1;
        }
        for(int i =0;i<two;i++){
            arr[index++]=2;
        }
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
