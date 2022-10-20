class Solution {
    public double myPow(double x, int n) {
        long newn=n;
        double ans=1;
        if(newn<0) newn=-1*newn;
        while(newn>0){
            if(newn%2==0){
                x=x*x;
                newn/=2;
            }else{
                ans*=x;
                newn-=1;
            }
        }
        if(n<0) return (double)1/(double)ans;
        return ans;
    }
}