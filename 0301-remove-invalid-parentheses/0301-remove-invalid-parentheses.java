class Solution {
    int n;
    int maxLength;
    Set<String> set = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        n = s.length();
        maxLength = 0;
        helper(0, new StringBuilder(), s, 0);
        return new ArrayList<>(set);
    }

    public void helper(int idx, StringBuilder sb, String s, int count) {
        if (count < 0) {
            return;
        }
        if (idx == n) {

            if (count != 0)
                return;

            if (sb.length() > maxLength) {
                maxLength = sb.length();
                set.clear();
            }

            if (sb.length() == maxLength) {
                set.add(sb.toString());
            }

            return;
        }

        char ch = s.charAt(idx);
        if (ch != '(' && ch != ')') {
            sb.append(ch);
            helper(idx + 1, sb, s, count);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        sb.append(ch);
        helper(idx + 1, sb, s, count + (ch == '(' ? 1 : -1));
        sb.deleteCharAt(sb.length() - 1);

        helper(idx + 1, sb, s, count);

    }
}