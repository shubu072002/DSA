package String;

import java.util.ArrayList;
import java.util.List;

public class String_Probem10 {
     List<String> ans = new ArrayList<>();
    public  List<String> subsets(String str) {

        subsethelper(str,0,new StringBuilder());
        return ans;
    }
    public  void subsethelper(String str,int index,StringBuilder current){
        //base case
        if(index==str.length()){
            ans.add(current.toString());
            return;
        }
        //include
        current.append(str.charAt(index));
        subsethelper(str,index+1,current);
        current.deleteCharAt(current.length()-1);

        //exclude
        subsethelper(str,index+1,current);
    }

    public static void main(String[] args) {
        String str = "abc";
        String_Probem10 sol = new String_Probem10();
        List<String> result = sol.subsets(str);
        System.out.println(result);
    }
}
