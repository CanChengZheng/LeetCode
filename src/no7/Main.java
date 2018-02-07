package no7;

/**
 * @author ZCC
 * @date 2018/1/28
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {123, -321, 0, 1534236469};
        int[] target = {321, -123, 0, 0};
        for (int i = 0; i< nums.length;i++) {
            int result = solution.reverse(nums[i]);
            String str = String.format("result: %s\ttarget: %s\tcompare: %b", result, target[i], result == target[i]);
            System.out.println(str);
        }
    }
}
