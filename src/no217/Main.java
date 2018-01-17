package no217;

/**
 * @author ZCC
 * @date 2018/1/17
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{3, 6, 1, 0}, {1, 2, 3, 4}, {0, 0, 0, 1}};
        for (int[] array : nums) {
            System.out.println(solution.containsDuplicate(array));
        }
    }
}
