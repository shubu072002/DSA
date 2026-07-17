public class Array_Problem31 {
    public static int smallestSubWithSum(int x, int[] arr){
        int n =arr.length;
        int start =0;
        int end=0;
        int minlength = Integer.MAX_VALUE;
        int length=0;
        int sum =0;
        while(end<n){
            sum+=arr[end];
            if(sum>x){
                length=end-start+1;
                minlength=Math.min(minlength,length);
            }
            while(start<end && sum>x){
                sum-=arr[start];
                start++;
                if(sum>x){
                    length=end-start+1;
                    minlength=Math.min(minlength,length);
                }
            }
            end++;

        }
        return (minlength==Integer.MAX_VALUE?0:minlength);

    }

    public static void main(String[] args) {
        int x = 51;
        int arr[] = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(x,arr));
    }
}
