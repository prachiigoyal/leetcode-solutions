class Solution {
    public int maxProfit(int[] prices) {
       int minPurchase=prices[0],maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-minPurchase;
            if(diff>maxProfit){
                maxProfit=diff;
            }
            if(prices[i]<minPurchase){
                minPurchase=prices[i];
            }
        }
        return maxProfit;
    }
}