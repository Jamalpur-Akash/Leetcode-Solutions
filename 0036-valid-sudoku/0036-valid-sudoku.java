class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> setRow;
        HashSet<Character> setCol;
        HashSet<Character> setGrid;

        //row check
        for(int i=0;i<board.length;i++){
            setRow=new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    if(setRow.contains(board[i][j])){
                        return false;
                    }
                    setRow.add(board[i][j]);
                }
            }
        }

        //column check
        for(int j=0;j<9;j++){
            setCol=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                    if(setCol.contains(board[i][j])){
                        return false;
                    }
                    setCol.add(board[i][j]);
                }
            }
        }

        //every 3x3 grid check
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                setGrid=new HashSet<>();

                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]!='.'){
                            if(setGrid.contains(board[i][j])){
                                return false;
                            }
                            setGrid.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
        

    }
}