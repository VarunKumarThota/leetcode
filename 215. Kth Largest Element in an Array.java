// 1. first method using minHeap approach to storeuntill k elements.

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i = 0;i < nums.length;i++){
            p.add(nums[i]);

            if(p.size() > k) p.poll();
        }
        return p.peek();
    }
}

// 2. second approach is using array of size maxVal - minVal + 1 and then counting from last untill 0 and returning i + minVal

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int minVal = nums[0];
        int maxVal = nums[0];
        for(int i = 0;i < n;i++){
            minVal = Math.min(minVal,nums[i]);
            maxVal = Math.max(maxVal, nums[i]);
        }
        int[] store = new int[maxVal - minVal + 1];
        for(int i = 0;i < n;i++){
            store[nums[i] - minVal]++;
        }
        for(int i = store.length - 1;i >= 0;i--){
            k -= store[i];
            if(k <= 0) return i+minVal;
        }
        return -1;
    }
}

