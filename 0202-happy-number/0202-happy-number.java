class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1){
            int current=n;
            int sum=0;
            while(current!=0){
                int digit=current%10;
                sum+=digit*digit;
                current=current/10;
            }
            if(seen.contains(sum)){
                return false;
            }else{
                seen.add(sum);
            }
            n=sum;
        }
        return true;
    }
}