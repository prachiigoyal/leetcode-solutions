class Solution {
    public int firstMissingPositive(int[] nums) {
        //mark elements as 1 if they are out of ranges and maintain presence of 1
        boolean one=false;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(ele==1){
                one=true;
            }
            if(ele<1 || ele>nums.length){
                nums[i]=1;
            }
        }
        if(one==false) return 1;
        //map the index and make it negative
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            nums[index-1]=-Math.abs(nums[index-1]);
        }
        // positive number -> index+1 is missing
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) return i+1;
        }
        return nums.length+1;
    }
}