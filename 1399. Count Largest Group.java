class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int ans = 0;
        for(int i = 1;i <= n;i++){
            int sum = 0;
            int d = i;
            while(d >= 1){
                sum += d%10;
                d = d/10;
            }
            count[sum]++;
        }
        int index = 0;
        for(int i = 1;i < 37;i++){
            
            if(count[i] > index){
                index = count[i];
                ans = 1;
            }
            else if(count[i] == index){
                ans++;
            }
        }
        return ans;
    }
}
