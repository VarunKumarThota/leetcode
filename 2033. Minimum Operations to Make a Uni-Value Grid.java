class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> s = new ArrayList<Integer>();
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                s.add(grid[i][j]);
            }
        }
        Collections.sort(s);
        int mid = s.get(s.size() / 2);
        int ans = 0;
        for(int e : s){
            if((Math.abs(e - mid))%x != 0){
                return -1;
            }
            else ans += Math.abs(e-mid)/x;
        }
        return ans;
    }
}
