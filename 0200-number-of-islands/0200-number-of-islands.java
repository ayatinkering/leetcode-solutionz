class Solution {
    public int numIslands(char[][] grid) {
        int isl=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    isl++;
                    dfs(grid,r,c);
                }
            }
        }
        return isl;
    }
    public void dfs(char[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
            return; //OUTSIDE GRID, STOP
        if(grid[r][c]=='0')
            return; //WATER or ALR PAINTED(counted)
        
        grid[r][c]='0'; //mark as painted

        dfs(grid,r-1,c); //go up
        dfs(grid,r+1,c); //go down
        dfs(grid,r,c-1); //go left
        dfs(grid,r,c+1); //go right
    }
}