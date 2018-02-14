package no198;

/**
 * @author ZCC
 * @date 2018/2/6
 * @description
 */
class Solution {
    public int rob(int[] nums) {
//        return solution1(nums);
        return solution2(nums);
    }

    /**
     * 非递归算法
     */
    private int solution2(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        int a = nums[0];
        int b = nums[0] > nums[1] ? nums[0] : nums[1];
        for(int i = 2; i< nums.length; i++) {
            int tmp = b;
            b = a + nums[i] > b? a + nums[i] : b;
            a = tmp;
        }
        return b;
    }

    /**
     * 递归算法
     */
    private int solution1(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[] tmp = new int[nums.length];
        for(int i = 0 ; i< tmp.length; i++) {
            tmp[i] = -1;
        }
        tmp[0] = nums[0];
        if(nums.length > 1)tmp[1] = nums[0] > nums[1]? nums[0]: nums[1];

        return robbing(nums.length - 1, nums, tmp);
    }

    private int robbing(int n, int[] nums, int[] tmp) {
        if(n < 0) {
            return 0;
        } else if(n == 0 || n == 1) {
            return tmp[n];
        }else {
            if(tmp[n - 1] == -1) {
                tmp[n - 1] = robbing(n - 1, nums, tmp);
            }
            if(tmp[n - 2] == -1) {
                tmp[n - 2] = robbing(n - 2, nums, tmp);
            }
            int a = tmp[n - 1];
            int b = tmp[n - 2] + nums[n];
            tmp[n] = a > b ? a : b;
            return tmp[n];
        }
    }
}
