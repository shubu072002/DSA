import java.util.ArrayList;

public class Array_Problem19 {
    public static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (!list.contains(A[i])) {
                    list.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        return list;
    }



    public static void main(String[] args) {
        int[] A= {1,5,20,40,80};
        int[] B= {6,7,20,80,100};
        int[] C= {3,4,15,20,30,70,80,120};
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;
        System.out.println(commonElements(A,B,C,n1,n2,n3));

    }
}