package String;

import java.util.HashMap;
import java.util.Map;

public class String_Problem29part2 {
    String secFrequent(String arr[], int N) {
        int firstMax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        String key ="";
        int value=0;
        for(Map.Entry mapElements: map.entrySet()){
            key = (String) mapElements.getKey();
            value=(Integer) mapElements.getValue();
            if(value>firstMax){
                secondmax=firstMax;
                firstMax=value;
            }
            if(value<firstMax && value>secondmax){
                secondmax=value;
            }
        }
        for(Map.Entry mapelements: map.entrySet()){
            key =(String)mapelements.getKey();
            value=(Integer) mapelements.getValue();
            if(value==secondmax)return key;
        }
        return null;

    }
    public static void main(String[] args) {

    }
}
