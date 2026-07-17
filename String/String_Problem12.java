package String;

public class String_Problem12 {
    public static int maxSubStr(String str){
        int n = str.length();
        int balance=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'){
              balance+=1;
            }else {
                balance -= 1;
            }
            if(balance==0) {
                count++;
            }
        }
        if(balance==0){
            return count;
        }
        return -1;


    }
    public static void main(String[] args) {

        String str = "0100110101";
        System.out.println(maxSubStr(str));
    }
}
