package no24;

/**
 * @author ZCC
 * @date 2018/2/24
 * @description
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        return solution1(head);
    }

    private ListNode solution1(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode helper = head.next;
        head.next = solution1(helper.next);
        helper.next = head;
        return helper;
    }

    private ListNode solution2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode flagNode = new ListNode(0); // 上一个结点
        flagNode.next = head;
        ListNode prev = flagNode;
        ListNode ptr1 = head; // 前一个结点
        ListNode ptr2 = head.next; // 后一个结点

        do {
            // 交换
            ptr1.next = ptr2.next;
            ptr2.next = ptr1;
            prev.next = ptr2;
            // 后移
            prev = ptr1;
            if (ptr1.next == null || ptr1.next.next == null) break;
            ptr1 = ptr1.next;
            ptr2 = ptr1.next;
        } while (true);
        return flagNode.next;
    }


}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
