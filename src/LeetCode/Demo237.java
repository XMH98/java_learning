package LeetCode;

/**
 * Author: 徐明皓
 * Date: 2021-11-02 22:00
 * Description: <237. 删除链表中的节点>
 */
public class Demo237 {

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
