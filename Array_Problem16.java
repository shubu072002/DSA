//Q--> Count inversion
public class Array_Problem16 {
    public static  int conquer(int[] arr,int si,int mid,int ei){
       int[] merged=new int[ei-si+1];
       int idx1 = si;
       int idx2 =  mid+1;
       int x=0;
       int invCount = 0;

       while (idx1<=mid && idx2<=ei){
           if (arr[idx1]<=arr[idx2]){
               merged[x++]=arr[idx1++];
           }
           else {
               merged[x++]=arr[idx2++];
               invCount += mid-idx1+1;
           }
       }
       while(idx1<=mid){
           merged[x++]=arr[idx1++];
       }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j=si;i< merged.length;i++,j++){
             arr[j] = merged[i];
        }
        return invCount;
    }
    public static int Divide(int[] arr,int si,int ei) {
        if (si >= ei) {
            return 0;
        }
        int invCount =0;
        int mid = si + (ei - si) / 2;
         invCount += Divide(arr, si, mid);//left side
         invCount +=Divide(arr, mid + 1, ei);//Right side
         invCount += conquer(arr, si, mid, ei);
        return invCount;
    }
    public static void main(String[] args) {
        int[] arr ={6,3,9,5,2,8};
        int n = arr.length;
        int ans = Divide(arr,0,n-1);
        for(int element : arr){
            System.out.print(element+ " ");
        }
        System.out.println("\nCount inversion : "+ ans);

    }
}

