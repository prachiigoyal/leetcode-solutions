class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reversedNumber=reverseNumber(x);
        return x==reversedNumber;
    }
    public int reverseNumber(int x){
        int num=0;
        while(x!=0){
            int digit=x%10;
            num=num*10+digit;
            x=x/10;
        }
        return num;
    }
}