package String;

import java.util.HashSet;

public class String_Problem29 {
    String firstRepeadted(String text){
        HashSet<String> set = new HashSet<>();
        String[] word = text.split(" ");
        for(int i=0;i<word.length;i++){
            if(set.contains(word[i])){
                return word[i];
            }
            else{
                set.add(word[i]);
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        String_Problem29 repeat = new String_Problem29();
        String text =" Shubham had been saying that he had been coding";
        System.out.println(repeat.firstRepeadted(text));

    }
}
