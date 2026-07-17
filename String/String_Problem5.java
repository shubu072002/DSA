package String;

//Q5--> Write a Code to check whether one string is a rotation of another
public class String_Problem5 {
    public static boolean isrotation(String s1 , String s2){
        if(s1.length()!=s2.length()){
            System.out.println("no one string is not a rotated verison of another");
            return false;
        }
        String Rotated = s1 + s1;
        int j=0;
        int count =0;
        for(int i=0;i<Rotated.length();i++){
            if (j==s2.length()){
                break;
            }
            if(Rotated.charAt(i)==s2.charAt(j)){
                j++;
                count++;
            }
        }
        if(count==s2.length()){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(isrotation(s1,s2));

    }
}
