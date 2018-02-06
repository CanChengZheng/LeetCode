package no179;

import java.math.BigInteger;
/**
 * @author ZCC
 * @date 2018/2/6
 * @description
 */
class Solution {
    public String largestNumber(int[] nums) {
        // 将数据进行排序
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < nums.length ; j++) {
                if(!compare(nums[index], nums[j])) {
                    index = j;
                }
            }
            if(index != i) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        if(nums[0] == 0) {
            return 0 + "";
        }
        // 生成字符串
        StringBuilder str = new StringBuilder();
        for(int e : nums) {
            str.append(e);
        }
        return str.toString();
    }

    /**
     * 如果ab >= ba，返回true
     * 如果ab < ba，返回false
     */
    private boolean compare(int a, int b) {
        BigInteger ab = new BigInteger(a + "" + b);
        BigInteger ba = new BigInteger(b + "" + a);
        return ab.compareTo(ba) >= 0;
    }
}
