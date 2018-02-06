package no179;

import java.util.Locale;

/**
 * @author ZCC
 * @date 2018/2/6
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1}, {0, 0}, {3, 30, 34, 5, 9}};
        String[] target = {"1", "0", "9534330"};
        for (int i = 0; i< nums.length;i++) {
            String result = solution.largestNumber(nums[i]);
            String str = String.format(Locale.CHINA, "result: %s\ttarget: %s\tcompare: %b", result, target[i], result.equals(target[i]));
            System.out.println(str);
        }
    }
}
