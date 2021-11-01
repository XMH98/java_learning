package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 徐明皓
 * Date: 2021-10-31 20:08
 * Description: <500. 键盘行>
 */
public class Demo500 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(solution.findWords(words));
    }

    static class Solution {
        public String[] findWords(String[] words) {
            int j = 0;
            for (int i = 0; i < words.length; i++) {
                if (isOneLine(words[i])) {
                    words[j++] = words[i];
                }
            }
            String[] newWords = new String[j];
            for (int i=0;i<j;i++){
                newWords[i]=words[i];
            }
            return newWords;
        }

        public Boolean isOneLine(String word) {
            Map<Character, Integer> line = new HashMap<>();
            line.put('q', 1);
            line.put('w', 1);
            line.put('e', 1);
            line.put('r', 1);
            line.put('t', 1);
            line.put('y', 1);
            line.put('u', 1);
            line.put('i', 1);
            line.put('o', 1);
            line.put('p', 1);
            line.put('a', 2);
            line.put('s', 2);
            line.put('d', 2);
            line.put('f', 2);
            line.put('g', 2);
            line.put('h', 2);
            line.put('j', 2);
            line.put('k', 2);
            line.put('l', 2);
            line.put('z', 3);
            line.put('x', 3);
            line.put('c', 3);
            line.put('v', 3);
            line.put('b', 3);
            line.put('n', 3);
            line.put('m', 3);

            for (int i = 0; i < word.length() - 1; i++) {
                if (line.get(Character.toLowerCase(word.charAt(i)))!=line.get(Character.toLowerCase(word.charAt(i+1)))) {
                    return false;
                }
            }
            return true;
        }
    }

}
