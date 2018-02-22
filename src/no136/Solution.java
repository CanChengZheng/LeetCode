package no136;

/**
 * @author ZCC
 * @date 2018/2/20
 * @description
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int e:nums) {
            xor ^= e;
        }
        return xor;
    }
}
