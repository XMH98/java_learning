package LeetCode;

import java.util.HashMap;

/**
 * Author: 徐明皓
 * Date: 2021-11-01 21:13
 * Description: <575. 分糖果>
 */
public class Demo575 {

    class Solution {
        public int distributeCandies(int[] candyType) {
            HashMap<Integer,Integer> candyMap = new HashMap<>();
            for (Integer candy:candyType){
                if (!candyMap.containsKey(candy)){
                    candyMap.put(candy,candy);
                }
            }
            return Math.min(candyMap.size(), candyType.length / 2);
        }
    }
}
