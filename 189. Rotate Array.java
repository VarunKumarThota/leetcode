class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] tempAns = new int[n];
        for(int i = 0;i < n;i++){
            int in = (i + k) % n;
            tempAns[in] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = tempAns[i];
        }

        return;
    }
}
