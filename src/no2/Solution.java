package no2;

/**
 * @author ZCC
 * @date 2018/1/25
 * @description
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);  // 头结点
        ListNode currentNode = head;  // 当前结点
        int carry = 0; // 存储进位值
        while (l1 != null || l2 != null || carry != 0) {
            int tmp = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            carry = tmp / 10;
            currentNode.next = new ListNode(tmp % 10);
            currentNode = currentNode.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return head.next;
    }
}
