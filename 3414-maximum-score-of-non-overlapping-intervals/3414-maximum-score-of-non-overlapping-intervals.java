class Result{
    long score;
    List<Integer> indices;

    Result(long score, List<Integer> indices){
        this.score = score;
        this.indices=indices;
    }
}
class Solution {
    int n ;
    int[][] interval;
    int[] nextIdx;
    Result[][] dp ;
    public int findnext(int i){
        int end = interval[i][1];
        int left = i+1;
        int right = n-1;  
        while(left<=right){
           int mid = left + (right-left)/2;
           if(interval[mid][0]>end){
             right = mid-1;
           }
           else{
            left = mid+1;
           }
        }
        return left;
    }
    public boolean lexicographicallySmaller(List<Integer> a, List<Integer> b){
    int len = Math.min(a.size(),b.size());
    for(int i=0;i<len;i++){
        if(!a.get(i).equals(b.get(i))){
            return a.get(i)<b.get(i);
        }
    }
    return a.size()<b.size();
}
    public Result solve(int i, int k){
        if(i==n || k==0){
            return new Result(0,new ArrayList<>());
        }
        if(dp[i][k]!=null){
            return dp[i][k];
        }
        //skip
        Result skip = solve(i+1,k);
        //take
        int next = nextIdx[i];
        Result nextResult = solve(next,k-1);

        List<Integer> takeindices = new ArrayList<>(nextResult.indices);

        takeindices.add(interval[i][3]);
        Collections.sort(takeindices);
        Result take = new Result(interval[i][2]+nextResult.score, takeindices);
        Result result;
        if(take.score>skip.score){
            result = take;
        }
        else if(skip.score>take.score){
            result=skip;
        }
        else{
            if(lexicographicallySmaller(take.indices,skip.indices)){
                result = take;
            }
            else{
                result = skip;
            }
        }
        dp[i][k] = result;
        return result;
    }
    public int[] maximumWeight(List<List<Integer>> intervals) {
        n=intervals.size();
        interval = new int[n][4];
        dp = new Result[n+2][4+2];

        for(int i=0;i<n;i++){
            interval[i][0]=intervals.get(i).get(0);
            interval[i][1]=intervals.get(i).get(1);
            interval[i][2]=intervals.get(i).get(2);
            interval[i][3]=i;
        }
        Arrays.sort(interval,(a,b)->Integer.compare(a[0],b[0]));
        nextIdx = new int[n];
        for(int i=0;i<n;i++){
            nextIdx[i]=findnext(i);
        }
        Result result = solve(0,4);

        List<Integer> list=result.indices;

        return list.stream()
                    .mapToInt(x->x.intValue())
                    .toArray();

    }
}