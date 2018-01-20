package no724;

/**
 * @author ZCC
 * @date 2018/1/19
 * @description
 */
public class Solution {
    public int pivotIndex(int[] nums) {
//        return solution1(nums);
        return solution2(nums);
    }

    private int solution1(int[] nums) {
        int length = nums.length;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i < length; i++) {
            sumRight += nums[i];
        }

        for (int i = 0; i < length; i++) {
            if (sumLeft == sumRight) {
                return i;
            }
            if (i == length - 1) {
                return -1;
            } else {
                sumLeft += nums[i];
                sumRight -= nums[i + 1];
            }
        }
        return -1;
    }

    private int solution2(int[] nums) {
        if(nums.length <= 0) {
            return -1;
        }
        int length = nums.length;
        int[] sum = new int[length];
        sum[0] = nums[0];
        for (int i = 1; i < length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        for (int i = 0; i < length; i++) {
            if((sum[i] - nums[i]) == (sum[length - 1] - sum[i])) {
                return i;
            }
        }
        return -1;
    }
}
