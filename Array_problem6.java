// Q -Find the Union and Intersection of the two sorted arrays.

public class Array_problem6 {
    public static  void union(int[] a, int[] b, int n, int m ){
        int i=0, j=0;
        while (i<n && j<m) {
            if(a[i]<b[j]){
                // System.out.print(a[i++]+ " ");
                i++;
            }
            else if (a[i]>b[j]) {
                // System.out.print(b[j++]+ " ");
                j++;
            }
            else{
                System.out.print(b[j++]+ " ");
                i++;
            }
        }
     
    //     while (i<n) {
    //         System.out.print(a[i++]+ " ");
    //     }
    //     while (j<m) {
    //         System.out.println(b[j++]+ " ");
    //     }
    }
    public static void main(String[] args) {
    int[]a={1,3,4,5,7};
    int[]b={2,3,5,6};
    int n = a.length;
    int m = b.length;
    union(a,b,n,m);  
    }
}
