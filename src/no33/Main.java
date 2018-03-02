package no33;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,3}};
        int[] num = {3};
        int[] target = {1};
        for (int i = 0; i< nums.length;i++) {
            int result = solution.search(nums[i], num[i]);
            String str = String.format("result: %s\ttarget: %s\tcompare: %b", result, target[i], result == target[i]);
            System.out.println(str);
        }
    }
}
