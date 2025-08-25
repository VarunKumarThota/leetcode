/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// 1. first Approach - looping over and taking element as center of palindrome.
public class Main
{
    public static String longestpalidromic(String s){
        int n = s.length();
        int start = 0;
        int maxlen = 1;
        
        for(int i = 0;i < n; i++){
            for(int j=0;j<=1;j++){
                int down = i;
                int high = i+j;
                while( down > 0 && high < n && s.charAt(down)==s.charAt(high)){
                    int len = high - low + 1;
                    if(len > maxlen){
                        maxlen = len;
                        start = down;
                    }
                    down--;
                    high++;
                }
            }
        }
        return s.subString(start,start+maxlen);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

//2. using tabulation DP

class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];

        dp[0][0] = true;

        for(int j = 1;j <= m;j++){
            if(p.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 1];
        }

        for(int i = 1;i < n + 1;i++){
            for(int j = 1; j < m + 1;j++){
                if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?')
                dp[i][j] = dp[i - 1][j - 1];
                if( p.charAt(j - 1) == '*')
                dp[i][j]  = dp[i - 1][j] || dp[i][j - 1];
            }
        }
        return dp[n][m];
    }
}

// 3. second approach - using memorization.
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLen = 1;
        for(int i = 0;i < n;i++){
            dp[i][i] = true;
        }
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = true;
                if(maxLen == 1){
                maxLen = 2;
                start = i;
                }
            }
        }
        for(int len = 3;len <= n;len++){
            for(int i = 0;i <= n - len;i++){
                int j = i + len - 1;
                if( s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    if(len > maxLen){
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start + maxLen);
    }
}
