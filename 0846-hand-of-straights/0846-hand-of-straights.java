class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        int n = hand.length;
        if(n%groupSize!=0){
           return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        for(int carde: hand){
            if(!map.containsKey(carde)){
                continue;
            }
            int currcard = carde;
            while(map.containsKey(currcard-1)){
               currcard=currcard-1;
            }
            for(int i=0;i<groupSize;i++){
                int card = currcard+i;
                if(!map.containsKey(card)){
                    return false;
                }
                map.put(card,map.get(card)-1);
                if(map.get(card)==0){
                    map.remove(card);
                }
            }
            if(map.isEmpty()){
                    return true;
                }
        }
        return false;
    }
}