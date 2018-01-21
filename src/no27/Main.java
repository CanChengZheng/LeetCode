package no27;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{3,2,2,3}, {1, 2, 3, 4}, {0, 0, 0, 1}};
        int[] num = {3, 3, 0};
        for (int i = 0; i< nums.length;i++) {
            System.out.println(solution.removeElement(nums[i], num[i]));
        }
    }
}
