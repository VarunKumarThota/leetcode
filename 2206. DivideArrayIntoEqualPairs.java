// using array is better and cost effective.

class Solution {
    public boolean divideArray(int[] nums) {
        int[] n = new int[501];
        for(int i : nums){
            n[i]++;
        }
        for(int i : n){
            if(i%2 != 0) return false;
        }
        return true;
    }
}

//using map

class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i: nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int c : m.values()){
            if(c%2 != 0) return false;
        }
        return true;
    }
}
