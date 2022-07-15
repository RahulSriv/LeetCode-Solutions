class Solution {
    public int findArea(int i, int j, int[][] grid){
        int m=grid.length, n=grid[0].length;
        if(i<0 || i>m-1 || j<0 || j>n-1 || grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        return 1+findArea(i-1,j,grid)+findArea(i+1,j,grid)+findArea(i,j-1,grid)+findArea(i,j+1,grid);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int ar=0, max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ar=findArea(i,j,grid);
                max=Math.max(max,ar);
            }
        }
        return max;
    }
}