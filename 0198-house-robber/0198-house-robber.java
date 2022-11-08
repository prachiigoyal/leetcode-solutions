class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return helper(nums,0,false,dp);
    }
    public int helper(int[] nums, int idx, boolean isLastIncluded,int[][] dp){
        if(idx==nums.length){
            return 0;
        }
        if(dp[idx][isLastIncluded?0:1]!=-1){
            return dp[idx][isLastIncluded?0:1];
        }
        if(isLastIncluded){
            return dp[idx][isLastIncluded?0:1] = helper(nums,idx+1,false,dp);
        }
        else{
            return dp[idx][isLastIncluded?0:1] = Math.max(helper(nums,idx+1,false,dp),nums[idx]+helper(nums,idx+1,true,dp));
        }
    }
}