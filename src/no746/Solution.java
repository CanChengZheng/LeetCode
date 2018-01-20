package no746;

/**
 * @author ZCC
 * @date 2018/1/18
 * @description TODO
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length + 1];

        result[0] = cost[0];
        result[1] = cost[1];
        for(int i = 2; i <= cost.length; i++) {
            int c = cost.length == i? 0 : cost[i];
            int a = c + result[i - 2];
            int b = c + result[i - 1];
            result[i] = a <= b ? a:b;
        }

        return result[cost.length];
    }
}
