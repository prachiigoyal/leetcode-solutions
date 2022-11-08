class Solution {
    public boolean stoneGame(int[] piles) {
        int sum=0;
        for(int val:piles){
            sum+=val;
        }
       int[][] dp=new int[piles.length][piles.length];
        
        for(int gap=0;gap<piles.length;gap++){
            for(int i=0,j=gap;j<piles.length;i++,j++){
                if(gap==0){
                    dp[i][j]=piles[i];
                }else if(gap==1){
                    dp[i][j]=Math.max(piles[i],piles[j]);
                }else{
                    dp[i][j]=Math.max(piles[i]+Math.min(dp[i+2][j],dp[i+1][j-1]),piles[j]+Math.min(dp[i+1][j-1],dp[i][j-2]));
                }
            }
        }
        return dp[0][piles.length-1]>sum-dp[0][piles.length-1];
    }
}