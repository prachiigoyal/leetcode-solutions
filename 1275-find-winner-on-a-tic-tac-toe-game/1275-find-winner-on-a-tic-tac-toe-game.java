class Solution {
    public String tictactoe(int[][] moves) {
        int[][] matrix=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=-1;
            }
        }
        for(int i=0;i<moves.length;i++){
            matrix[moves[i][0]][moves[i][1]]=(i+1)%2;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return winner(matrix, moves);
    }
    public String winner(int[][] matrix, int[][] moves){
        //check all rows
        for(int i=0;i<3;i++){//row
            boolean allZeroes=true;
            boolean allOnes=true;
            for(int j=0;j<3;j++){
                if(matrix[i][j]==0){
                    allOnes=false;
                }else if(matrix[i][j]==1){
                    allZeroes=false;
                }else{
                    allOnes=false;
                    allZeroes=false;
                }
            }
            if(allOnes){
                return "A";
            }else if(allZeroes){
                return "B";
            }
        }
        //check all cols
        for(int j=0;j<3;j++){//row
            boolean allZeroes=true;
            boolean allOnes=true;
            for(int i=0;i<3;i++){
                if(matrix[i][j]==0){
                    allOnes=false;
                }else if(matrix[i][j]==1){
                    allZeroes=false;
                }else{
                    allOnes=false;
                    allZeroes=false;
                }
            }
            if(allOnes){
                return "A";
            }else if(allZeroes){
                return "B";
            }
        }
        //check 1st diagonal
        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]){
            if(matrix[0][0]==0){
                return "B";
            }else if(matrix[0][0]==1){
                return "A";
            }
        }
        //check 2nd diagonal
        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]){
            if(matrix[0][2]==0){
                return "B";
            }else if(matrix[0][2]==1){
                return "A";
            }
        }
        if(moves.length<9){
            return "Pending";
        }else{
            return "Draw";
        }
    }
}