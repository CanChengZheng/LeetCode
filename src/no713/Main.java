package no713;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZCC
 * @date 2018/1/19
 * @description
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Solution solution = new Solution();
        int[][] nums = {{10, 5, 2, 6}, {10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3},
                {10, 2, 2, 5, 4, 4, 4, 3, 7, 7}};
        int[] k = {100, 19, 289};
        int[] target = {8, 18, 31};
        for (int i = 0; i < nums.length; i++) {
            int result = solution.numSubarrayProductLessThanK(nums[i], k[i]);
            String str = String.format("result: %s\ttarget: %s\tcompare: %b", result, target[i], result == target[i]);
            System.out.println(str);
        }
    }
}
