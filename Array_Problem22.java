import java.util.ArrayList;

// Q--> Find factorial of a large number
public class Array_Problem22 {
    public static ArrayList<Integer> factorial(int n){
        ArrayList<Integer> result = new ArrayList<>();
        int c=0;
        result.add(0,1);
        int size =1;
        int val=2;

        while(val<=n){
            for(int i=size-1;i>=0;i--){
                int temp=result.get(i)*val+c;
                result.set(i,temp%10);
                c=temp/10;
            }
            while(c!=0){
                result.add(0,c%10);
                c=c/10;
                size++;
            }
            val++;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

    }
}
