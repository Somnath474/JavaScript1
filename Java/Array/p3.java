public class p3 {
    public static void pro(int prices[]) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.println(maxprofit);

        
    }
    public static void main(String[] args) {
        int prices[]={7,2,6,9,4,3};
        pro(prices);
    }
}
