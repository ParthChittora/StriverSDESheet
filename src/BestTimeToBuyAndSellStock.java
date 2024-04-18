public class BestTimeToBuyAndSellStock {
    // public int maxProfit(int[] prices) {

    //     int min =prices[0];
    //     int maxDiff= 0;
    //     int diff=Integer.MIN_VALUE;
    //     for(int i = 1 ; i < prices.length;i++){
    //         if(prices[i]<min){
    //             min = prices[i];
    //         }
    //         else if(prices[i]>min){
    //             diff=prices[i]-min;
    //         }
    //         if(diff>maxDiff){
    //             maxDiff=diff;
    //         }
    //     }
    //     return maxDiff;
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;


        // TLE

        // int maxDiff = 0;
        // int diff =0 ;
        // for(int i =0 ; i<prices.length;i++){
        //     for(int j =i+1 ; j<prices.length;j++){
        //         if(prices[j]<prices[i]){
        //             continue;
        //         }
        //         diff = prices[j] -prices[i];
        //         if(diff>maxDiff){
        //             maxDiff = diff;
        //         }
        //     }
        // }
        // return maxDiff;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4};
        System.out.println(maxProfit(arr));
    }
}
