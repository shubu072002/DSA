class Solution {
    public int findDayOfYear(String str, int[] sumOfDays){
        int month = Integer.parseInt(str.substring(0,2));
        int days = Integer.parseInt(str.substring(3,5));

        return sumOfDays[month-1]+days;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] sumOfDays = new int[13];
        sumOfDays[1]=31;
        for(int i=2;i<=12;i++){
            sumOfDays[i] = sumOfDays[i-1]+noOfDays[i-1];
        }   
        int arrivealice =  findDayOfYear(arriveAlice, sumOfDays);
        int leavealice =  findDayOfYear(leaveAlice, sumOfDays);
        int arrivebob  =  findDayOfYear(arriveBob, sumOfDays);
        int leavebob =   findDayOfYear(leaveBob, sumOfDays);

        int days = Math.min(leavealice, leavebob) - Math.max(arrivealice, arrivebob)+1;
        return days<0?0:days;
    }
}