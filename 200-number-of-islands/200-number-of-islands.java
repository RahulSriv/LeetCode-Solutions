class Solution {
    public int getIsland(int i, int j, char[][] grid){
        int m=grid.length, n=grid[0].length;
        if(i<0 || i>m-1 || j<0 || j>n-1 || grid[i][j]=='0')
            return 0;
        grid[i][j]='0';
        return 1+getIsland(i+1,j,grid)+getIsland(i-1,j,grid)+getIsland(i,j-1,grid)+getIsland(i,j+1,grid);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length, n=grid[0].length, ct=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(getIsland(i,j,grid)>0)
                    ct++;
            }
        }
        return ct;
    }
}