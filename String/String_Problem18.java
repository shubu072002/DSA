package String;

import java.util.ArrayList;

//Q-Rabin Karp Algo
public class String_Problem18 {
    public boolean isMatch(String pat, String txt, int index){
        for(int i=0;i<pat.length();i++){
            if(txt.charAt(index+i)!=pat.charAt(i)){
                return false;
            }
        }
        return true;
    }
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
       int m = pat.length();
       int n = txt.length();
       int base = 256;
       int mod=101;

       int txthash =0;
       int pathash =0;
       int power =1;


       for(int i=m-1;i>=0;i--){
           int patval = pat.charAt(i) - 'a' +1;
           int txtval = txt.charAt(i) - 'a' +1;

           pathash = (pathash + patval * power)% mod;
           txthash = (txthash + txtval * power)% mod;
           power = (base * power) % mod;
       }
       if(txthash == pathash && isMatch(pat,txt,0)){
           result.add(0);
       }
       int highestpower =1;
       for(int i=1;i<m;i++){
           highestpower = (highestpower*base)% mod;
       }
       for(int i = 1;i<=n-m;i++){
           int leftval = txt.charAt(i-1) - 'a'+1;

           txthash = (txthash - (leftval * highestpower)%mod + mod)% mod;
           txthash = (txthash * base)% mod;

           int newvalue = txt.charAt(i+m-1) -'a'+1;
           txthash = (txthash + newvalue)% mod;

           if(pathash==txthash && isMatch(pat,txt,i)){
               result.add(i);
           }
       }
       return result;
    }

    public static void main(String[] args) {
        String txt = "abcab";
        String pat = "ab";
        String_Problem18 s = new String_Problem18();
        System.out.println(s.search(pat,txt));
    }
}
