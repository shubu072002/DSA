class timeValueStamp{
    String value;
    int timeStamp;
    
    public timeValueStamp(String value, int timeStamp){
        this.value=value;
        this.timeStamp = timeStamp;
    }
}
class TimeMap {
    
    HashMap<String,ArrayList<timeValueStamp>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        ArrayList<timeValueStamp> list=map.get(key);
        list.add(new timeValueStamp(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
       if(!map.containsKey(key)){
        return "";
       } 
       ArrayList<timeValueStamp> list=map.get(key);
       timeValueStamp curr = binarySearch(list, timestamp);
       if(curr==null){
        return "";
       }
       return curr.value;
    }
    public timeValueStamp binarySearch(ArrayList<timeValueStamp> list, int timestamp){
        int start = 0;
        int end = list.size()-1;
        int matchIdx = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            timeValueStamp curr=list.get(mid);
            if(curr.timeStamp==timestamp){
                return curr;
            }
            else if (curr.timeStamp<timestamp){
               matchIdx = mid;
               start= mid +1;
            }
            else{
                end = mid -1;
            }
        }
        if(matchIdx==-1){
            return null;
        }
        return list.get(matchIdx);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */