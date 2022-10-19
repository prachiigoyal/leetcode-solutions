class Solution {
    public void sortColors(int[] nums) {
        //0 to j-1 -> 0s
        //j to i-1 -> 1s
        //k+1 to end -> 2s
        int j=0,i=0,k=nums.length-1;
        while(i<=k){
            int val=nums[i];
            if(val==0){
                //swap with j
                swap(nums,i,j);
                i++;
                j++;
            }else if(val==1){
                i++;
            }else{
                //swap with k
                swap(nums,i,k);
                k--;
            }
        }
    }
    public void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}