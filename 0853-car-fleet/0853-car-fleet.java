class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] car = new double[position.length][2];
        for(int i=0;i<position.length;i++){
            double time  = (double)(target-position[i])/speed[i];
            car[i][0]= position[i];
            car[i][1]=time;
        }
        Arrays.sort(car,(a,b)->Double.compare(a[0],b[0]));
        double carfleet = 0;
        double maxtime = 0;
        for(int i=position.length-1;i>=0;i--){
            double time = car[i][1];
            if(time>maxtime){
                carfleet++;
                maxtime=time;
            }    
        }
        return (int)carfleet;
    }
}