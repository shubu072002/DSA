import java.util.HashMap;

public class Array_Problem27 {
    public static boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int j=0;j<b.length;j++){
            if(map.containsKey(b[j]) && map.get(b[j])>0){
                map.put(b[j],map.get(b[j])-1);
            }
            else{
                return false;
            }
        }
        return true;

    }



        //bruteforce apparoch
//     int n = a.length;
//     int m = b.length;
//
//     boolean[] visited = new boolean[n];
//
//     for(int i=0;i<m;i++){
//         boolean found =false;
//         for(int j=0;j<n;j++){
//             if(!visited[j] && a[j]==b[i]){
//                 visited[j]=true;
//                 found = true;
//                 break;
//             }
//         }
//         if(!found) return false;
//     }
//     return true;

    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }
}
