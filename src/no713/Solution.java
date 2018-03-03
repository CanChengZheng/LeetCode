package no713;

/**
 * @author ZCC
 * @date 2018/3/3
 * @description
 */
public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int length = nums.length;
        int count = 0;
        int prev = 0, back = 0;
        int product = 1;
        do{
            product *= nums[back];
            if (product >= k) {
                while (product >= k) {
                    product /= nums[prev++];
                }
            }
            count += back - prev + 1;
        } while (++back < length);
        return count;
    }
}
