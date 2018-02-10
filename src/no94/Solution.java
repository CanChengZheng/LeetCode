package no94;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZCC
 * @date 2018/2/10
 * @description
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return solution1(root);
    }

    private List<Integer> solution1(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }
        if(node.left != null) {
            inorderTraversal(node.left, list);
        }
        list.add(node.val);
        if(node.right != null) {
            inorderTraversal(node.right, list);
        }
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