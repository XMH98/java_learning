package LeetCode;

/**
 * Author: 徐明皓
 * Date: 2021-10-18 21:04
 * Description: <14. 最长公共前缀>
 */
public class Demo2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[2];
        strs[0] = "ab";
        strs[1] = "a";
        System.out.println(solution.longestCommonPrefix(strs));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder preStr = new StringBuilder();
            for (int i = 0; i < strs[0].length(); i++) {
                for (String str : strs) {
                    if (str.length()==i || str.charAt(i) != strs[0].charAt(i)) {
                        return String.valueOf(preStr);
                    }
                }
                preStr.append(strs[0].charAt(i));
            }
            return String.valueOf(preStr);
        }
    }
}
