package no27;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int num = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[num++] = nums[i];
            }
        }
        return num;
    }
}
