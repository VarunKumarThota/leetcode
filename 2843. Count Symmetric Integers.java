class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low;i < high+1;i++){
            String s = Integer.toString(i);
            int n = s.length();
            if(n%2 != 0) continue;
            int mid = n/2;
            int a = 0,b = 0;
            for(int j = 0;j < mid; j++){
                a += s.charAt(j) - '0';
                b += s.charAt(j+mid) - '0';
            }
            if(a == b) ans++;
        }
        return ans;
    }
}
