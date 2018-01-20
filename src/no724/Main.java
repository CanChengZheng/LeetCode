package no724;

/**
 * @author ZCC
 * @date 2018/1/19
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1, 7, 3, 6, 5, 6}, {1, 2, 3}, {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}};
        for (int[] array : nums) {
            System.out.println(solution.pivotIndex(array));
        }
    }
}
