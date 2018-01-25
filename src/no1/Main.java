package no1;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{2, 7, 11, 15}, {3, 2, 4}, {-1, -2, -3, -4, -5}};
        int[] num = {9, 6, -8};
        for (int i = 0; i < nums.length; i++) {
            int[] indices = solution.twoSum(nums[i], num[i]);
            System.out.println(String.format("[%d, %d]", indices[0], indices[1]));
        }
    }
}
