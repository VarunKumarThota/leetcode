class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int len = 0;
        int n = s.length();
        for(int i = 0; i < n;i++){
            int left = i;
            int right = i;
            //for odd len
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                if(right - left + 1 > len){
                    len = right - left + 1;
                    ans = s.substring(left,right+1);
                }
                left--;
                right++;
            }

            //for even case
            left = i;
            right = i + 1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                if(right - left + 1 > len){
                    len = right - left + 1;
                    ans = s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        return ans;
    }
}
