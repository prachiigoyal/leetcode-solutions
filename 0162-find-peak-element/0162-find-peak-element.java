class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if (((i-1<0) || (i-1>=0 && nums[i-1]<nums[i])) && 
                    ((i+1==nums.length) || (i+1<nums.length && nums[i+1]<nums[i]))){
                return i;
            }
        }
        return 0;
    }
}