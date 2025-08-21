class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if ( n == 1) return 0;
        int lSum = 0;
        int rSum = 0;
        for( int i : nums) rSum += i;
        for(int i = 0; i < n;i++){
            if(i > 0) lSum += nums[i - 1];
            rSum -= nums[i];
            if(lSum == rSum) return i;
        }
        return -1;
    }
}
