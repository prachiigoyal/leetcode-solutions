class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1))
                map.put(nums[i],false);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==true){
                int count=1,val=nums[i];
                while(map.containsKey(val+1)){
                    val=val+1;
                    count++;
                }
                res=Math.max(count,res);
            }
        }
        return res;
    }
}