package LeetCode;

/**
 * Author: 徐明皓
 * Date: 2021-10-31 21:02
 * Description: <53. 最大子序和>
 */
public class Demo53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int count = 0;
            for (int num:nums){
                count += num;
                if(count<num){
                    count=num;
                }
                max = Math.max(max,count);
            }
            return max;
        }
    }
}
