package no7;

/**
 * @author ZCC
 * @date 2018/1/28
 * @description
 */
public class Solution {
    public int reverse(int x) {
        return genNum(x);
    }

    private int genNum(int x) {
        if (x == 0) {
            return 0;
        }
        Boolean isNegative = x < 0;
        int num = 0;
        while (x != 0) {
            int tail = x % 10;
            // 判断是否溢出
            if (!isNegative && num > (Integer.MAX_VALUE - tail) / 10 ||
                    isNegative && num < (Integer.MIN_VALUE - tail) / 10) {
                return 0;
            }
            num = num * 10 + tail;
            x /= 10;
        }
        return num;
    }
}
