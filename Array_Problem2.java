// Find the maximum /min elements in java 
public class Array_Problem2 {
    public static int findsmallestElement(int[] array){
      int smallestElement = array[0];
      for(int i =0;i<array.length;i++){
        if(array[i]< smallestElement){
            smallestElement = array[i];
        }
      }
      return smallestElement;
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 56, 78, 89,1,};
        int smallestvalue=findsmallestElement(arr);
        System.out.println("The smallest value is "+ smallestvalue);
        
    }
}
