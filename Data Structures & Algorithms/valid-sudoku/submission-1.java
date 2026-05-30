class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] boardInt = new int[board.length][board[0].length];

        Set[] rows = new Set[9];
        Set[] cols = new Set[9];
        Set[] boxs = new Set[9];

        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[i].length; j++){
                if(board[i][j]=='.')
                    boardInt[i][j] = -1;
                else
                    boardInt[i][j] = board[i][j]-'0';
            }
        }
        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
            boxs[i] = new HashSet<Integer>();
        }
        for(int i = 0 ; i < boardInt.length; i++){
            for(int j = 0 ; j < boardInt[i].length; j++){
                if(boardInt[i][j]>0){
                    boolean present = false;
                    int indexBoxRow = (i/3);
                    int indexBoxCol = (j/3);
                    int k = (indexBoxRow*3) + (indexBoxCol);
                    if(rows[i].contains(boardInt[i][j]) || cols[j].contains(boardInt[i][j]) || boxs[k].contains(boardInt[i][j])){
                        return false;
                    }
                    rows[i].add(boardInt[i][j]);
                    cols[j].add(boardInt[i][j]);
                    boxs[k].add(boardInt[i][j]);
                }
            }
        }

         return true;
    }
  
}
