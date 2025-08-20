// 1. first solution using curMin and CurMax as pointers and updating the maxProduct.

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int curMin = nums[0];
        int curMax = nums[0];
        int maxProd = nums[0];
        for(int i = 1;i < n; i++){
            int tempMin = curMin;
            curMin = Math.min(curMin*nums[i],Math.min(curMax*nums[i],nums[i]));
            curMax = Math.max(tempMin*nums[i],Math.max(curMax*nums[i],nums[i]));
            maxProd = Math.max(maxProd, curMax);
        }
        return maxProd;
    }
}


// 2. second solution is to get Products from both left to right and right to left in same loop and get max of both products and use 1 when we get 0 as it continues.

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int lTR = 1;
        int rTL = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            lTR *= nums[i];
            rTL *= nums[n - i - 1];
            ans = Math.max(ans, Math.max(lTR,rTL));
            if(lTR == 0) lTR = 1;
            if(rTL == 0) rTL = 1;
        }
        return ans;
    }
}
