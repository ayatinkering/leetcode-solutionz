/*
// Definition for a QuadTree node.
class Node {
    
    THIS CONSTRUCTOR FOR WHEN IT IS A LEAF, SO NO NEED FOR TL TR BL BR
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    

    THIS CONSTR FOR WHEN ITS NOT A LEAF, SO HAVE TO INITISLAISE ALL OTHER VALUES
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return dfs(grid,grid.length,0,0);
    }
    public Node dfs(int[][] grid, int n, int r,int c){ //size, starting row,col (8,0,0)

        //BASE CASE checking if all 1s or all 0s, so LEAF NODE. can stop recursion 
        boolean allSame=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (grid[r][c]!=grid[r+i][c+j]){
                    allSame=false;
                    break;
                }
            }
        }
        if(allSame){
            return new Node(grid[r][c]==1,true); //IS LEAF NODE
        }

        int mid=n/2;
        Node topLeft=dfs(grid,mid,r,c); //(4,0,0)
        Node topRight=dfs(grid,mid,r,c+mid); //(4,0,4)
        Node bottomLeft=dfs(grid,mid,r+mid,c); //(4,4,0)
        Node bottomRight=dfs(grid,mid,r+mid,c+mid); //(4,4,4)

        return new Node(false, false,topLeft,topRight,bottomLeft,bottomRight);

    }
}