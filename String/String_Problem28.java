package String;


//Q--> Number of flips to make binary string alternate
public class String_Problem28 {
        public int minFlips(String s) {
            int c1 =0;
            int c2 =0;
            int min =0;
            for(int i=0;i<s.length();i++){
                if(i%2==0 && s.charAt(i)=='1')c1++;
                if(i%2!=0 && s.charAt(i)=='0')c1++;
                if(i%2==0 && s.charAt(i)=='0')c2++;
                if(i%2!=0 && s.charAt(i)=='1')c2++;

            }
             min = Math.min(c1,c2);
            return min;
        }
    public static void main(String[] args) {

    }
}
