package ArrayMedium;
//Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class StockBuyAndSell {

    // brute force approach not work for all
    int findProfit(int[] arr) {
        int buy =arr[0];
        int buyday=0;
        int sell = 0;
        for (int i=0;i<arr.length;i++){
            if(buy>arr[i]){
                buy=arr[i];
                buyday=i;
            }
        }
        for(int j=buyday;j<arr.length;j++){
            if(sell<arr[j]){
                sell=arr[j];
            }
        }
        if(sell>buy){
            return sell-buy;
        }
      return 0;
    }

    int findProfitUseInnerLoop(int[] arr){
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int profit=arr[j]-arr[i];

                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }

    int findProfitUseOneLoop(int[] arr){
        int maxPrice=0;
        int min=Integer.MAX_VALUE;
        for(int price:arr){
            if(price<min){
                min=price;
            }else{
                maxPrice=Math.max(maxPrice,price-min);
            }
        }
        return maxPrice;
    }

    public static void main(String[] args){
        StockBuyAndSell obj=new StockBuyAndSell();
        int[] arr={7,1,5,3,6,4};
        System.out.println("Brute force  approach the profit :"+obj.findProfit(arr));
        System.out.println("Better using innerloop  approach the profit :"+obj.findProfitUseInnerLoop(arr));
        System.out.println("optimal using one loop approach the profit :"+obj.findProfitUseOneLoop(arr));

    }
}
