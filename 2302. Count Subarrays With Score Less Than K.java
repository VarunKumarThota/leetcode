class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left = 0;
        long sum = 0;
        long count = 0;
        for(int right = 0;right < nums.length;right++){
            sum += (long)nums[right];
            while( sum * (right - left + 1) >= k){
                sum -= (long)nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
