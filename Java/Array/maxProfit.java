class Solution {
    public static void maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int profit;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                profit=prices[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        maxProfit(prices);
    }
}