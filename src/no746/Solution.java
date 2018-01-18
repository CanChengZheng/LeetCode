package no746;

/**
 * @author ZCC
 * @date 2018/1/18
 * @description 动态规划
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        int result = Math.min(a, b);

        for (int i = 2; i <= cost.length; i++) {
            int c = i == cost.length? 0: cost[i];
            result = Math.min(a + c, b + c);
            a = b;
            b = result;
        }

        return result;
    }
}
