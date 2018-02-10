package no94;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;

        System.out.println(solution.inorderTraversal(root));
        for(Integer e : solution.inorderTraversal(root)) {
            System.out.print(e + " ");
        }
    }
}
