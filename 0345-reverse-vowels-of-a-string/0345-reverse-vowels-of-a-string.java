class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr =s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(vowels.indexOf(arr[i])!=-1 && vowels.indexOf(arr[j])!=-1){
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else{
                if(vowels.indexOf(arr[i])==-1){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return String.valueOf(arr);
    }
}