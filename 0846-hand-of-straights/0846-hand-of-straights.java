class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        for(int carde: hand){
            if(!map.containsKey(carde)){
                continue;
            }
            while(map.containsKey(carde-1)){
                carde--;
            }
            for(int i=0;i<groupSize;i++){
                int card = carde+i;
                if(!map.containsKey(card)){
                    return false;
                }
                map.put(card,map.get(card)-1);
                if(map.get(card)==0){
                    map.remove(card);
                }
            }
        }
        return true;
    }
}