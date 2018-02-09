package no141;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZCC
 * @date 2018/2/9
 * @description
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        return solution1(head);
    }

    private boolean solution1(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    private boolean solution2(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
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
