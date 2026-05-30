class Solution {
    public void islandsAndTreasure(int[][] grid) {
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    islandsAndTreasure( grid,  i ,  j, 0);
                }
            }
        }
    }
    public void islandsAndTreasure(int[][] grid, int i , int j, int distance) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==-1||  grid[i][j]<distance){
            return;
        }
        grid[i][j] = Math.min(grid[i][j], distance);
        islandsAndTreasure(grid, i+1 , j,  distance+1);
        islandsAndTreasure(grid, i-1 , j,  distance+1);
        islandsAndTreasure(grid, i , j-1,  distance+1);
        islandsAndTreasure(grid, i , j+1,  distance+1);
    }
    
}
