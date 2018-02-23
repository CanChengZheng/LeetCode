package no124;

/**
 * @author ZCC
 * @date 2018/2/23
 * @description
 */
public class Solution {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper2(root);
        return max;
    }

    private int helper2(TreeNode root) {
        if (root == null) return 0;
        int left = Integer.max(0, helper2(root.left));
        int right = Integer.max(0, helper2(root.right));
        max = Math.max(max, root.val + left + right);
        return root.val + (left > right ? left : right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}