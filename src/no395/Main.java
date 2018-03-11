package no395;

/**
 * @author ZCC
 * @date 2018/3/11
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = {"aaabb", "ababbc"};
        int[] k = {3, 2};
        int[] target = {3, 5};

        for(int i = 0 ; i < s.length; i++) {
            int result = solution.longestSubstring(s[i], k[i]);
            System.out.println(String.format("result：%d\ttarget：%d\t是否正确：%b", target[i], target[i], target[i] == result));
        }
    }
}
