public class company_stock {
    public static int buyandsellstock(int prices[]){
     int buyprice=Integer.MAX_VALUE;
     int maxprofit=0;
     for (int i = 0; i < prices.length; i++) {
        if (buyprice<prices[i]) {//proft
            int profit=prices[i]-buyprice;//today profit
            maxprofit=Math.max(maxprofit, profit);
            
        }
        else{
            buyprice=prices[i];
        }
     }
     return maxprofit;
    }
    public  static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
       System.out.println("max profit="+buyandsellstock(prices)); 
    }
        
}
