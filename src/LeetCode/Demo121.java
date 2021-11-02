package LeetCode;

/**
 * Author: 徐明皓
 * Date: 2021-11-02 20:59
 * Description: <121. 买卖股票的最佳时机>
 */
public class Demo121 {

    class Solution {
        public int maxProfit(int[] prices) {
            int count=0;
            int min=prices[0];
            for(int i=0;i<prices.length;i++){
                if (min>prices[i]){
                    min=Math.min(min,prices[i]);
                }else {
                    count=Math.max(count,prices[i]-min);
                }
            }
            return count;
        }
    }
}
