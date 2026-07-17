public class anagram2 {
    public static Boolean isanagram(String A, String B){
        if(A.length()!=B.length()){
            return false;
        }
        A=A.toLowerCase();
        B=B.toLowerCase();
        int l =A.length();
        int[] freq = new int[26];
        int i=0;
        int j=0;
        while(i<A.length() && j<A.length()){
            char charA = A.charAt(i);
            int freqidxA = charA -97;
            freq[freqidxA]+=1;

            char charB = B.charAt(j);
            int freqidxB = charB -97;
            freq[freqidxB]+=1;

            i++;
            j++;
        }
        for(int k=0;k<26;k++){
            if(freq[k]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
