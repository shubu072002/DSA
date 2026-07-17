package Blind75.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            int length = s.length();
            sb.append(length).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int sepIdx = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i,sepIdx));
            int startIdx = sepIdx+1;
            String s = str.substring(startIdx, startIdx+length );
            list.add(s);
            i=startIdx+length;

        }

        return list;
    }

    public static void main(String[] args) {
        Test test = new Test();
        List<String> input = new ArrayList<>();
        input.add("Hello");
        input.add("World");
        String ans =test.encode(input);
        System.out.println(ans);

        List<String> ans2 = test.decode(ans);
        System.out.println(ans2.toString());
    }
}
