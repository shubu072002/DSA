class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = Integer.MIN_VALUE;
        for(int pile: piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }
        while(minSpeed<maxSpeed){
            int mid = minSpeed + (maxSpeed-minSpeed)/2;
            if(isKokoEatBanana(piles,h,mid)){
                maxSpeed = mid;
            }
            else{
                minSpeed = mid+1;
            }
        }
        return minSpeed;
    }
    public boolean isKokoEatBanana(int[] piles, int h, int speed){
        int hour = 0;
        for(int pile: piles){
            hour+=(int)Math.ceil((double)pile/speed);
        }
        if(hour<=h){
            return true;
        }
        return false;
    }
}