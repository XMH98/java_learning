package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-11-03 23:01
 * Description: <118. 杨辉三角>
 */
public class Demo118 {

    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> yang = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j - 1 < 0 || j == i) {
                        list.add(1);
                    } else {
                        list.add(yang.get(i-1).get(j-1) + yang.get(i-1).get(j));
                    }
                }
                yang.add(list);
            }
            return yang;
        }
    }
}
