public class Array_Problem20 {
    public static void rotateRight(int[] arr,int i, int j){
        int temp = arr[j];
        for(int k=j;k>i;k--){
            arr[k]=arr[k-1];
        }
        arr[i]=temp;
    }
    public static void rearrange(int[] arr){
        int n =arr.length;

        for(int i=0;i<n;i++){
            if(i % 2==0 && arr[i]<0 ){
                int j =i+1;
                while(j<n && arr[j]<0){
                    j++;
                }
                if(j==n){
                    break;
                }
                rotateRight(arr,i,j);

            } else if (i % 2==1 && arr[i]>=0) {
                int j =i+1;
                while(j<n && arr[j]>=0){
                    j++;
                }
                if(j==n){
                    break;
                }
                rotateRight(arr,i,j);
            }
        }
    }
    public static void main(String[] args) {
        int  arr[] = {1, 2, 3, -4, -1, 4};
        rearrange(arr);
        for(int element: arr){
            System.out.print(element+" ");
        }

    }
}
