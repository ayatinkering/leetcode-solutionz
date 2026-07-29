class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int isl=0;int maxa=0; int area=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    isl++; //new island found
                    area=dfs(grid,r,c);
                    if(area>maxa) maxa=area;
                }
            }
        }
        return maxa;

    }
    public int dfs(int[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
            return 0;
        if(grid[r][c]==0)
            return 0;
        
        grid[r][c]=0; //set to water after visiting

        return 1+dfs(grid,r-1,c)  //new island area itself + neighbours
        + dfs(grid,r+1,c)
        + dfs(grid,r,c-1)
        + dfs(grid,r,c+1);
         
    }
}