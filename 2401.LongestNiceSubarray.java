//using or and xor removing the l if not 0 using xor and adding it if 0 using or
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0;
        int or = 0;
        int ans = 0;
        for(int r = 0;r < nums.length;r++){
            while((or & nums[r]) != 0){
                or ^= nums[l];
                l++;
            }
            or |= nums[r];
            ans = Math.max(ans,r - l + 1);
        }
        return ans;
    }
}
