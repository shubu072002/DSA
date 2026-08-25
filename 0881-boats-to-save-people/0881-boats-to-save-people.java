class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int start=0;
        int end = n-1;
        int boat =0;
        while(start<=end){
            if(people[start]+people[end]<=limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            boat++;
        }
        return boat;
    }
}