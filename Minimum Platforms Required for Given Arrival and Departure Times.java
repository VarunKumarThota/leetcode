// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int n = arr.length;
        
        int j=0;
        int ans = 0;
        int count = 0;
        for(int i = 0; i < n;i++){
           count++;
           while( j < n && arr[i] > dep[j]){
               count--;
               j++;
           }
           ans = Math.max(ans,count);
        }
        return ans;
    }
}
