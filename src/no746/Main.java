package no746;

/**
 * @author ZCC
 * @date 2018/1/17
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{10, 15, 20}, {0, 1, 2, 2}, {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}};
        for (int[] array : nums) {
            System.out.println(solution.minCostClimbingStairs(array));
        }
    }
}
