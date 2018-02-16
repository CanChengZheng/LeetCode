package no102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZCC
 * @date 2018/2/17
 * @description
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        switch (2) {
            case 1:
                return solution1(root);
            case 2:
                return solution2(root);
            default:
                return null;
        }
    }

    /**
     * BFS
     */
    private List<List<Integer>> solution1(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> intList = new ArrayList<>();
            while (levelSize-- > 0) {
                TreeNode tmp = queue.poll();
                intList.add(tmp.val);
                if (tmp.left != null) queue.offer(tmp.left);
                if (tmp.right != null) queue.offer(tmp.right);
            }
            list.add(intList);
        }
        return list;
    }

    /**
     * DFS
     */
    private List<List<Integer>> solution2(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelHelper(list, root, 0);
        return list;
    }

    private void levelHelper(List<List<Integer>> list, TreeNode node, int height) {
        if (node == null) {
            return;
        }
        if (height >= list.size()) {
            List<Integer> newList = new ArrayList<>();
            newList.add(node.val);
            list.add(newList);
        } else {
            list.get(height).add(node.val);
        }
        if (node.left != null) levelHelper(list, node.left, height + 1);
        if (node.right != null) levelHelper(list, node.right, height + 1);
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
