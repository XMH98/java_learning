package LeetCode;


/**
 * Author: 徐明皓
 * Date: 2021-10-18 19:52
 * Description: <13. 罗马数字转整数>
 */
public class Demo13 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("IV"));
    }


    static class Solution {
        public int romanToInt(String s) {
            int count = 0;
            int length = s.length();

            for (int i = 0; i < length; i++) {
                if (i < length - 1 && getValue(s.charAt(i)) < getValue(s.charAt(i+1))) {
                    count += getValue(s.charAt(i+1)) - getValue(s.charAt(i));
                    i++;
                } else {
                    count += getValue(s.charAt(i));
                }
            }

            return count;
        }

        private int getValue(char ch) {
            switch(ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
    }
}
