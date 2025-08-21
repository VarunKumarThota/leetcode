class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxNum = arr[n - 1];
        arr[n - 1] = -1;
        if(n == 1) return arr;
        for( int i = n - 2; i >= 0;i--){
            int temp = arr[i];
            arr[i] = maxNum;
            maxNum = Math.max(maxNum, temp);
        }
        return arr;
    }
}
