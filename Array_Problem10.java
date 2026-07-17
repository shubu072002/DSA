public class Array_Problem10 {
    public static int noOfJumps(int[] arr){
        int max_R=arr[0];
        int step =arr[0];
        int jump =1;
        if(arr.length==1){
            return 0;
        }
        else if (arr[0]==0) {
            return -1;
        }
        else{
            for(int i=1;i<arr.length;i++){
                if (i==arr.length-1) {
                    return jump;
                }
                max_R = Math.max(max_R, i+arr[i]);
                step--;
                if (step==0) {
                    jump++;
                    if(i>=max_R){
                        return -1;
                    }
                    step=max_R-i;
                }
            }
            return jump;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        noOfJumps(arr);
        System.out.println("Min no. of jumps to reach end of a array "+noOfJumps(arr));
        
    }
}
