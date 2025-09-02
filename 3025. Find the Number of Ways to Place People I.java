// 1. using sorting on x - co-ordinate and then looping over for the count.
class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int totalPairs = 0;
        Arrays.sort(points,(a,b) -> {
            if(a[0] == b[0]) return Integer.compare(b[1],a[1]);
            return Integer.compare(a[0],b[0]);
        });

        for(int i = 0;i < n - 1;i++){
            int y1 = points[i][1];
            int middle = Integer.MIN_VALUE;
            for(int j = i + 1;j < n;j++){
                int y2 = points[j][1];
                if(y2 <= y1){
                    if(middle <= y1 && middle >= y2) continue;
                    totalPairs++;
                    middle = y2;
                }
            }
        }
        return totalPairs;
    }
}


// 2. Without Sorting and using 2 loops
class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int totalPairs = 0;
        for(int i = 0;i < n;i++){
            
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = 0;j < n;j++){
                
                if( i == j) continue;
                int x2 = points[j][0];
                int y2 = points[j][1];

                if(!(x1 >= x2 && y1 <= y2)) continue;

                boolean flag = true;

                for(int k = 0;k < n;k++){
                    if( k == i || k == j) continue;

                    int x = points[k][0];
                    int y = points[k][1];

                    if(x1 >= x && x2 <= x && y1 <= y && y2 >= y) flag = false;
                }
                if(flag) totalPairs++;
            }
        }
        return totalPairs;
    }
}
