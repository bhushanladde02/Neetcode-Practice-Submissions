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
                    //System.out.println(j+" "+ k);
                    //System.out.println("*****");
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
   /* public boolean chooseNumber(int[][] boardInt, int i, int j){
        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> col = new HashSet<Integer>();
        Set<Integer> box = new HashSet<Integer>();

        for(int k = 0 ; k < 9 ; k++){
            if(row.contains(boardInt[i][k]))
                return false;
            if(boardInt[i][k]>0) row.add(boardInt[i][k]);
           
        }

        for(int k = 0 ; k < 9 ; k++){
            if(col.contains(boardInt[i][k]))
                return false;
            if(boardInt[k][j]>0) col.add(boardInt[k][j]);
        }
      
      
        int indexBoxRow = (i/3);
        int startBoxRowIndex = (indexBoxRow * 3);
        int endBoxRowIndex = startBoxRowIndex + 3;

        int indexBoxCol = (j/3);
        int startBoxColIndex = (indexBoxCol * 3);
        int endBoxColIndex = startBoxColIndex + 3;
        

        for(int b = startBoxRowIndex; b < endBoxRowIndex; b++){
            for(int c = startBoxColIndex; c<endBoxColIndex; c++){
                if(box.contains(boardInt[b][c]))
                    return false;
                box.add(boardInt[b][c]);
            }
        }
       
        //for(int number = 1; number<=9; number++){
          //  if(!row.contains(number) && !col.contains(number) && !box.contains(number)){
            //    boardInt[i][j] = number;
            //}
        //}

        return true;

    }*/
}
