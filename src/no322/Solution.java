package no322;

/**
 * @author ZCC
 * @date 2018/2/25
 * @description
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        sortArray(coins);
        return helper(coins, coins.length - 1, amount);
    }

    private int helper(int[] coins, int index, int amount) {
        if (index < 0) {
            return -1;
        }
        int num = amount / coins[index];
        if (amount % coins[index] == 0) {
            return num;
        }
        int minNum = num;
        int nextNum = Integer.MAX_VALUE;
        while (num >= 0) {
            int tmp = helper(coins, index - 1, amount - num * coins[index]);
            if (tmp != -1 && tmp < nextNum) {
                nextNum = tmp;
                minNum = num;
            }
            num--;
        }
        return nextNum == Integer.MAX_VALUE? -1:nextNum + minNum;
    }

    // 将数组从小到大进行排序
    private void sortArray(int[] coins) {
        for (int i = 0; i < coins.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < coins.length; j++) {
                if (coins[j] < coins[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int tmp = coins[i];
                coins[i] = coins[index];
                coins[index] = tmp;
            }
        }
    }
}
