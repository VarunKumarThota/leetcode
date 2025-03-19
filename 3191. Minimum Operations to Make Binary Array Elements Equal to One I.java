class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        int i = 0;
        while(i < nums.length - 2){
            if(nums[i] == 0){
                nums[i] = 1;
                nums[i+1] = nums[i+1] ^ 1;
                nums[i+2] = nums[i+2] ^ 1;
                ans++;
                if( nums[i+1] == 1 && nums[i+2] == 1) i+=3;
                else if(nums[i+1] == 1 && nums[i+2] != 1) i+=2;
                else i++;
            }
            else i++;
        }
        for(int j = 0;j < nums.length;j++){
            if( nums[j] == 0) return -1;
        }
        return ans;
    }
}
