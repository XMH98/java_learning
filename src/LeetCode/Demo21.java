package LeetCode;

/**
 * Author: 徐明皓
 * Date: 2021-10-19 20:54
 * Description: <21. 合并两个有序链表>
 */
public class Demo21 {

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1==null){
                return l2;
            }else if(l2==null){
                return l1;
            }else if (l1.val< l2.val){
                l1.next = mergeTwoLists(l1.next,l2);
                return l1;
            }else {
                l2.next = mergeTwoLists(l1,l2.next);
                return l2;
            }
        }
    }


}
