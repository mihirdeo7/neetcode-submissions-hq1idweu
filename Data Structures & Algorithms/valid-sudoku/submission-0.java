class Solution {
    public boolean isValidSudoku(char[][] board) {
        // TODO: Write your solution here

        Set<Character> rowSet = null;
        Set<Character> columnSet = null;
        Set<Character> squareSet = null;
        int squareRow,squareColumn;
        //System.out.println(board.length);
        final Character DOT = '.';

        for (int i=0; i < board.length ; i++) {
            rowSet = new HashSet();
            columnSet = new HashSet();
            squareSet = new HashSet();
            for (int j = 0; j < board.length; j++) {
                if(!DOT.equals(board[i][j]) && !rowSet.add(board[i][j])) 
                    return false;
                if(!DOT.equals(board[j][i]) && !columnSet.add(board[j][i])) 
                    return false;
                squareRow = (j/3)+((i/3)*3);
                squareColumn =(j%3)+((i%3)*3);
                //System.out.println("[ "+squareRow+" ,"+squareColumn+" ]");
                if(!DOT.equals(board[squareRow][squareColumn]) && !squareSet.add(board[squareRow][squareColumn])) 
                    return false;
                
            }
            

        }
        

        return true;

    }
}
