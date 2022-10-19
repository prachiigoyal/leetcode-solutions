class Solution {
    public int pivotIndex(int[] nums) {
        int[] rightSum=new int[nums.length];
        rightSum[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            rightSum[i]=nums[i+1]+rightSum[i+1];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
           if(ls==rightSum[i]){
               return i;
           } 
            ls+=nums[i];
        }
        return -1;
    }
}