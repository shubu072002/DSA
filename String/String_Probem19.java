package String;

public class String_Probem19 {
    int getLPSLength(String s) {
        int n =s.length();
        int prefix=0;
        int suffix=1;
        int pos=1;
        int count =0;
        while(prefix<n && suffix<n){
            if(s.charAt(prefix)==s.charAt(suffix)){
                count++;
                prefix++;
                suffix++;
            }
            else {
                count=0;
                prefix=0;
                pos++;
                suffix=pos;

            }
        }
        return count;

    }
}
