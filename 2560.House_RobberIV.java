// by using binary search between min and max capabilities

class Solution {
    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            l = Math.min(l,nums[i]);
            r = Math.max(r,nums[i]);
        }
        int m = (l+r)/2;
        int ans = 0;
        while(l <= r){
            m = (l+r)/2;
            int i = 0;
            int count = 0;
            while(i < nums.length){
                if(nums[i] <= m){
                    count++;
                    i += 2;
                }
                else i++;
            }
            if(count >= k){
                ans = m;
                r = m - 1;
            }
            else l = m + 1;
        }
        return ans;
    }
}
