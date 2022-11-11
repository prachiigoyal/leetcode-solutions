class Solution {
    public void wiggleSort(int[] nums) {
        //sort array
        Arrays.sort(nums);
        //make an extra array 
        int n=nums.length;
        int[] arr=new int[n];
        int i=1,j=n-1;
        while(i<n){
            arr[i]=nums[j];
            j--;
            i+=2;
        }
        i=0;
        while(i<n){
            arr[i]=nums[j];
            j--;
            i+=2;
        }
        
        //fill input array
        for(i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}