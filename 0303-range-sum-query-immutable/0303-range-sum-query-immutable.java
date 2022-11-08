class NumArray {
    int[] nums;
    int[] leftSum;
    public NumArray(int[] nums) {
        this.nums=nums; 
        leftSum=new int[nums.length];
        
        int ls=0;
        for(int i=0;i<nums.length;i++){
            ls+=nums[i];
            leftSum[i]=ls;
        }
    }
    
    public int sumRange(int left, int right) {
        return leftSum[right]-((left==0)?0:leftSum[left-1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */