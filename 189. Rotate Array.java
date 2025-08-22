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

// 2. second approach

class Solution {
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return;
    }
}
