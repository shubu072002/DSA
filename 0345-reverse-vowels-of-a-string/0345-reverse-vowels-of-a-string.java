class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        char[] arr =s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(set.contains(arr[i]) && set.contains(arr[j])){
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else{
                if(!set.contains(arr[i])){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return new String(arr);
    }
}