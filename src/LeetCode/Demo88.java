package LeetCode;

/**
 * Author: 徐明皓
 * Date: 2021-11-01 20:48
 * Description: <88. 合并两个有序数组>
 */
public class Demo88 {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int total = m+n;
            for (int i=total-1;i>=0;i--){
                if (n==0){
                    break;
                }else if (m==0){
                    while (n!=0){
                        nums1[i]=nums2[n-1];
                        i--;
                        n--;
                    }
                    break;
                }
                if(nums1[m-1]<nums2[n-1]){
                    nums1[i]=nums2[n-1];
                    n--;
                }else {
                    nums1[i]=nums1[m-1];
                    m--;
                }
            }
        }
    }
}
