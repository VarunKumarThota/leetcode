class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int esum = n * (n + 1)/2;
        int csum = 0;
        for( int i: nums) csum = i + csum;
        return (esum - csum); 
    }
}
