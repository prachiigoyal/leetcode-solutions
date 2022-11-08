class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0){
                    dp[i][j]=matrix[i][j];
                }else{
                    int ld=j>0?dp[i-1][j-1]:Integer.MAX_VALUE;
                    int ud=dp[i-1][j];
                    int rd=j<matrix[0].length-1?dp[i-1][j+1]:Integer.MAX_VALUE;
                    
                    dp[i][j]=matrix[i][j]+Math.min(ld,Math.min(ud,rd));
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<matrix[0].length;j++){
            if(dp[matrix.length-1][j]<min){
                min=dp[matrix.length-1][j];
            }
        }
        return min;
    }
}