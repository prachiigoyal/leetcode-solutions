class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(curr<0){
                curr=nums[i];
            }else{
                curr+=nums[i];
            }
            if(curr>res){
                res=curr;
            }
        }
        return res;
    }
}