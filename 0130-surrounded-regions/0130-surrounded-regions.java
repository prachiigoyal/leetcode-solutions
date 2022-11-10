class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][board[0].length-1]=='O'){
                dfs(board,i,board[0].length-1);
            }
        }
        for(int j=0;j<board[0].length;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j);
            }
            if(board[board.length-1][j]=='O'){
                dfs(board,board.length-1,j);
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='*'){
                    board[i][j]='O';
                }
            }
        }
    }
    static int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(char[][] board, int row, int col){
        if(row<0 || row>=board.length || col<0 || col>=board[0].length ||
           board[row][col]!='O'){
            return;
        }
        board[row][col]='*';
        for(int k=0;k<4;k++){
            int newRow=row+dirs[k][0];
            int newCol=col+dirs[k][1];
            
            dfs(board,newRow,newCol);
        }
    }
}