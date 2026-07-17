import java.util.Arrays;

//Q-->Median of 2 sorted arrays of equal size
public class Arrays_Problem35 {
    public double medianOf2(int a[], int b[]){
        if(a.length>b.length){
            return medianOf2(b,a);
        }
        //now a is always smaller than b
        int n1=a.length;
        int n2=b.length;
        int start =0;
        int end =n1;
        int N=n1+n2;
        while(start<=end){
            int cut1 = start+(end-start)/2;
            int cut2=N/2-cut1;

            int l1=(cut1==0)?Integer.MIN_VALUE:a[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:b[cut2-1];
            int r1=(cut1==n1)?Integer.MAX_VALUE:a[cut1];
            int r2=(cut2==n1)?Integer.MAX_VALUE:b[cut2];

            if(l1<=r2 && l2<=r1){
                if(N%2!=0){
                    return (double) Math.min(r1,r2);
                }
                else{
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            } else if (l1>r2) {
                end =cut1-1;
            }
            else{
                start=cut1+1;
            }
        }
        return 0.0;

    }

    public static void main(String[] args) {



    }
}
