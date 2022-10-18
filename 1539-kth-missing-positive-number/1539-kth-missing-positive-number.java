class Solution {
    public int findKthPositive(int[] arr, int k) {
       int max=arr[arr.length-1];
        List<Integer> missingNumbers=new ArrayList<Integer>();
        int ind=0;
        for(int i=1;i<max;i++){
            if(arr[ind]==i){
                ind++;
            }else{
                missingNumbers.add(i);
            }
        }
        for(int num:missingNumbers){
            System.out.print(num+" ");
        }
        if(k<=missingNumbers.size()){
            return missingNumbers.get(k-1);
        }else{
            return max+k-missingNumbers.size();
        }
    }
}