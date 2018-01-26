package no2;

/**
 * @author ZCC
 * @date 2018/1/26
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{2, 4, 3}, {1}};
        int[][] num = {{5, 6, 4}, {9, 9}};
        for (int i = 0; i < nums.length; i++) {
            ListNode node = solution.addTwoNumbers(genNode(nums[i]), genNode(num[i]));
            printNode(node);
        }
    }

    private static void printNode(ListNode node) {
        System.out.print("[");
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(", ");
            }
            node = node.next;
        }
        System.out.print("] ");
    }

    private static ListNode genNode(int[] nums) {
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        for (int i = 0; i < nums.length; i++) {
            currentNode.val = nums[i];
            if (i + 1 != nums.length) {
                currentNode.next = new ListNode(0);
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
