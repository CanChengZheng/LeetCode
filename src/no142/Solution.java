package no142;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZCC
 * @date 2018/2/10
 * @description
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while(head != null) {
            if(set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}

class ListNode {
    private int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
