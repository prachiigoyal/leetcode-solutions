class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=1;i<=max;i++){
            if(set.contains(i)==false){
                return i;
            }
        }
        return max+1;
    }
}