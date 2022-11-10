class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
            }else{
                int top=pq.peek();
                if(top<nums[i]){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
    }
}