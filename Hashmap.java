import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);

//        map.put("China",180);
//        System.out.println(map);
//           if(map.containsKey("Sri Lanka")){
//               System.out.println("Present in the map ");
//           }else {
//               System.out.println("Not present in the map");
//           }
        System.out.println(map.containsKey("India"));
//        System.out.println(map.get("India"));
//        for(Map.Entry<String,Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//        map.remove("India");
        System.out.println(map);
  
       
  }

}
