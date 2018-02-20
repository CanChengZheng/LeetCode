package no647;

/**
 * @author ZCC
 * @date 2018/2/20
 * @description
 */
public class Solution {
    public int countSubstrings(String s) {
//        return solution1(s);
        return solution2(s);
    }

    private int solution1(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += helper(s, i, i);
            count += helper(s, i, i + 1);
        }
        return count;
    }

    private int helper(String s, int prev, int back) {
        int count = 0;
        int length = s.length();
        while (prev >= 0 && back < length && s.charAt(prev) == s.charAt(back)) {
            count++;
            prev--;
            back++;
        }
        return count;
    }

    private int solution2(String s) {
        int count = 0;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = i; j >= 0; j--) {
                dp[j][i] = s.charAt(i) == s.charAt(j) && (i - j < 3 || dp[j + 1][i - 1]);
                if (dp[j][i]) {
                    count++;
                }
            }
        }
        return count;
    }
}
