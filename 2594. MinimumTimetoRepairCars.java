class Solution {
    public long repairCars(int[] ranks, int cars) {
        long mint = 1;
        long maxt = (long) ranks[0] * cars * cars;
        long ans = maxt;
        long mid = (maxt + mint) / 2;
        while(mint <= maxt){
            mid = (maxt + mint) / 2;
            int c = 0;
            for(int i = 0;i < ranks.length;i++){
                c += Math.sqrt(mid/ranks[i]);
            }
            if(c >= cars){
                ans = mid;
                maxt = mid - 1;
            }
            else mint = mid + 1;
        }
        return ans;
    }
}
