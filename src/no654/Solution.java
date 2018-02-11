package no654;

/**
 * @author ZCC
 * @date 2018/1/17
 * @description
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return getMaxNode(nums, 0, nums.length);
    }

    private TreeNode getMaxNode(int[] nums, int start, int end) {
        if(start == end) {
            return null;
        }
        // 最大数值的索引
        int maxIndex = start;
        for(int i = start + 1; i < end; i++) {
            if(nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        // 最大数值的节点
        TreeNode maxNode = new TreeNode(nums[maxIndex]);
        maxNode.left = getMaxNode(nums, start, maxIndex);
        maxNode.right = getMaxNode(nums, maxIndex + 1, end);
        return maxNode;
    }
}


class TreeNode {
    private int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
