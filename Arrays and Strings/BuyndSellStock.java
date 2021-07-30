//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//Time complexity: O(n)
//Space complexity: O(1)

public class BuyndSellStock {
  public int maxProfit(int [] prices){
      int minprice = Integer.MAX_VALUE;
      int maxprofit = 0;
      for(int i=0; i<prices.length; i++){
          if(prices[i]<minprice)
          minprice=prices[i];
          else if(prices[i]-minprice > maxprofit)
          maxprofit = prices[i]-minprice;
      }
      return maxprofit;
  }  
}
