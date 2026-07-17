//Q---> Minimum swaps required bring elements less equal K together
public class Array_Probem33 {
    public static int minnoofswaps(int[] arr,int k){
        int n =arr.length;
        int fav=0;
        int nonfav=0;

        //find the size of the window
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                fav++;
            }
        }
        for(int j=0;j<fav;j++){
            if(arr[j]>k){
                nonfav++;
            }
        }
        int l=0;
        int r=fav-1;
        int result=Integer.MAX_VALUE;
        while(r<n){
            result=Math.min(result,nonfav);
            r++;
            if(r<n && arr[r]>k)nonfav++;
            if(l<n && arr[l]>k)nonfav--;
            l++;
        }
        return (result==Integer.MAX_VALUE?0:result);
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int k = 3;
        System.out.println(minnoofswaps(arr,k));

    }
}
