package no198;

import java.util.Locale;

/**
 * @author ZCC
 * @date 2018/2/6
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{}, {1,1,2,1}, {3, 30, 34, 5, 9}};
        int[] target = {0, 3, 9534330};
        for (int i = 0; i< nums.length;i++) {
            int result = solution.rob(nums[i]);
            String str = String.format(Locale.CHINA, "result: %s\ttarget: %s\tcompare: %b", result, target[i], result == target[i]);
            System.out.println(str);
        }
    }
}
