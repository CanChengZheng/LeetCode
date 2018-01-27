package no3;

/**
 * @author ZCC
 * @date 2018/1/28
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"abcabcbb", "pwwkew", "bbbbb"};
        for (String str : strs) {
            int length = solution.lengthOfLongestSubstring(str);
            System.out.println(length);
        }
    }
}
