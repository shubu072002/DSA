package String;
//Q--> Converting Roman Numerals to Decimal
public class String_Problem26 {
    public int romanToDecimal(String s) {
       int result=0;
       int prev = 0;
       for(int i=s.length()-1;i>=0;i--){
           int current = valueof(s.charAt(i));

           if(current<prev){
               result-=current;
           }
           else {
               result+=current;
           }
           prev=current;
       }
       return result;

    }
    public int valueof(char c ){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    public static void main(String[] args) {

    }
}
