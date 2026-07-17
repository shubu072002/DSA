package practice.String;

public class NonRepeatingChar {
    public char nonRepeatingChar(String s) {
       int l = s.length();
       int[] freq =  new int[26];
       for(int i=0;i<l;i++){
           freq[s.charAt(i) - 'a']++;
       }
       for(int i=0;i<s.length();i++){
           if(freq[s.charAt(i) - 'a'] == 1){
               return s.charAt(i);
           }
       }
       return '$';
    }
}
