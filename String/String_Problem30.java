package String;

public class String_Problem30 {
    static int minimumNumberOfSwaps(String s) {
        int open =0,close=0,unbalanaced=0,swaps=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                open++;
                if(unbalanaced>0){
                    swaps+=unbalanaced;
                    unbalanaced--;
                }
            }
            else{
                close++;
                unbalanaced=close-open;
            }

        }
        return swaps;

    }
    public static void main(String[] args) {

    }
}
