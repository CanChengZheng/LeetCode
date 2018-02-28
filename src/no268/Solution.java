package no268;

/**
 * @author ZCC
 * @date 2018/2/28
 * @description
 */
public class Solution {
    public int missingNumber(int[] nums) {
//        return solution1(nums);
        return solution2(nums);
    }

    private int solution2(int[] nums) {
        int sum = 0;
        for(int i = 0; i <= nums.length;i++) {
            sum += i;
        }
        for(int i : nums) {
            sum -= i;
        }
        return sum;
    }

    private int solution1(int[] nums) {
        int[] flag = new int[nums.length + 1];
        for(int i:nums) {
            flag[i] = 1;
        }
        for(int i = 0 ; i < flag.length; i++) {
            if(flag[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
