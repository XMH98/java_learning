package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * Author: 徐明皓
 * Date: 2021-10-31 20:45
 * Description: <217. 存在重复元素>
 */
public class Demo217 {

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer,Integer> numMap = new HashMap<>();
            for (Integer num:nums){
                if (!numMap.containsKey(num)){
                    numMap.put(num,num);
                }else {
                    return true;
                }
            }
            return false;
        }
    }
}
