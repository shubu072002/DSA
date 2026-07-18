package Blind150.ArrayAndHashing;

import java.util.Arrays;

public class CountTheNumberOfSepcialCharacterII {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int[] uppercasemap = new int[26];
        Arrays.fill(uppercasemap, -1);
        int[] lowercasemap = new int[26];
        Arrays.fill(lowercasemap, -1);
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowercasemap[ch - 'a'] = i;
            } else {
                if (uppercasemap[ch - 'A'] == -1) {
                    uppercasemap[ch - 'A'] = i;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (lowercasemap[i] != -1 && uppercasemap[i] != -1 && lowercasemap[i] < uppercasemap[i]) {
                count++;
            }
        }
        return count;
    }
}
