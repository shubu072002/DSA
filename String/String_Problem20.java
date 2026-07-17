package String;

public class String_Problem20 {
    String printSequence(String S) {
      String[] str  = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666"
                          ,"7","77","777","7777","8","88","888","9","99","999","9999"};
      String ans = "";
      for(int i=0;i< S.length();i++){
          if(S.charAt(i)==' '){
            ans+=0;
          }
          else {
              ans+=str[S.charAt(i)-'A'];
          }
      }
      return ans;

    }
    public static void main(String[] args) {
        String_Problem20 ps = new String_Problem20();
         String  S = "GFG";
        System.out.println(ps.printSequence(S));
    }
}
