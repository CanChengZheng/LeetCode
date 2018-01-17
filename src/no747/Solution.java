package no747;

/**
 * @author ZCC
 * @date 2018/1/16
 * @description 两次变量数组
 * 1. 第一次获取最大值
 * 2. 第二次遍历数组是否存在两倍大于最大值的数
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[index]) {
                index = i;
            }
        }

        for(int i = 0; i< nums.length; i++) {
            if(i != index && nums[i] * 2 > nums[index]) {
                return -1;
            }
        }
        return index;
    }
}
