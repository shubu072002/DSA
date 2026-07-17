package String;

import java.util.ArrayList;

public class String_Problem32 {
    int n;
    ArrayList<String> result = new ArrayList<>();
    boolean isValid(String str) {
        if (str.charAt(0) == '0')
            return false;
        int val = Integer.parseInt(str);
        return val <= 255;
    }
    public void solve(String s, int idx, int part, String curr) {
        if (idx == n && part == 4) {
            result.add(curr.substring(0, curr.length() - 1));
            return;
        }
        if (part >= 4) return;

        if (idx + 1 <= n) {
            solve(s, idx + 1, part + 1, curr + s.substring(idx, idx + 1) + ".");
        }
        if (idx + 2 <= n) {
            String two = s.substring(idx, idx + 2);
            if (isValid(two)) {
                solve(s, idx + 2, part + 1, curr + two + ".");
            }
        }
        if (idx + 3 <= n) {
            String three = s.substring(idx, idx + 3);
            if (isValid(three)) {
                solve(s, idx + 3, part + 1, curr + three + ".");
            }
        }
    }
    public ArrayList<String> generateIp(String s) {
        n =s.length();
        if(n>12)return result;
        solve(s,0,0,"");
        return result;
    }
    public static void main(String[] args) {
        String_Problem32 obj = new String_Problem32();
        System.out.println(obj.generateIp("25525511135"));

    }
}
