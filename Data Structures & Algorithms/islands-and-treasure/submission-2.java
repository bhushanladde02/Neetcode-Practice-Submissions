class Solution {
    public void islandsAndTreasure(int[][] grid) {
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    boolean[][] visited = new boolean[grid.length][grid[i].length];
                    islandsAndTreasure( grid,  i ,  j, 0, visited);
                }
            }
        }
    }
    public void islandsAndTreasure(int[][] grid, int i , int j, int distance, boolean[][] visited ) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==-1|| visited[i][j] || grid[i][j]<distance){
            return;
        }
        //visited[i][j] = true;
        grid[i][j] = Math.min(grid[i][j], distance);
        islandsAndTreasure(grid, i+1 , j,  distance+1, visited);
        islandsAndTreasure(grid, i-1 , j,  distance+1, visited);
        islandsAndTreasure(grid, i , j-1,  distance+1, visited);
        islandsAndTreasure(grid, i , j+1,  distance+1, visited);
    }
    
}
