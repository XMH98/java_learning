package LeetCode;

import java.util.Arrays;

/**
 * Author: 徐明皓
 * Date: 2021-11-02 20:30
 * Description: <350. 两个数组的交集 II>
 */
public class Demo350 {

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int m = nums1.length;
            int n = nums2.length;
            int i = 0, j = 0, k = 0;
            while (i != m && j != n) {
                if (nums1[i] == nums2[j]) {
                    nums1[k++] = nums1[i];
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                }
            }
            int[] nums4 = new int[k];
            for (int x=0;x<k;x++){
                nums4[x] = nums1[x];
            }
            return nums4;
        }
    }
}
