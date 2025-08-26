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


